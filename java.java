import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class java {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        
        frame.setTitle("Student Helper Application");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        
        JLabel label = new JLabel("Student Name:");

        
        JTextField nameField = new JTextField(20);

       
        JButton button = new JButton("Submit");

        ActionListener listener = e -> {

           
            String name = nameField.getText();

            
            if (name.isEmpty()) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Please enter your name."
                );

            } else {

                JOptionPane.showMessageDialog(
                    frame,
                    "Welcome, " + name + "!"
                );
            }
        };

       
        button.addActionListener(listener);

       
        frame.add(label);
        frame.add(nameField);
        frame.add(button);

        
        frame.setVisible(true);
    }
}