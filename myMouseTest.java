import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class myMouseTest extends JFrame implements MouseListener{
    public myMouseTest(){
        this.setTitle("FrameName");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,550);
        this.setVisible(true);
        this.setLayout(null);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {  
        System.out.println("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        System.out.println("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        System.out.println("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        System.out.println("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        System.out.println("Mouse Released");  
    }  
}
