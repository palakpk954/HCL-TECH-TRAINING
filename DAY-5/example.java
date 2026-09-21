import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

class Example {

    static class FanPanel extends JPanel {
        private double angle;
        private boolean running;
        private final Timer timer;

        FanPanel() {
            setBackground(Color.WHITE);
            timer = new Timer(40, event -> {
                angle += 0.15;
                repaint();
            });
        }

        void setRunning(boolean running) {
            this.running = running;
            if (running) {
                timer.start();
            } else {
                timer.stop();
            }
            repaint();
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            Graphics2D g = (Graphics2D) graphics;
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            g.setColor(running ? Color.BLUE : Color.GRAY);
            g.fillOval(centerX - 12, centerY - 12, 24, 24);

            g.translate(centerX, centerY);
            g.rotate(angle);
            for (int blade = 0; blade < 4; blade++) {
                g.rotate(Math.PI / 2);
                g.fillOval(-10, -75, 20, 70);
            }
            g.rotate(-angle);
            g.translate(-centerX, -centerY);
            g.setColor(Color.DARK_GRAY);
            g.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel fanStatus = new JLabel("Fan: OFF");
        fanStatus.setBounds(140, 40, 120, 30);
        frame.add(fanStatus);

        FanPanel fanPanel = new FanPanel();
        fanPanel.setBounds(100, 120, 200, 180);
        frame.add(fanPanel);

        JButton onButton = new JButton("ON");
        onButton.setBounds(80, 80, 100, 40);
        onButton.addActionListener(event -> {
            fanStatus.setText("Fan: ON");
            fanPanel.setRunning(true);
        });
        frame.add(onButton);

        JButton offButton = new JButton("OFF");
        offButton.setBounds(200, 80, 100, 40);
        offButton.addActionListener(event -> {
            fanStatus.setText("Fan: OFF");
            fanPanel.setRunning(false);
        });
        frame.add(offButton);

        JCheckBox c1 = new JCheckBox("--Option1--");
        c1.setBounds(80, 160, 120, 40);
        JCheckBox c2 = new JCheckBox("--Option2--");
        c2.setBounds(80, 210, 120, 40);
        JCheckBox c3 = new JCheckBox("--Option3--");
        c3.setBounds(80, 260, 120, 40);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);

        frame.setSize(400, 380);
        frame.setVisible(true);
    }
}