package Tutorial_8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame {

    JTextField nameField, regField;
    JRadioButton male, female;
    JComboBox<String> department;
    JButton submit;

    StudentRegistration() {

        setTitle("Student Registration");
        setSize(400, 350);
        setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Student Name:");
        nameField = new JTextField(20);

        JLabel regLabel = new JLabel("Register Number:");
        regField = new JTextField(20);

        JLabel genderLabel = new JLabel("Gender:");

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel deptLabel = new JLabel("Department:");

        String[] departments = {
            "CSE", "ECE", "EEE", "MECH", "CIVIL"
        };

        department = new JComboBox<>(departments);

        submit = new JButton("Submit");

        add(nameLabel);
        add(nameField);

        add(regLabel);
        add(regField);

        add(genderLabel);
        add(male);
        add(female);

        add(deptLabel);
        add(department);

        add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String gender = "";

                if (male.isSelected())
                    gender = "Male";
                else if (female.isSelected())
                    gender = "Female";

                String message =
                    "Student Name: " + nameField.getText() +
                    "\nRegister Number: " + regField.getText() +
                    "\nGender: " + gender +
                    "\nDepartment: " + department.getSelectedItem();

                JOptionPane.showMessageDialog(
                    StudentRegistration.this,
                    message
                );
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}