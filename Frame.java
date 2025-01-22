import javax.swing.*;

public class Frame{
    
    public static void main(String[]args){
        JFrame frame=new JFrame("learning");
        JLabel label=new JLabel("library management-JavaTpoint");
        label.setBounds(40,2,200,42);
        JButton button=new JButton("admin login");
        button.setBounds(60,50,100,50);
        JButton button2=new JButton("kar le login");
        button2.setBounds(60,120,100,50);




        frame.setLayout(null);
        frame.add(label);
        frame.add(button);
        frame.add(button2);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}   