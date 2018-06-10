package pl.sda.tests.dbapp;

public class TestDataSource implements DataSource {


    @Override
    public User getUserById(int id) {
        switch (id) {
            case 1: // user not found
                return null;
            case 2: // user has incorrect id
                return new User(3, "testUser3");
            case 3: // user correct
                return new User(3, "testUser3");
            case 4: // exception while reading data
                throw new IllegalArgumentException();
            case 5: // malformed user
                return new User(5, null);
            default:
                return null;
        }
    }
}
