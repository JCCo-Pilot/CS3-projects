import java.awt.event.*;
import javax.swing.*;
public class KeyFrame extends JFrame implements KeyListener{
    public KeyFrame(){
        this.setTitle("FrameName");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,550);
        this.setVisible(true);
        this.setLayout(null);
        this.addKeyListener(this);
    }
    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
       
    }
    // called whenever a kep is released
    public void keyReleased(KeyEvent e){
        System.out.println("You released key char"+e.getKeyChar());
        System.out.println("You released key code"+e.getKeyCode());
    }
} 
