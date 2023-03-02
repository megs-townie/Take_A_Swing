import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Take A Swing!");
        setSize(640, 260);
        setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.RED);
        leftPanel.setPreferredSize(new Dimension(320, 0));
        add(leftPanel, BorderLayout.WEST);
        JLabel leftLabel = new JLabel("Left Panel Title");
        leftLabel.setForeground(Color.BLUE);
        leftLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        leftLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftPanel.add(leftLabel, BorderLayout.NORTH);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.BLUE);
        rightPanel.setPreferredSize(new Dimension(320, 0));
        add(rightPanel, BorderLayout.EAST);
        JLabel rightLabel = new JLabel("Right Panel Title");
        rightLabel.setForeground(Color.RED);
        rightLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        rightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanel.add(rightLabel, BorderLayout.NORTH);

        JButton button1 = new JButton("Toggle Left");
        JButton button2 = new JButton("Toggle Right");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 0));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        add(buttonPanel, BorderLayout.NORTH);

        int buttonWidth = (640 - (6 * 50)) / 2;
        button1.setPreferredSize(new Dimension(buttonWidth, 50));
        button2.setPreferredSize(new Dimension(buttonWidth, 50));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
