import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginWindowController
{
    private JFrame mainFrame;
    private JPanel loginWindowPanel;

    private JButton loginButton;
    private JButton registerButton;
    private JButton backButton;

    private JTextField usernameTextField;
    private JPasswordField passwordTextField;

    private String fontStyle = "Baskerville Old Face";

    public LoginWindowController(JFrame mainFrame)
    {
        this.mainFrame = mainFrame;

        loginWindowPanel = new JPanel();
        LoginWindowView.addPanel(loginWindowPanel, mainFrame, 0, 0, 1200, 800);

        //----------------------------------------LABELS AND TEXTFIELDS/PASSOWRDFIELDS----------------------------------------//

        JLabel loginLabel = new JLabel("Login");
        LoginWindowView.addLabel(loginLabel, loginWindowPanel, mainFrame, 720, 70, 300, 50, 50, fontStyle);

        JLabel usernamLabel = new JLabel("Username");
        LoginWindowView.addLabel(usernamLabel, loginWindowPanel, mainFrame, 720, 180, 200, 30, 30, fontStyle);

        usernameTextField = new JTextField();
        LoginWindowView.addTextField(usernameTextField, loginWindowPanel, mainFrame, 720, 210, 400, 35, 30, fontStyle);

        JLabel passwordLabel = new JLabel("Password");
        LoginWindowView.addLabel(passwordLabel, loginWindowPanel, mainFrame, 720, 280, 200, 30, 30, fontStyle);

        passwordTextField = new JPasswordField();
        LoginWindowView.addPasswordField(passwordTextField, loginWindowPanel, mainFrame, 720, 310, 400, 35, 30, fontStyle);

        //-----------------------------------------BUTTONS---------------------------------------------------//

        loginButton = new JButton("Log In");
        LoginWindowView.addButtons(loginButton, loginWindowPanel, mainFrame, 720, 400, 400, 40, 30, fontStyle);
        

        registerButton = new JButton("Create an Account");
        LoginWindowView.addButtons(registerButton, loginWindowPanel, mainFrame, 820, 500, 200, 40, 20, fontStyle);
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                
            }
        });

        backButton = new JButton("Back");
        LoginWindowView.addButtons(backButton, loginWindowPanel, mainFrame, 0, 10, 120, 40, 20, fontStyle);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                //LoginWindowView.clearFrame(mainFrame);
                //new MainMenuController(mainFrame);
            }
        });
      

        mainFrame.setVisible(true);
    }
}
