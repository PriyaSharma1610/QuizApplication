
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(150, 40, 700, 30);
        heading.setFont(new Font("Helvetica", Font.BOLD, 28));
        heading.setForeground(new Color(67, 93, 115));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(30, 70, 700, 350);
        rules.setFont(new Font("Helvetica", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. Each question in the quiz is of multiple-choice format." + "<br><br>" +
                        "2. Read each question carefully, and click on the button next to your response that is based on the information covered on the topic in the module." + "<br><br>" +
                        "3. The total score for the quiz is based on your responses to all questions." + "<br><br>" +
                        "4. There is a timer of 15 seconds in which you can answer the question otherwise it will redirect you next question automatically." + "<br><br>" +
                        "5. The Quiz will consist of 10 questions for the participants to answer." + "<br><br>" +
                        "6. Every question is of 10 marks each."  +
                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 40);
        back.setBackground(new Color(68, 77, 86));
        back.setFont(new Font("Helvetica", Font.PLAIN, 22));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 40);
        start.setFont(new Font("Helvetica", Font.PLAIN, 22));
        start.setBackground(new Color(66, 75, 84));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}