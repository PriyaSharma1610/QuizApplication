
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.awt.Image;

public class Login extends JFrame implements ActionListener{

    JButton rules, back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quizz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Quizzy Minds");
        heading.setBounds(550, 60, 300, 45);
        heading.setFont(new Font("Franklin Gothic", Font.BOLD, 45));
        heading.setForeground(new Color(69, 76, 82));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(610, 150, 300, 25);
        name.setFont(new Font("Helvetica", Font.BOLD, 20));
        name.setForeground(new Color(88, 110, 131));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(545, 200, 300, 25);
        tfname.setFont(new Font("Helvetica", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(545, 270, 120, 30);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Exit");
        back.setBounds(725, 270, 120, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(900, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
