package team;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class starting extends JPanel {
    private ImageIcon Loading_image;
    private JLabel mainlb;
    private JFrame frame;
    private Border hackbord;
    
    starting(){
        // file path
        Loading_image = new ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team"
                + "\\loading.gif");
//        Loading_image = new ImageIcon(getClass().getClassLoader().getResource("team/loading.gif"));

        mainlb = new JLabel();
        hackbord = BorderFactory.createLineBorder(Color.CYAN, 3);
        setFrame();
        setProperties();
        addToPanel();
        
        try {
            Thread.sleep(2 * 1000);
        }
        
        catch (InterruptedException e) {
            System.out.println("Exception " +e.getMessage());
        }
        
        Login.main();
        frame.dispose();
    }

    void setFrame(){
        frame = new JFrame();
        frame.setContentPane(this);
        frame.setSize(500,281);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }   

    void setProperties(){
        this.setBackground(Color.BLACK);
        mainlb.setBounds(0,0,500,280);
        mainlb.setBorder(hackbord);
        mainlb.setIcon(Loading_image);
    }

    void addToPanel(){
        this.add(mainlb);
    }
    
    public static void main(String[] args) {
        new starting();
        
    }
}