package recursos;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class MyPanel extends JPanel{

    /**
     *
     */
    private BufferedImage image;

    public MyPanel( String texto ){
        this.setOpaque(false);
        this.setSize(600, 434);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setOpaque(false);
        jTextArea.setText(texto);
        jTextArea.setRows(10);
        jTextArea.setColumns(5);
        jTextArea.setBorder(new EmptyBorder(175, 40,30,30));
        this.add(jTextArea);

        this.repaint();
        this.revalidate();

        try{
            image = ImageIO.read(new File("./src/images/splash-03.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public MyPanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, 600, 434, this);
    }
}