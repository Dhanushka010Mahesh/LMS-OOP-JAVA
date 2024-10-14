package Model;

public class Member extends User{
    private MemberShipCard memberCard;

    public Member(int id, String name, String contact, String userName, String password,MemberShipCard memberCard) {
        super(id,name,contact,userName,password);
        this.memberCard=memberCard;
    }

    @Override
    public void signIn() {
        System.out.println("Member login");
    }


    public String MemberInfo() {
        return  getName()+" "+getContactInfo()+" " +getUserName()+" "+memberCard.getCardNumber()+" "+memberCard.getExpireDate() ;
    }
}