import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TemperatureSlider extends JFrame implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    TemperatureSlider() {

        frame = new JFrame("Temperature Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 72);

        label.setFont(new Font("Helvetica", Font.PLAIN, 12));

        slider.addChangeListener(this);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setFont(new Font("Helvetica", Font.BOLD, 15));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText(slider.getValue() + " °F");

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == slider) {
            label.setText(slider.getValue() + " °F");
        }
    }
}
