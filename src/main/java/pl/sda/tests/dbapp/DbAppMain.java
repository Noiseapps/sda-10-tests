package pl.sda.tests.dbapp;

import java.util.Scanner;

public class DbAppMain {

    private final DataSource dataSource;
    private final Scanner scanner = new Scanner(System.in);

    public DbAppMain(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        ProductionDataSource dataSource = new ProductionDataSource();
        DbAppMain dbAppMain = new DbAppMain(dataSource);
        dbAppMain.run();
    }

    private void run() {
        while (true) {
            int id = Integer.parseInt(scanner.nextLine());
            User user = readUserById(id);
            System.out.println(user);
        }
    }

    public User readUserById(int id) {
        User user = dataSource.getUserById(id);
        // warunki
        return user;
    }
}
