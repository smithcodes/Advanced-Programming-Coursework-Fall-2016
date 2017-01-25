
package BoxCostCalculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author up770785
 */
public class UI {
    private String wTitle;
    private int wSizeX;
    private int wSizeY;
    //private JFrame window;
    private FlowLayout layoutm;
    
    /**public UI(String title, int x, int y) {
        wTitle = title;
        wSizeX = x;
        wSizeY = y;
        layoutm = new FlowLayout();
    }
    **/
/**    public void init() {
        System.out.println(wTitle);
        window = new JFrame(wTitle);
        window.setSize(wSizeX, wSizeY);
        window.setLayout(layoutm);
        window.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        window.setLocationRelativeTo(null); // show at the center of the screen
    }
    
    public void basicUserInput(){
        JLabel lblHeight = new JLabel("Enter height");
        JLabel lblWidth = new JLabel("Enter Width");
        JLabel lblLength = new JLabel("Enter Length");
        JTextField txtHeight = new JTextField("Enter height");
        JTextField txtWidth = new JTextField("Enter width");
        JTextField txtLength = new JTextField("Enter length");
        layoutm.setHgap(30);
        layoutm.setVgap(30);
        window.add(lblHeight);
        window.add(txtHeight);
        window.add(lblWidth);
        window.add(txtWidth);
        window.add(lblLength);
        window.add(txtLength);
        window.setVisible(true);
    }
   **/
    
    public static void main(String[] args) {
//       UI fc = new UI("FlexBox calc", 400, 400);
//       fc.init();
//       fc.basicUserInput();
        GUI mainUI = new GUI();
        mainUI.setVisible(true);
        mainUI.setLocationRelativeTo(null);
        mainUI.setResizable(false);
        mainUI.disableAll();
    }
}
