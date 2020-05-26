package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList;

    public Forum() {
        userList = new ArrayList<>();
        ForumUser forumUser1 = new ForumUser(658736,"Bober", 'M', 10, 1990, 5, 12);
        ForumUser forumUser2 = new ForumUser(651136,"Dzied", 'F', 1, 2000, 9, 15);
        ForumUser forumUser3 = new ForumUser(658536,"Wsiok", 'M', 4, 2010, 2, 1);
        ForumUser forumUser4 = new ForumUser(128736,"Ziomek", 'F', 12, 1980, 11, 23);
        ForumUser forumUser5 = new ForumUser(129936,"Bdber", 'F', 50, 1999, 8, 30);
        userList.add(forumUser1);
        userList.add(forumUser2);
        userList.add(forumUser3);
        userList.add(forumUser4);
        userList.add(forumUser5);
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
