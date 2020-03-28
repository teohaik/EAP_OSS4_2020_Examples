package clock.threads;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tchaikalis
 */
public class DoubleClockFrame  extends JFrame {
    
    JLabel lblClock1, lblClock2;

    public DoubleClockFrame() {
        super("Double Clock Frame");
        lblClock1 = new JLabel();
        lblClock2 = new JLabel();
        Font arial = new Font("Arial", Font.BOLD, 30);
        lblClock1.setFont(arial);
        lblClock2.setFont(arial);
        
        add(lblClock1, BorderLayout.NORTH);
        add(lblClock2, BorderLayout.SOUTH);
        
        ClockUpdater clockUpdater1 = new ClockUpdater(lblClock1, 1);
        ClockUpdater clockUpdater2 = new ClockUpdater(lblClock2, 10);
        
        clockUpdater1.start();
        clockUpdater2.start();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new DoubleClockFrame();
    }
    
    
    
}
