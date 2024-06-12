package com.grind.meta;
/*
 * Click `Run` to execute the snippet below!
 */

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


class Solution1555 
{
  static final List<Group> allGroups = Arrays.asList(new Group[] {
    new Group("Group A", new String[] { "permission 1", "permission 2", "permission 3" }),
    new Group("Group B", new String[] { "permission 4" }),
    new Group("Group C", new String[] { "permission 5", "permission 6" }),
    new Group("Group D", new String[] { "permission 7", "permission 8", "permission 9" }),
  });

  static final List<String> userGroups = Arrays.asList(new String[] { "Group B", "Group D" });

  public static void main(String[] args) {
    System.out.println(String.join(", ", getUserPermissions(allGroups, userGroups)));
  }

	public static List<String> getUserPermissions(List<Group> allGroups, List<String> userGroups) 
	{

		Map<String, String[]> map = new HashMap<>();
		for (Group s : allGroups) 
		{
			map.put(s.name, s.permissions);
		}
		
		Set<String> set = new HashSet<>();
		 
		for(String s : userGroups) 
		{
			set.addAll(new HashSet<>(Arrays.asList(map.get(s))));
		}
		return new ArrayList<>(set);
	}
}
