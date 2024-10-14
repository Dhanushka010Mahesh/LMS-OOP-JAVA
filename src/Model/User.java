package Model;

public abstract class User {
    private int id;
    private String name;
    private String contactInfo;
    private String userName;
    private String password;

    public User(int id,String name,String contact,String userName,String password){
        this.id=id;
        this.name=name;
        contactInfo=contact;
        this.userName=userName;
        this.password=password;
    }



    public abstract void signIn();

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
