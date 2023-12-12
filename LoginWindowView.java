import javax.swing.*;
import java.awt.*;

public class LoginWindowView 
{
    static void addPanel(JPanel displayPanel, JFrame window, int x, int y, int width, int height)
    {
        displayPanel.setBounds(x, y, width, height);
        displayPanel.setLayout(null);

        window.add(displayPanel);
    }

    static void addLabel(JLabel displayLabel, JPanel displayPanel, JFrame window, int x, int y, int width, int height, int fontSize, String fontStyle)
    {
        displayLabel.setBounds(x, y, width, height);
        displayLabel.setFont(new Font(fontStyle, Font.BOLD, fontSize));
        displayPanel.add(displayLabel);

        window.add(displayPanel);
    }

    static void addTextField(JTextField displayTextField, JPanel displayPanel, JFrame window, int x, int y, int width, int height, int fontSize, String fontStyle)
    {
        displayTextField.setBounds(x, y, width, height);
        displayTextField.setFont(new Font(fontStyle, Font.BOLD, fontSize));
        displayPanel.add(displayTextField);

        window.add(displayPanel);
    }

    static void addPasswordField(JPasswordField displayPasswordField, JPanel displayPanel, JFrame window, int x, int y, int width, int height, int fontSize, String fontStyle)
    {
        displayPasswordField.setBounds(x, y, width, height);
        displayPasswordField.setFont(new Font(fontStyle, Font.BOLD, fontSize));
        displayPanel.add(displayPasswordField);

        window.add(displayPanel);
    }

    static void addButtons(JButton displayButton, JPanel displayPanel, JFrame window, int x, int y, int width, int height, int fontSize, String fontStyle)
    {
        displayButton.setBounds(x, y, width, height);
        displayButton.setFont(new Font(fontStyle, Font.BOLD, fontSize));
        displayButton.setBorder(null);
        displayButton.setFocusPainted(false);
        displayButton.setFocusable(false);   
        displayPanel.add(displayButton);
 
        window.add(displayPanel);
    }

    static void clearFrame(JFrame window)
    {
        window.getContentPane().removeAll();
        window.revalidate();
        window.repaint();

    }
}
