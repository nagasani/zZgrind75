package com.grind.zip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Twitter1 
{

	private Map<Integer, Set<Integer>> followers = new HashMap<>();
	private Map<Integer, List<Integer>> tweets = new HashMap<>();
	private Map<Integer, Integer> timestamps = new HashMap<>();	
	private static int i = 0;
	
	public void Twitter1() {}
	
	public void postTweet(int userId, int tweetId) 
	{
		if(tweets.get(userId) != null) 
		{
			//System.out.println(tweetId);
			tweets.get(userId).add(tweetId);
		}
		else 
		{
			//System.out.println(tweetId);
			tweets.put(userId, new ArrayList<>(Arrays.asList(tweetId)));
		}
		timestamps.put(tweetId, i++);
	}
	
	public List<Integer> getsNewsFeed(int userId)
	{
		Set<Integer> subs = followers.get(userId) == null ? new HashSet<>() : followers.get(userId);
		subs.add(userId);
		
		List<Integer> alltweets = new ArrayList<>();
		
		for(Integer i : subs) 
		{
			if(tweets.get(i) != null) 
			{
				alltweets.addAll(tweets.get(i));
				//alltweets.stream().forEach(System.out::println);
			}
		}
		
		
		Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
		for(Integer i : alltweets) 
		{
			map.put(timestamps.get(i), i);
		}
		map.keySet().stream().forEach(System.out::println);
		
		List<Integer> result = new ArrayList<>();
		int k=0;
		for(Integer i : map.keySet()) 
		{
			if(k < 10)
			{
				result.add(map.get(i));
			}
			k++;
			if(k == 10) 
			{
				break;
			}
		}		
		return result;
	}
	
	public List<Integer> getsNewsFeed2(int userId)
	{
		Set<Integer> subs = followers.get(userId) == null ? new HashSet<>() : followers.get(userId);
		subs.add(userId);
		
		List<Integer> alltweets = new ArrayList<>();
		
		for(Integer i : subs) 
		{
			if(tweets.get(i) != null) 
			{
				alltweets.addAll(tweets.get(i));				
			}
		}
						
		Map<Integer, Integer> map = new HashMap<>();
		int k=0;
		int max = 0;
		for(Integer i : alltweets) 
		{			
			if(k < 10) 
			{
				map.put(timestamps.get(i), i);
			}
			else
			{
				if(max < timestamps.get(i)) 
				{
					map.remove(max);
					map.put(timestamps.get(i), i);
				}
				
			}	
			k++;
			max = max > timestamps.get(i) ? max : timestamps.get(i);
		}	
		return new ArrayList<>(map.keySet());
	}
	
	public void follow(int followerId, int followeeId) 
	{		
		if(followers.get(followerId) != null) 
		{
			followers.get(followerId).add(followeeId);
		}
		else 
		{
			followers.put(followerId, new HashSet<>(Arrays.asList(followeeId)));
		}		
	}
	
	public void unfollow(int followerId, int followeeId) 
	{
		if(followers.get(followerId) != null) 
		{
			followers.get(followerId).remove(followeeId);
			if(followers.get(followerId).size() == 0) 
			{
				followers.remove(followerId);
			}
		}		
	}
	
}
