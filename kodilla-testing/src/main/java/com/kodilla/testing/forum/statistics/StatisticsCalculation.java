package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {

    private  int numberOfUsers;
    private  int numberOfPosts;
    private  int numberOfComments;
    private  double averagePostsPerUser;
    private  double averageCommentsPerUser;
    private  double averageCommentsPerPost;

    public StatisticsCalculation(Statistics statistics) {

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = numberOfPosts / numberOfUsers;
        }
        if (numberOfUsers == 0) {
            averagePostsPerUser = 0;
        } else {
            averageCommentsPerUser = numberOfComments / numberOfUsers;
        }
        if (numberOfPosts == 0) {
            averagePostsPerUser = 0;
        } else {
            averageCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }
        public void showStatistics() {
            System.out.println("Statistics:");
            System.out.println("Number of users: " + getNumberOfUsers());
            System.out.println("Number of posts: " + getNumberOfPosts());
            System.out.println("Number of comments: " + getNumberOfComments());
            System.out.println("Average posts per user: " + getAveragePostsPerUser());
            System.out.println("Average comments per user: " + getAverageCommentsPerUser());
            System.out.println("Average comments per post: " + getAverageCommentsPerPost());
        }
    }

