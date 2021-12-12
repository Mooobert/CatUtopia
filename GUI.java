import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {

    private Container cp = getContentPane();
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17,
            leveltf;
    private int a, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, c, d, e, f, level;

    public void actionPerformed(ActionEvent ae) {
        String text = "";
        if (ae.getSource() == tf1) {
            text = tf1.getText();
            try {
                a = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf2) {
            text = tf2.getText();
            try {
                b1 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf3) {
            text = tf3.getText();
            try {
                b2 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf4) {
            text = tf4.getText();
            try {
                b3 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf5) {
            text = tf5.getText();
            try {
                b4 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf6) {
            text = tf6.getText();
            try {
                b5 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf7) {
            text = tf7.getText();
            try {
                b6 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf8) {
            text = tf8.getText();
            try {
                b7 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf9) {
            text = tf9.getText();
            try {
                b8 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf10) {
            text = tf10.getText();
            try {
                b9 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf11) {
            text = tf11.getText();
            try {
                b10 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf12) {
            text = tf12.getText();
            try {
                b11 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf13) {
            text = tf13.getText();
            try {
                b12 = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf14) {
            text = tf14.getText();
            try {
                c = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf15) {
            text = tf15.getText();
            try {
                d = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf16) {
            text = tf16.getText();
            try {
                e = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == tf17) {
            text = tf17.getText();
            try {
                f = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        } else if (ae.getSource() == leveltf) {
            text = leveltf.getText();
            try {
                level = Integer.parseInt(text);
            } catch (Exception notInt) {
                JOptionPane.showMessageDialog(null, "Integer input only!");
            }
        }
    }

    public void reset() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
        tf9.setText("");
        tf10.setText("");
        tf11.setText("");
        tf12.setText("");
        tf13.setText("");
        tf14.setText("");
        tf15.setText("");
        tf16.setText("");
        tf17.setText("");
        leveltf.setText("");
        a = 0;
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        b9 = 0;
        b10 = 0;
        b11 = 0;
        b12 = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        level = 0;
        setSize(300, 550);
    }

    public void componentSetup() {
        JLabel l1 = new JLabel("Enter # of cooking stations: ");
        tf1 = new JTextField(3);
        tf1.addActionListener(this);

        JLabel l2 = new JLabel("Enter # of carrot stations: ");
        tf2 = new JTextField(3);
        tf2.addActionListener(this);

        JLabel l3 = new JLabel("Enter # of cabbage stations: ");
        tf3 = new JTextField(3);
        tf3.addActionListener(this);

        JLabel l4 = new JLabel("Enter # of corn stations: ");
        tf4 = new JTextField(3);
        tf4.addActionListener(this);

        JLabel l5 = new JLabel("Enter # of acorn stations: ");
        tf5 = new JTextField(3);
        tf5.addActionListener(this);

        JLabel l6 = new JLabel("Enter # of broccoli stations: ");
        tf6 = new JTextField(3);
        tf6.addActionListener(this);

        JLabel l7 = new JLabel("Enter # of lemon stations: ");
        tf7 = new JTextField(3);
        tf7.addActionListener(this);

        JLabel l8 = new JLabel("Enter # of honey stations: ");
        tf8 = new JTextField(3);
        tf8.addActionListener(this);

        JLabel l9 = new JLabel("Enter # of wheat stations: ");
        tf9 = new JTextField(3);
        tf9.addActionListener(this);

        JLabel l10 = new JLabel("Enter # of radish stations: ");
        tf10 = new JTextField(3);
        tf10.addActionListener(this);

        JLabel l11 = new JLabel("Enter # of pumpkin stations: ");
        tf11 = new JTextField(3);
        tf11.addActionListener(this);

        JLabel l12 = new JLabel("Enter # of mushroom stations: ");
        tf12 = new JTextField(3);
        tf12.addActionListener(this);

        JLabel l13 = new JLabel("Enter # of celery stations: ");
        tf13 = new JTextField(3);
        tf13.addActionListener(this);

        JLabel l14 = new JLabel("Enter # of rest stations: ");
        tf14 = new JTextField(3);
        tf14.addActionListener(this);

        JLabel l15 = new JLabel("Enter # of function stations: ");
        tf15 = new JTextField(3);
        tf15.addActionListener(this);

        JLabel l16 = new JLabel("Enter # of special stations: ");
        tf16 = new JTextField(3);
        tf16.addActionListener(this);

        JLabel l17 = new JLabel("Enter # of empty spots: ");
        tf17 = new JTextField(3);
        tf17.addActionListener(this);

        JLabel levelNum = new JLabel("Enter upgrade level: ");
        leveltf = new JTextField(3);
        leveltf.addActionListener(this);

        JButton generateInsertions = new JButton("Generate insertions");
        generateInsertions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    StructureInsertion si = new StructureInsertion(LevelGeneration.insertRows(level), StructureAddition
                            .populateStations(a, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, c, d, e, f));
                    si.insert();
                    JOptionPane.showMessageDialog(null, si.toString());
                    setSize(1000, 550);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Level generation/insertion failed!");
                }
            }
        });

        JButton resetFields = new JButton("Reset fields");
        resetFields.addActionListener((event) -> reset());

        cp.setLayout(new FlowLayout(FlowLayout.LEFT));

        cp.add(levelNum);
        cp.add(leveltf);
        cp.add(l1);
        cp.add(tf1);
        cp.add(l2);
        cp.add(tf2);
        cp.add(l3);
        cp.add(tf3);
        cp.add(l4);
        cp.add(tf4);
        cp.add(l5);
        cp.add(tf5);
        cp.add(l6);
        cp.add(tf6);
        cp.add(l7);
        cp.add(tf7);
        cp.add(l8);
        cp.add(tf8);
        cp.add(l9);
        cp.add(tf9);
        cp.add(l10);
        cp.add(tf10);
        cp.add(l11);
        cp.add(tf11);
        cp.add(l12);
        cp.add(tf12);
        cp.add(l13);
        cp.add(tf13);
        cp.add(l14);
        cp.add(tf14);
        cp.add(l15);
        cp.add(tf15);
        cp.add(l16);
        cp.add(tf16);
        cp.add(l17);
        cp.add(tf17);
        cp.add(generateInsertions);
        cp.add(resetFields);

        setVisible(true);
    }

    public void GUIsetup() {
        setSize(300, 550);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Cats & Soup station spot randomizer");
        setVisible(true);
    }

    public GUI() {
        GUIsetup();
        componentSetup();
    }

    public static void main(String[] args) {
        new GUI();
    }
}
