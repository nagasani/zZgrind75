package com.grind.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QUERY {

	public static List<Long> getNetProfit(List<String> events) 
    {      
        List<Long> list = new ArrayList<>();
        Map<String, Long> map = new HashMap<>();
        Long grossProfit = 0l;
        for (String event : events) 
        {
            String[] actions = event.split(" ");
            if (event.startsWith("BUY")) 
            {
                if(map.containsKey(actions[1])) 
                {
                    map.put(actions[1], map.get(actions[1])+Long.parseLong(actions[2]));
                }
                else 
                {
                    map.put(actions[1], Long.parseLong(actions[2]));
                }
            } 
            else if (event.startsWith("SELL")) 
            {
                if(map.containsKey(actions[1])) 
                {
                    map.put(actions[1], map.get(actions[1])-Long.parseLong(actions[2]));
                }
                else 
                {
                    map.put(actions[1], Long.parseLong(actions[2]));
                }
            } 
            else if (event.startsWith("CHANGE")) 
            {
                grossProfit += map.get(actions[1])*Long.parseLong(actions[2]);
            } 
            else if (event.startsWith("QUERY")) 
            {
                list.add(grossProfit);
            }
        }
        return list;
    }
}
