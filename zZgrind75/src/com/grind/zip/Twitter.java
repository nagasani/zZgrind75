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
//import java.util.concurrent.atomic.AtomicInteger;

class Twitter {

	
	//AtomicInteger tweetomic = new AtomicInteger(0);
	private int i = 0;
	Map<Integer, List<Tweet>> tweets = new HashMap<>();
	private Map<Integer, ArrayList<Integer>> followers = new HashMap<>();
	
    class Tweet 
    {
    	int tweeId;
    	int userId;
    	int tweetedAt;
    	
    	Tweet(int userId, int tweetId) 
    	{
    		this.tweeId = tweetId;
    		this.userId = userId;
    		//this.tweetedAt = tweetomic.addAndGet(1);
    		this.tweetedAt = i++;
    	}
    }
	
	public Twitter() {
        
    }
    
    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(userId, tweetId);
        if(tweets.get(userId) != null) 
		{
			//System.out.println(tweetId);
			tweets.get(userId).add(tweet);
		}
		else 
		{
			//System.out.println(tweetId);
			tweets.put(userId, new ArrayList<>(Arrays.asList(tweet)));
		}       
    }
    
    public List<Integer> getNewsFeed(int userId) 
    {    	    	
    	ArrayList<Integer> users = (followers.get(userId) == null ? new ArrayList<>() : followers.get(userId));
    	users.add(userId);
    	TreeMap<Integer, Integer> current = new TreeMap<>(Comparator.reverseOrder());
    	for(Integer user : users)
    	{
    		current = getTweets(current, tweets.get(user));
    	}
        
    	return new ArrayList<>(current.values());
    }
    
    public void follow(int followerId, int followeeId) 
    {
    	if(followers.get(followerId) != null) 
		{
			followers.get(followerId).add(followeeId);
		}
		else 
		{
			followers.put(followerId, new ArrayList<>(Arrays.asList(followeeId)));
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
    
    public TreeMap<Integer, Integer> getTweets(TreeMap<Integer, Integer> current, List<Tweet> userTweet)
    {
    	if(userTweet != null) {
	    	for(Tweet tweet : userTweet) 
	    	{
	    		if(current.size() < 10) 
	    		{
	    			current.put(tweet.tweetedAt, tweet.tweeId);
	    		}
	    		else
	    		{
	    			if(current.lastKey() > tweet.tweetedAt) 
	    			{
	    				current.pollLastEntry();
	    				current.put(tweet.tweetedAt, tweet.tweeId);
	    			}    			
	    		}    		
	    	}
    	}
    	return current;
    }
    
    /*
    public static void main(String[] args) {
        // Initialize Twitter object
        Twitter twitter = new Twitter();

        // User 1 posts a tweet (id = 5).
        twitter.postTweet(1, 5);

        // User 1's news feed should return a list with 1 tweet id -> [5].
        System.out.println(twitter.getNewsFeed(1)); // Expected: [5]

        // User 1 follows user 2.
        twitter.follow(1, 2);

        // User 2 posts a tweet (id = 6).
        twitter.postTweet(2, 6);

        // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
        // Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        System.out.println(twitter.getNewsFeed(1)); // Expected: [6, 5]

        // User 1 unfollows user 2.
        twitter.unfollow(1, 2);

        // User 1's news feed should return a list with 1 tweet id -> [5],
        // since user 1 is no longer following user 2.
        System.out.println(twitter.getNewsFeed(1)); // Expected: [5]
    }

    public static void main(String[] args) {
        // Initialize Twitter object
        Twitter twitter = new Twitter();

        // User 1 posts a tweet (id = 1)
        twitter.postTweet(1, 1);

        // Get User 1's news feed
        System.out.println(twitter.getNewsFeed(1)); // Expected: [1]

        // User 2 follows User 1
        twitter.follow(2, 1);

        // Get User 2's news feed
        System.out.println(twitter.getNewsFeed(2)); // Expected: [1]

        // User 2 unfollows User 1
        twitter.unfollow(2, 1);

        // Get User 2's news feed
        System.out.println(twitter.getNewsFeed(2)); // Expected: []
    }
    */
    public static void main(String[] args) {
        // Initialize Twitter object
        Twitter twitter = new Twitter();

        // Simulate the provided sequence of operations
        twitter.postTweet(1, 5);
        twitter.postTweet(1, 3);
        twitter.postTweet(1, 101);
        twitter.postTweet(1, 13);
        twitter.postTweet(1, 10);
        twitter.postTweet(1, 2);
        twitter.postTweet(1, 94);
        twitter.postTweet(1, 505);
        twitter.postTweet(1, 333);
        twitter.postTweet(1, 22);
        twitter.postTweet(1, 11);

        // Get User 1's news feed
        System.out.println(twitter.getNewsFeed(1)); // Expected: [11, 22, 333, 505, 94, 2, 10, 13, 101, 3]
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */