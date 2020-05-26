package com.kodwer.testing.forum.statistics;

public class StatisticsCalculator {
    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsPerUserAverage;
    private double commentsPerUserAverage;
    private double commentsPerPostAverage;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        postsPerUserAverage = postsQuantity/usersQuantity;
        commentsPerUserAverage = commentsQuantity/usersQuantity;
        commentsPerPostAverage = commentsQuantity/postsQuantity;
    }

    public void showStatictics(Statistics statistics){
        System.out.println("Liczba użytkowników forum:" + usersQuantity);
        System.out.println("Liczba postów na forum:" + postsQuantity);
        System.out.println("Liczba komentarzy na forum" + commentsQuantity);
        System.out.println("Srednia liczba postów na użytkownika:" + postsPerUserAverage);
        System.out.println("Srednia Liczba komentarzy na użytkownika:" + commentsPerUserAverage);
        System.out.println("Srednia liczba komentarzy na post:" + commentsPerPostAverage);
    }
}

