package Tutorial_8;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class CourseManagement extends JFrame {

    JList<String> courseList;
    JTable table;
    DefaultTableModel model;

    JTextField studentName;
    JButton addButton, removeButton;

    CourseManagement() {

        setTitle("Student Course Management");
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Course List
        String[] courses = {
            "Java Programming",
            "Python Programming",
            "Database Management",
            "Computer Networks",
            "Web Development"
        };

        courseList = new JList<>(courses);

        JScrollPane listScroll =
            new JScrollPane(courseList);

        // Student Name
        JPanel topPanel = new JPanel();

        topPanel.add(new JLabel("Student Name:"));

        studentName = new JTextField(15);
        topPanel.add(studentName);

        add(topPanel, BorderLayout.NORTH);

        // Table
        String[] columns = {
            "Student Name",
            "Selected Course",
            "Status"
        };

        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);

        JScrollPane tableScroll =
            new JScrollPane(table);

        // Buttons
        addButton = new JButton("Add Course");
        removeButton = new JButton("Remove Course");

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        // Center panel
        JPanel centerPanel = new JPanel(new GridLayout(1, 2));

        centerPanel.add(listScroll);
        centerPanel.add(tableScroll);

        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add Course
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = studentName.getText();
                String course = courseList.getSelectedValue();

                if (name.isEmpty() || course == null) {

                    JOptionPane.showMessageDialog(
                        CourseManagement.this,
                        "Enter student name and select a course"
                    );

                } else {

                    model.addRow(new Object[] {
                        name,
                        course,
                        "Enrolled"
                    });
                }
            }
        });

        // Remove Course
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int row = table.getSelectedRow();

                if (row >= 0) {
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(
                        CourseManagement.this,
                        "Select a row to remove"
                    );
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CourseManagement();
    }
}