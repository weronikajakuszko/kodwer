package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final private int userId;
    final private String username;
    final private char usersSex;
    final private LocalDate birthDate;
    final private int postsQuantity;


    public ForumUser(final int userId, final String username, final char usersSex, final int postsQuantity, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth) {
        this.userId = userId;
        this.username = username;
        this.usersSex = usersSex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getUsersSex() {
        return usersSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }
}
