package GUI;

import javax.swing.*;

public class Section {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,700);
        frame.setLayout(null);
        
        JButton Add = new JButton("Add Books");
        Add.setBounds(100,100,150,50);
                
        JButton View = new JButton("View Books");
        View.setBounds(100,180,150,50);
        
        JButton Issue = new JButton("Issue Book");
        Issue.setBounds(100,260,150,50);
        
        JButton Vissue = new JButton("View Issued Books");
        Vissue.setBounds(100,340,150,50);
        
        JButton Return = new JButton("Return Book");
        Return.setBounds(100,420,150,50);
        
        JButton Logout = new JButton("Logout");
        Logout.setBounds(100,500,150,50);
        
        JLabel heading = new JLabel("Librarian Section - JavaTpoint");
        heading.setBounds(100,20,200,50);
        
        frame.add(Add);
        frame.add(View);
        frame.add(Issue);
        frame.add(Vissue);
        frame.add(Return);
        frame.add(Logout);
        frame.add(heading);
       
    }
}
