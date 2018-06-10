package pl.sda.tests.dbapp;

import org.junit.jupiter.api.*;

public class DbAppTests {

    private static DbAppMain dbAppMain;

    private int counter = 0;

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
    void testForUserWithId0() {
        User user = dbAppMain.readUserById(0);
        Assertions.assertNull(user);
    }

    @AfterEach
    void afterTest() {
        System.out.println("Test " + counter++ + " finished");
    }
}
