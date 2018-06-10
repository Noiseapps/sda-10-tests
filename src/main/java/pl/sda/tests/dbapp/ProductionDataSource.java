package pl.sda.tests.dbapp;

import java.util.ArrayList;
import java.util.List;

public class ProductionDataSource implements DataSource {

    private final List<User> users = new ArrayList<>();

    public ProductionDataSource() {
        users.add(new User(1, "user1"));
        users.add(new User(2, "user2"));
        users.add(new User(3, "user3"));
        users.add(new User(4, "user4"));
        users.add(new User(5, "user5"));
        users.add(new User(6, "user6"));
        users.add(new User(7, "user7"));
        users.add(new User(8, "user8"));
    }

    public User getUserById(int id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}
