import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class example {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JLabel label = new JLabel("---Select Option");
        label.setBounds(100, 120, 80, 50);
        label.add(frame);

        JCheckBox c1 = new JCheckBox("--Option1--");
        c1.setBounds(100, 180, 80, 50);
        JCheckBox c2 = new JCheckBox("--Option2--");
        c2.setBounds(100, 120, 130, 50);
        JCheckBox c3 = new JCheckBox("--Option3--");
        c3.setBounds(100, 120, 180, 50);
        c1.add(frame);
        c2.add(frame);
        c3.add(frame);

        frame.setSize(400, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}