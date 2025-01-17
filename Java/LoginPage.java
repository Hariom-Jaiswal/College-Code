import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();

    public void init() {
        frame.setVisible(true);
        frame.setSize(400,350);
        frame.setLayout(null);
        
        JButton AdminLogin = new JButton("Admin Login");
        AdminLogin.setBounds(100,100,150,50);
        AdminLogin.addActionListener(this);

        JButton LibLogin = new JButton("Librarian Login");
        LibLogin.setBounds(100,180,150,50);
        LibLogin.addActionListener(this);

        JLabel heading = new JLabel("Library Management - JavaTpoint");
        heading.setBounds(90,20,200,50);
        
        frame.add(AdminLogin);
        frame.add(LibLogin);
        frame.add(heading);
    }

    public void actionPerformed(ActionEvent e){
        String name = e.getActionCommand();
        
        if (name.equals("Admin Login")) {
            AdminSection sec = new AdminSection();
            frame.dispose();
            sec.init();
        }
        else if (name.equals("Librarian Login")) {
            Section sec = new Section();
            frame.dispose();
            sec.init();
        }
    }

    public static void main(String[] args) {
        LoginPage v = new LoginPage();
        v.init();
    }

}


