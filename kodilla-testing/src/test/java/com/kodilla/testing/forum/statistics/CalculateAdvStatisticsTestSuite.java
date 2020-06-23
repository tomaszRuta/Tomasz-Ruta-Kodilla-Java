package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculatingAdvStatisticsWithMockZeroPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i<200; i++) {
            userNames.add("randomName RandomSurname");
        }

        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(375);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(4, statisticsCalculation.getAverageCommentsPerUser(), 0.0001);
        Assert.assertEquals(0, statisticsCalculation.getAveragePostsPerUser(), 0.001);


    }

    @Test
    public void alculatingAdvStatisticsWithMockThousandPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i<200; i++) {
            userNames.add("randomName RandomSurname");
        }

        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(13);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(5, statisticsCalculation.getAveragePostsPerUser(), 0.001);
    }

    @Test
    public void calculatingAdvStatisticsWithMockZeroComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i<200; i++) {
            userNames.add("randomName RandomSurname");
        }

        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAveragePostsPerUser(), 0.001);
    }

    @Test
    public void calculatingAdvStatisticsWithMockCommentsLessThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i<200; i++) {
            userNames.add("randomName RandomSurname");
        }

        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(50);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAveragePostsPerUser(), 0.001);
    }

     @Test
    public void calculatingAdvStatisticsWithMockCommentsMoreThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i<200; i++) {
            userNames.add("randomName RandomSurname");
        }

        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(60);
        when(statistics.commentsCount()).thenReturn(120);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAveragePostsPerUser(), 0.001);
    }

    @Test
    public void calculatingAdvStatisticsWithMockZeroUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(300);
        when(statistics.commentsCount()).thenReturn(1245);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(4, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCalculation.getAveragePostsPerUser(), 0.001);
    }

    @Test
    public void calculatingAdvStatisticsWithMockHundredUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statistics);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i<200; i++) {
            userNames.add("randomName RandomSurname");
        }

        when(statistics.usersNames()).thenReturn(userNames);
        when(statistics.postsCount()).thenReturn(567);
        when(statistics.commentsCount()).thenReturn(486);
        //When
        statisticsCalculation.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, statisticsCalculation.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(2, statisticsCalculation.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(2, statisticsCalculation.getAveragePostsPerUser(), 0.001);
    }
}

