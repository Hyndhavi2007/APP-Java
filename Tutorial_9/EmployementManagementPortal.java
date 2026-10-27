package Tutorial_9;

import javax.swing.*;
import java.awt.*;

class EmployeeModel {
    String username = "admin";
    String password = "admin123";

    boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }

    boolean changePassword(String oldPass, String newPass,
                           String confirmPass) {
        if (!password.equals(oldPass))
            return false;

        if (newPass.isEmpty() || !newPass.equals(confirmPass))
            return false;

        password = newPass;
        return true;
    }
}

class EmployeeView extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JButton loginButton = new JButton("Login");

    EmployeeView() {
        setTitle("Employee Login");
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Username:"));
        add(username);
        add(new JLabel("Password:"));
        add(password);
        add(new JLabel(""));
        add(loginButton);

        setSize(350, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    void showMainWindow() {
        JFrame main = new JFrame("Employee Management Portal");
        JMenuBar bar = new JMenuBar();

        JMenu employee = new JMenu("Employee");
        JMenu tools = new JMenu("Tools");
        JMenu exit = new JMenu("Exit");

        JMenuItem addEmployee = new JMenuItem("Add Employee");
        JMenuItem viewEmployee = new JMenuItem("View Employee");
        JMenuItem changePassword = new JMenuItem("Change Password");
        JMenuItem logout = new JMenuItem("Logout");
        JMenuItem exitApp = new JMenuItem("Exit Application");

        employee.add(addEmployee);
        employee.add(viewEmployee);
        tools.add(changePassword);
        exit.add(logout);
        exit.add(exitApp);

        bar.add(employee);
        bar.add(tools);
        bar.add(exit);

        main.setJMenuBar(bar);
        main.add(new JLabel("Welcome to Employee Management Portal",
                            SwingConstants.CENTER));

        main.setSize(500, 300);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);

        addEmployee.addActionListener(e -> {
            JTextField id = new JTextField();
            JTextField name = new JTextField();
            JTextField dept = new JTextField();

            Object[] fields = {
                "Employee ID:", id,
                "Employee Name:", name,
                "Department:", dept
            };

            int choice = JOptionPane.showConfirmDialog(
                main, fields, "Add Employee",
                JOptionPane.OK_CANCEL_OPTION);

            if (choice == JOptionPane.OK_OPTION) {
                if (id.getText().trim().isEmpty()
                    || name.getText().trim().isEmpty()
                    || dept.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(main,
                        "All fields are required.");
                } else {
                    JOptionPane.showMessageDialog(main,
                        "Employee Added\nID: " + id.getText()
                        + "\nName: " + name.getText()
                        + "\nDepartment: " + dept.getText());
                }
            }
        });

        viewEmployee.addActionListener(e ->
            JOptionPane.showMessageDialog(main,
                "No employee records stored."));

        changePassword.addActionListener(e -> {
            JPasswordField oldPass = new JPasswordField();
            JPasswordField newPass = new JPasswordField();
            JPasswordField confirmPass = new JPasswordField();

            Object[] fields = {
                "Old Password:", oldPass,
                "New Password:", newPass,
                "Confirm Password:", confirmPass
            };

            int choice = JOptionPane.showConfirmDialog(
                main, fields, "Change Password",
                JOptionPane.OK_CANCEL_OPTION);

            if (choice == JOptionPane.OK_OPTION) {
                String oldValue = new String(oldPass.getPassword());
                String newValue = new String(newPass.getPassword());
                String confirmValue =
                    new String(confirmPass.getPassword());

                if (newValue.isEmpty()) {
                    JOptionPane.showMessageDialog(main,
                        "New password cannot be empty.");
                } else if (!newValue.equals(confirmValue)) {
                    JOptionPane.showMessageDialog(main,
                        "New and confirm passwords do not match.");
                } else if (!EmployeeController.model.changePassword(
                           oldValue, newValue, confirmValue)) {
                    JOptionPane.showMessageDialog(main,
                        "Incorrect old password.");
                } else {
                    JOptionPane.showMessageDialog(main,
                        "Password changed successfully.");
                }
            }
        });

        logout.addActionListener(e -> {
            main.dispose();
            username.setText("");
            password.setText("");
            setVisible(true);
        });

        exitApp.addActionListener(e -> System.exit(0));

        main.setVisible(true);
    }
}

class EmployeeController {
    static EmployeeModel model = new EmployeeModel();
    EmployeeView view;

    EmployeeController(EmployeeView view) {
        this.view = view;
        view.loginButton.addActionListener(e -> login());
    }

    void login() {
        String user = view.username.getText().trim();
        String pass = new String(view.password.getPassword());

        if (model.login(user, pass)) {
            JOptionPane.showMessageDialog(view,
                "Login Successful");
            view.setVisible(false);
            view.showMainWindow();
        } else {
            JOptionPane.showMessageDialog(view,
                "Invalid username or password");
        }
    }
}

public class EmployementManagementPortal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeView view = new EmployeeView();
            new EmployeeController(view);
            view.setVisible(true);
        });
    }
}
