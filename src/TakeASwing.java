import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


public class TakeASwing extends JFrame {
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton leftButton;
    private JButton rightButton;
    private JLabel leftLabel;
    private JLabel rightLabel;
    private boolean leftToggle = true;
    private boolean rightToggle = true;

    public TakeASwing() {
        super("Take a Swing!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the two panels
        leftPanel = new JPanel();
        rightPanel = new JPanel();

        // set the preferred size for the panels
        leftPanel.setPreferredSize(new Dimension(190, 150));
        rightPanel.setPreferredSize(new Dimension(190, 150));

        // set the layouts for the panels
        leftPanel.setLayout(new BorderLayout());
        rightPanel.setLayout(new BorderLayout());

        // set the background colors for the panels
        leftPanel.setBackground(Color.RED);
        rightPanel.setBackground(Color.BLACK);

        // create the labels for the panels
        leftLabel = new JLabel("This is the left box");
        rightLabel = new JLabel("This is the right box");

        // add the labels to the panels
        leftPanel.add(leftLabel, BorderLayout.CENTER);
        rightPanel.add(rightLabel, BorderLayout.CENTER);

        // create the buttons
        leftButton = new JButton("Left toggle");
        rightButton = new JButton("Right toggle");

        // add action listeners to the buttons
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleLeftPanel();
            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleRightPanel();
            }
        });

        // create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        // add the panels and button panel to the main frame
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.NORTH);

        setSize(400, 200);
        setVisible(true);
    }

    private void toggleLeftPanel() {
        leftToggle = !leftToggle;
        if (leftToggle) {
            leftPanel.setBackground(Color.RED);
            leftLabel.setText("This is the left box");
        } else {
            leftPanel.setBackground(Color.WHITE);
            leftLabel.setText("Left box is toggled");
        }
    }

    private void toggleRightPanel() {
        rightToggle = !rightToggle;
        if (rightToggle) {
            rightPanel.setBackground(Color.BLACK);
            rightLabel.setText("This is the right box");
        } else {
            rightPanel.setBackground(Color.WHITE);
            rightLabel.setText("Right box is toggled");
        }
    }

}
