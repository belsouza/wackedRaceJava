package principal;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class MyPanel extends JPanel{

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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, 600, 434, this);
    }
}

public class Podium {

    public Podium() {
    }


    public static void exibir( String texto ) {

        JFrame frame = new JFrame();
        frame.setTitle("Pódio");
        JButton button = new JButton(new ImageIcon("./src/images/btn-03.png"));
        button.setBounds(260, 370, 80, 40);
        button.addActionListener(e->{
            //frame.dispose(); -> Fecha o Jframe
            System.exit(0); //Fecha a aplicação
        });
        frame.add(button);
        frame.add( new MyPanel( texto ) );
        frame.setSize(600, 434);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true); //transparente
        frame.setBackground(new Color(0, 0, 0, 0)); //transparente
        frame.setVisible(true);
        frame.repaint();
        frame.revalidate();
    }

}
