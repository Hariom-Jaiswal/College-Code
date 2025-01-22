import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AdminSection implements ActionListener{
    JFrame frame = new JFrame();
    SQL c = new SQL();

    public void init() {
        frame.setVisible(true);
        frame.setSize(400,500);
        frame.setLayout(null);
        
        JButton Add = new JButton("Add Librarian");
        Add.setBounds(100,100,150,50);
        Add.addActionListener(this);
                
        JButton View = new JButton("View Librarian");
        View.setBounds(100,180,150,50);
        View.addActionListener(this);

        JButton Delete = new JButton("Delete Librarian");
        Delete.setBounds(100,260,150,50);
        Delete.addActionListener(this);

        JButton Logout = new JButton("Logout");
        Logout.setBounds(100,340,150,50);
        Logout.addActionListener(this);

        JLabel heading = new JLabel("Admin Section");
        heading.setBounds(135,20,200,50);
        
        frame.add(Add);
        frame.add(View);
        frame.add(Delete);
        frame.add(Logout);
        frame.add(heading);

    }

    public void actionPerformed (ActionEvent e){
        String name = e.getActionCommand();

        if (name.equals("Add Librarian")) {
            c.connect();
            c.add();
            c.close();
        }
        else if (name.equals("View Librarian")) {
            c.connect();
            c.view();
            c.close();
        }
        else if (name.equals("Delete Librarian")) {
            c.connect();
            c.delete();
            c.close();
        }
        else if (name.equals("Logout")) {
            LoginPage l = new LoginPage();
            frame.dispose();
            l.init();
        }
    }

}
