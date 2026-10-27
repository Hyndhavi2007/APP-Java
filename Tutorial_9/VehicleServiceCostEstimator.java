package Tutorial_9;
import javax.swing.*;
import java.awt.*;
class VehicleModel {
    int calculateCost(boolean general, boolean oil,
                       boolean brake, boolean battery) {
        int total = 0;
        if (general) total += 1000;
        if (oil) total += 800;
        if (brake) total += 1200;
        if (battery) total += 500;
        return total;
    }
}
class VehicleView extends JFrame {
    JTextField regField = new JTextField(15);
    JComboBox<String> vehicleType = new JComboBox<>(
        new String[]{"Two Wheeler", "Car"});
    JCheckBox general = new JCheckBox("General Service - Rs.1000");
    JCheckBox oil = new JCheckBox("Oil Change - Rs.800");
    JCheckBox brake = new JCheckBox("Brake Service - Rs.1200");
    JCheckBox battery = new JCheckBox("Battery Check - Rs.500");
    JButton calculate = new JButton("Calculate Cost");
    JLabel result = new JLabel("Total Cost: Rs.0");
    VehicleView() {
        setTitle("Vehicle Service Cost Estimator");
        setLayout(new GridLayout(8, 2, 5, 5));
        add(new JLabel("Registration Number:"));
        add(regField);
        add(new JLabel("Vehicle Type:"));
        add(vehicleType);
        add(general);
        add(oil);
        add(brake);
        add(battery);
        add(calculate);
        add(result);

        setSize(450, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class VehicleController {
    VehicleModel model;
    VehicleView view;

    VehicleController(VehicleModel model, VehicleView view) {
        this.model = model;
        this.view = view;
        view.calculate.addActionListener(e -> calculate());
    }

    void calculate() {
        if (view.regField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(view,
                "Enter the vehicle registration number.");
            return;
        }

        int total = model.calculateCost(
            view.general.isSelected(),
            view.oil.isSelected(),
            view.brake.isSelected(),
            view.battery.isSelected()
        );

        JOptionPane.showMessageDialog(view,
            "Registration: " + view.regField.getText()
            + "\nVehicle Type: " + view.vehicleType.getSelectedItem()
            + "\nTotal Service Cost: Rs." + total);

        view.result.setText("Total Cost: Rs." + total);
    }
}

public class VehicleServiceCostEstimator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VehicleModel model = new VehicleModel();
            VehicleView view = new VehicleView();
            new VehicleController(model, view);
        });
    }
}

