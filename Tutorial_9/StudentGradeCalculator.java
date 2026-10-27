package Tutorial_9;
import javax.swing.*;
import java.awt.*;
class StudentModel {
    String name;
    double m1, m2, m3, total, average;
    String grade;

    void calculate(String name, double m1,
                   double m2, double m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

        total = m1 + m2 + m3;
        average = total / 3.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }
}

class StudentView extends JFrame {
    JTextField nameField = new JTextField(15);
    JTextField mark1 = new JTextField(5);
    JTextField mark2 = new JTextField(5);
    JTextField mark3 = new JTextField(5);
    JButton calculateButton = new JButton("Calculate Result");
    JLabel result = new JLabel("Enter student details");

    StudentView() {
        setTitle("Student Grade Calculator");
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Student Name:"));
        add(nameField);
        add(new JLabel("Subject 1 Marks:"));
        add(mark1);
        add(new JLabel("Subject 2 Marks:"));
        add(mark2);
        add(new JLabel("Subject 3 Marks:"));
        add(mark3);
        add(calculateButton);
        add(result);

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class StudentController {
    StudentModel model;
    StudentView view;

    StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        view.calculateButton.addActionListener(e -> calculate());
    }

    void calculate() {
        try {
            String name = view.nameField.getText().trim();
            double a = Double.parseDouble(view.mark1.getText());
            double b = Double.parseDouble(view.mark2.getText());
            double c = Double.parseDouble(view.mark3.getText());

            if (name.isEmpty() || a < 0 || a > 100 ||
                b < 0 || b > 100 || c < 0 || c > 100) {
                throw new IllegalArgumentException(
                    "Enter a name and marks from 0 to 100.");
            }

            model.calculate(name, a, b, c);

            view.result.setText(String.format(
                "Total: %.1f | Avg: %.2f | Grade: %s",
                model.total, model.average, model.grade));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view,
                "Enter valid numeric marks.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentModel model = new StudentModel();
            StudentView view = new StudentView();
            new StudentController(model, view);
        });
    }
}
