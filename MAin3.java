import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
public class MAin3{
public static void main(String[] args) {
JFrame frame = new JFrame();
frame.setTitle("Student Helper Application");
frame.setSize(500, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout());
JLabel label = new JLabel("Student Name:");
JTextField nameField = new JTextField(20);
frame.add(label);
frame.add(nameField);
frame.setVisible(true);
}
}