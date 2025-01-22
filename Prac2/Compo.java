package Prac2;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Compo {
    JFrame frame;

    public Compo() {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void progressBar() {
        JProgressBar jb = new JProgressBar(0, 2000);
        jb.setBounds(200, 400, 400, 60);
        jb.setValue(0);
        jb.setStringPainted(true);
        frame.add(jb);

        new Thread(() -> {
            int i = 0;
            while (i <= 2000) {
                jb.setValue(i);
                i += 20;
                try {
                    Thread.sleep(150);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void tabbedPaneExample() {
        JTextArea ta = new JTextArea(10, 20);
        JPanel p1 = new JPanel();
        p1.add(new JScrollPane(ta));
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 100, 200, 200);
        tp.add("Main", p1);
        tp.add("Visit", p2);
        tp.add("Help", p3);
        frame.add(tp);
    }

    public void spinnerExample() {
        SpinnerModel value = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100, 300, 50, 30);
        frame.add(spinner);
    }

    public void sliderExample() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setBounds(300, 300, 200, 50);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        frame.add(slider);
    }

    public void treeExample() {
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        JTree jt = new JTree(style);
        JScrollPane treeScrollPane = new JScrollPane(jt);
        treeScrollPane.setBounds(50, 500, 150, 200);
        frame.add(treeScrollPane);
    }

    public void tableExample() {
        String[][] data = {
            {"101", "Amey", "670000"},
            {"102", "Hrishi", "780000"},
            {"103", "Sachin", "700000"}
        };
        String[] column = {"ID", "NAME", "SALARY"};

        JTable jt = new JTable(data, column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = jt.getSelectedRow();
                    int col = jt.getSelectedColumn();
                    if (row != -1 && col != -1) {
                        String data = (String) jt.getValueAt(row, col);
                        System.out.println("Table element selected is: " + data);
                    }
                }
            }
        });
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(300, 50, 400, 100);
        frame.add(sp);
    }

    public void colorChooserExample() {
        JButton b = new JButton("Pad Color");
        b.setBounds(500, 600, 100, 30);
        JTextArea ta = new JTextArea();
        ta.setBounds(300, 650, 300, 100);
        b.addActionListener(e -> {
            Color c = JColorChooser.showDialog(frame, "Choose", Color.CYAN);
            if (c != null) {
                ta.setBackground(c);
            }
        });
        frame.add(b);
        frame.add(ta);
    }

    public static void main(String[] args) {
        Compo c = new Compo();
        c.progressBar();
        c.tabbedPaneExample();
        c.spinnerExample();
        c.sliderExample();
        c.treeExample();
        c.tableExample();
        c.colorChooserExample();
        c.frame.setVisible(true);
    }
}
