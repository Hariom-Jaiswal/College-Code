package GUI;

import javax.swing.*;

public class AdminSection {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,500);
        frame.setLayout(null);
        
        JButton Add = new JButton("Add Librarian");
        Add.setBounds(100,100,150,50);
                
        JButton View = new JButton("View Librarian");
        View.setBounds(100,180,150,50);
        
        JButton Delete = new JButton("Delete Librarian");
        Delete.setBounds(100,260,150,50);
        
        JButton Logout = new JButton("Logout");
        Logout.setBounds(100,340,150,50);
        
        JLabel heading = new JLabel("Admin Section");
        heading.setBounds(135,20,200,50);
        
        frame.add(Add);
        frame.add(View);
        frame.add(Delete);
        frame.add(Logout);
        frame.add(heading);
       
    }
}
