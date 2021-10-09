package principal;

import javax.swing.*;
import java.util.Random;

public final class Cars extends JLabel implements Runnable {

   	private final String name;
    private int posx;
    private final int posy;


    public Cars(String name, ImageIcon imagem, int posx, int posy ){

        super(imagem);
        this.name = name;
        this.posx = posx;
        this.posy = posy;

        Thread carthread = new Thread(this, name);
        carthread.setName(name);
        carthread.start();
    }


    @Override
    public void run() {
        posx = posx + new Random().nextInt(3);
        this.setLocation(posx, posy);
        int screenWidth = 1000;
        if(posx >= screenWidth) {
            Logging.setLogger(this.name);
            if(posx == screenWidth){
                try {
                    Logging.getLogger();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            return;
        }
        try{
            Thread.sleep(new Random().nextInt(5));
            run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
