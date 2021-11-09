package recursos;

import javax.swing.*;
import java.awt.*;


public class Podium extends MyPanel {

    public Podium() {
        super();
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
