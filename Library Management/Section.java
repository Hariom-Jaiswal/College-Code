import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;


public class Section implements ActionListener{
    JFrame frame = new JFrame();
    SQL c = new SQL();

    public void init() {
        frame.setVisible(true);
        frame.setSize(400,700);
        frame.setLayout(null);
        
        JButton Add = new JButton("Add Books");
        Add.setBounds(100,100,150,50);
        Add.addActionListener(this);

        JButton View = new JButton("View Books");
        View.setBounds(100,180,150,50);
        View.addActionListener(this);

        JButton Issue = new JButton("Issue Book");
        Issue.setBounds(100,260,150,50);
        Issue.addActionListener(this);

        JButton Vissue = new JButton("View Issued Books");
        Vissue.setBounds(100,340,150,50);
        Vissue.addActionListener(this);

        JButton Return = new JButton("Return Book");
        Return.setBounds(100,420,150,50);
        Return.addActionListener(this);

        JButton Logout = new JButton("Logout");
        Logout.setBounds(100,500,150,50);
        Logout.addActionListener(this);

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

    public void actionPerformed (ActionEvent e){
        String name = e.getActionCommand();

        if (name.equals("Add Books")) {
            System.out.println("Books Added");
            c.connect();
            c.addBooks();
            c.close();
        }
        else if (name.equals("View Books")) {
            System.out.println("Viewed");
            c.connect();
            c.view();
            c.close();
        }
        else if (name.equals("Issue Book")) {
            System.out.println("Issued");

        }
        else if (name.equals("View Issued Books")) {
            System.out.println("Viewed");
        }
        else if (name.equals("Return Book")) {
            System.out.println("returned");
        }
        else if (name.equals("Logout")) {
            LoginPage l = new LoginPage();
            frame.dispose();
            l.init();
        }
    }
}
