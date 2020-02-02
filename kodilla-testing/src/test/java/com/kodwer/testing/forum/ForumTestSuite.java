package com.kodwer.testing.forum;

import com.kodwer.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite: end");
    }

    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing"+ result);
        //Then
        Assert.assertEquals("John Smith", result);
    }
}
