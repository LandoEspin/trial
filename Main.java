import javax.swing.JFrame;

public class Main
{


    static JFrame mainFrame = createMainFrame();


    static JFrame createMainFrame()
    {
        JFrame window = new JFrame();
        window.setSize(1200, 800);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        return window;
    }    
    
    public static void main(String args[])
    {
       
       new LoginWindowController(mainFrame);
    }

    
}
