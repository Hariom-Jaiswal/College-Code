package Prac2;
import javax.swing.*;

public class Regi {
    
    public void init(){

        JFrame frame = new JFrame("User Registration Form");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);

        JLabel title = new JLabel("Registration Form");
        title.setBounds(30, 10, 150, 20);

        JLabel name = new JLabel("Name");
        JTextField nameT = new JTextField(20);
        name.setBounds(30, 60, 150, 20);
        nameT.setBounds(200, 60, 150, 20);

        JLabel fatherName = new JLabel("Father Name");
        JTextField fatherNameT = new JTextField(20);
        fatherName.setBounds(30, 100, 150, 20);
        fatherNameT.setBounds(200, 100, 150, 20);

        JLabel age = new JLabel("Age");
        JTextField ageT = new JTextField(20);
        age.setBounds(30, 140, 150, 20);
        ageT.setBounds(200, 140, 150, 20);

        JLabel gender = new JLabel("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        gender.setBounds(30, 180, 150, 20);
        male.setBounds(200, 180, 100, 20);
        female.setBounds(300, 180, 100, 20);

        String courses[] = {"Java", "Machine Learning", "Web Tech", "EPS"};
        JLabel course = new JLabel("Course");
        JComboBox courseT = new JComboBox(courses);
        course.setBounds(30, 220, 150, 20);
        courseT.setBounds(200, 220, 150, 20);

        JLabel hobbies = new JLabel("Hobbies");
        JCheckBox drawing = new JCheckBox("Drawing");
        JCheckBox singing = new JCheckBox("Singing");
        JCheckBox music = new JCheckBox("Music");
        JCheckBox others = new JCheckBox("Others");
        hobbies.setBounds(30, 260, 150, 20);
        drawing.setBounds(200, 260, 100, 20);
        singing.setBounds(300, 260, 100, 20);
        music.setBounds(400, 260, 100, 20);
        others.setBounds(500, 260, 100, 20);

        JLabel address = new JLabel("Address");
        JTextArea addressT = new JTextArea(" Your Address....");
        address.setBounds(30, 300, 150, 20);
        addressT.setBounds(200, 300, 400, 60);

        JButton save = new JButton("Save");
        JButton clear = new JButton("clear");

        frame.add(save);
        frame.add(clear);
        frame.add(address);
        frame.add(addressT);
        frame.add(others);
        frame.add(music);
        frame.add(singing);
        frame.add(drawing);
        frame.add(hobbies);
        frame.add(courseT);
        frame.add(course);
        frame.add(female);
        frame.add(male);
        frame.add(gender);
        frame.add(ageT);
        frame.add(age);
        frame.add(fatherNameT);
        frame.add(fatherName);
        frame.add(nameT);
        frame.add(name);
        frame.add(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Regi call = new Regi();
        call.init(); 
    }
}
