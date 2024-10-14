package Model;

public class Admin extends User {
    public Admin(int id, String name, String contact, String userName, String password) {
        super(id, name, contact, userName, password);
    }

    @Override
    public void signIn() {

    }
}
