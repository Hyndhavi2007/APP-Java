import javax.swing.JFrame;
import javax.swing.JLabel;
public class MAin2 {
public static void main(String[] args) {
JFrame frame = new JFrame();
frame.setTitle("Student Helper Application");
frame.setSize(500, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel label = new JLabel("Student Helper Application");
frame.add(label);
frame.setVisible(true);
}
}