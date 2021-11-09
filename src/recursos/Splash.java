package recursos;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Splash extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Timer timer;
    JFrame splash;

    public Splash(int seconds){

        splash = new JFrame();
        JLabel jLabel = new JLabel(new ImageIcon("./src/images/splash.jpg"));
        splash.setBounds(0, 0, 426, 309);
        splash.add(jLabel);
        splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        splash.setExtendedState(JFrame.MAXIMIZED_BOTH);
        splash.setUndecorated(true);
        splash.setVisible(true);
        splash.setSize(426,309);
        splash.setLayout(new GridBagLayout());
        splash.setLocationRelativeTo(null);
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {

        public void run() {

            splash.setVisible(false);
            timer.cancel();
            timer.purge();
            Scene.executeScene();           
        }
    }

    /*
    *  Chama a tela de apresentação após 3 segundos
    *
    * */
}
