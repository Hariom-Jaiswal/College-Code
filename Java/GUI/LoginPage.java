package GUI;
import javax.swing.*;

public class LoginPage {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,350);
        frame.setLayout(null);
        
        JButton AdminLogin = new JButton("Admin Login");
        AdminLogin.setBounds(100,100,150,50);
                
        JButton LibLogin = new JButton("Librarian Login");
        LibLogin.setBounds(100,180,150,50);
        
        JLabel heading = new JLabel("Library Management - JavaTpoint");
        heading.setBounds(90,20,200,50);
        
        frame.add(AdminLogin);
        frame.add(LibLogin);
        frame.add(heading);
       
    }
    
}
