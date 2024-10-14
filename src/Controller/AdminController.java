package Controller;

import Model.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;

public class AdminController {

    ArrayList<Member> memberArr;

    public AdminController() {
        memberArr = new ArrayList<>();
    }

    public void add(Member member) {

        int response = JOptionPane.showConfirmDialog(null, "Confirm Data", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            memberArr.add(member);
            JOptionPane.showMessageDialog(null, "Oky add new member");
        } else {

        }

    }

    public void InsertListDataToDatabase() {
        String url = "jdbc:mysql://localhost:3306/libary";
        String user = "root";
        String pass = "";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);

            for (Member m : memberArr) {
                
                String qry ="insert into member values('"+m.getId()+"','"+m.getName()+"','"+m.getContactInfo()+"')";
                Statement sta = conn.createStatement();
                sta.executeUpdate(qry);
                JOptionPane.showMessageDialog(null, "Data Add Succssusfully");
            }

        } catch (Exception d) {
            System.out.println("open conn err : ");
        } finally {
            try {
                conn.close();
                System.out.println("Connection closed.");
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public void viewMemberDetails() {
        for (Member m : memberArr) {
            JOptionPane.showMessageDialog(null, m.MemberInfo());
        }
    }

}
