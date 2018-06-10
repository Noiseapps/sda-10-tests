package pl.sda.tests.dbapp;

import org.junit.jupiter.api.*;

public class DbAppTests {

    private static DbAppMain dbAppMain;

    private static int counter = 0;

    @BeforeAll
    static void setup() {
        System.out.println("tests starting");
        TestDataSource dataSource = new TestDataSource();
        dbAppMain = new DbAppMain(dataSource);
    }

    @AfterAll
    static void cleanup() {
        System.out.println("tests finished");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("Test " + counter + " starting");
    }

    @Test
    void testForId1() {
        User user = dbAppMain.readUserById(1);
        System.out.println(user);
        Assertions.assertNull(user);
    }

    @Test
    void testForId2() {
        User user = dbAppMain.readUserById(2);
        System.out.println(user);
        Assertions.assertNull(user);
    }

    @Test
    void testForId3() {
        User user = dbAppMain.readUserById(3);
        System.out.println(user);
        Assertions.assertNotNull(user);
        Assertions.assertEquals(new User(3, "user3"), user);
    }

    @Test
    void testForId4() {
        User user = dbAppMain.readUserById(4);
        System.out.println(user);
        Assertions.assertNull(user);
    }

    @Test
    void testForId5() {
        User user = dbAppMain.readUserById(5);
        System.out.println(user);
        Assertions.assertNull(user);
    }

    @AfterEach
    void afterTest() {
        System.out.println("Test " + counter++ + " finished");
    }
}
