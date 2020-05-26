package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUsersSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 2000 &&
                        forumUser.getBirthDate().getMonthValue() <= 5 &&
                        forumUser.getBirthDate().getDayOfMonth() <= 20)
                .filter(forumUser -> forumUser.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println(theMapOfUsers.size());
        theMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
