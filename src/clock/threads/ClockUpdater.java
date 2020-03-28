package clock.threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author tchaikalis
 */
public class ClockUpdater extends Thread {
    
    JLabel label;
    int period;

    public ClockUpdater(JLabel label, int period) {
        this.label = label;
        this.period = period;
    }

    @Override
    public void run() {
        while(true){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date now  = new Date();
            label.setText(dateFormat.format(now));
            try {
                Thread.sleep(period);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockUpdater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
