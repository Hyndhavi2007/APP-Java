package Tutorial_8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserLogin extends JFrame {

    JTextField username;
    JPasswordField password;
    JCheckBox remember, notification;
    JButton login;

    UserLogin() {

        setTitle("User Login");
        setSize(350, 300);
        setLayout(new FlowLayout());

        JLabel userLabel = new JLabel("Username:");
        username = new JTextField(20);

        JLabel passLabel = new JLabel("Password:");
        password = new JPasswordField(20);

        remember = new JCheckBox("Remember Me");
        notification = new JCheckBox("Receive Notifications");

        login = new JButton("Login");

        add(userLabel);
        add(username);

        add(passLabel);
        add(password);

        add(remember);
        add(notification);

        add(login);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = username.getText();
                String pass = new String(password.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {

                    String message =
                        "Login Successful!\n" +
                        "Welcome " + user +
                        "\nRemember Me: " + remember.isSelected() +
                        "\nNotifications: " + notification.isSelected();

                    JOptionPane.showMessageDialog(
                        UserLogin.this,
                        message
                    );

                } else {
                    JOptionPane.showMessageDialog(
                        UserLogin.this,
                        "Invalid Username or Password"
                    );
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserLogin();
    }
}