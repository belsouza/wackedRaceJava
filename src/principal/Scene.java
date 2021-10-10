package principal;

import javax.swing.*;
import java.awt.*;

/*
 *  Essa classe forma o painel principal da aplicação
 *  Todos os clips de filme são jlabels que tem duas instâncias:
 *  uma estática, que os exibe no painel, e  outra dinamica, que é inciada clicando o botão
 *
 *

 * */
public class Scene extends JFrame {

    private final JLabel lbl_pista;

    private JLabel lbl_carro00;
    private JLabel lbl_carro01;
    private JLabel lbl_carro02;
    private JLabel lbl_carro03;
    private JLabel lbl_carro04;
    private JLabel lbl_carro05;
    private JLabel lbl_carro06;
    private JLabel lbl_carro07;
    private JLabel lbl_carro08;
    private JLabel lbl_carro09;
    private JLabel lbl_carro10;

    public Scene() {

        super("Crazy running");
        setLayout( new GroupLayout( getContentPane()));
        setResizable(false);
        getContentPane().setBackground(Color.PINK);

        lbl_pista = new JLabel(new ImageIcon("./src/images/cenarium.jpg"));
        lbl_pista.setBounds(0, 0, 1200, 680);


        ImageIcon carro1 = new ImageIcon("./src/images/wacked_race-01.png");
        ImageIcon carro2 = new ImageIcon("./src/images/wacked_race-02.png");
        ImageIcon carro3 = new ImageIcon("./src/images/wacked_race-03.png");
        ImageIcon carro4 = new ImageIcon("./src/images/wacked_race-04.png");
        ImageIcon carro5 = new ImageIcon("./src/images/wacked_race-05.png");
        ImageIcon carro6 = new ImageIcon("./src/images/wacked_race-06.png");
        ImageIcon carro7 = new ImageIcon("./src/images/wacked_race-07.png");
        ImageIcon carro8 = new ImageIcon("./src/images/wacked_race-08.png");
        ImageIcon carro9 = new ImageIcon("./src/images/wacked_race-09.png");
        ImageIcon carro10 = new ImageIcon("./src/images/wacked_race-10.png");
        ImageIcon carro11 = new ImageIcon("./src/images/wacked_race-11.png");

        lbl_carro00 = new JLabel(carro1);
        lbl_carro00.setBounds(12, 5, 100, 100);

        lbl_carro01 = new JLabel(carro2);
        lbl_carro01.setBounds(52, 70, 50, 50);

        lbl_carro02 = new JLabel(carro3);
        lbl_carro02.setBounds(12, 100, 100, 100);

        lbl_carro03 = new JLabel(carro4);
        lbl_carro03.setBounds(12, 160, 100, 100);

        lbl_carro04 = new JLabel(carro5);
        lbl_carro04.setBounds(12, 205, 100, 100);

        lbl_carro05 = new JLabel(carro6);
        lbl_carro05.setBounds(12, 250, 100, 100);

        lbl_carro06 = new JLabel(carro7);
        lbl_carro06.setBounds(12, 311, 100, 100);

        lbl_carro07 = new JLabel(carro8);
        lbl_carro07.setBounds(12, 365, 100, 100);

        lbl_carro08 = new JLabel(carro9);
        lbl_carro08.setBounds(12, 408, 100, 100);

        lbl_carro09 = new JLabel(carro10);
        lbl_carro09.setBounds(0, 450, 100, 100);

        lbl_carro10 = new JLabel(carro11);
        lbl_carro10.setBounds(12, 495, 100, 100);

        lbl_pista.add( lbl_carro00 );
        lbl_pista.add( lbl_carro01 );
        lbl_pista.add( lbl_carro02 );
        lbl_pista.add( lbl_carro03 );
        lbl_pista.add( lbl_carro04 );
        lbl_pista.add( lbl_carro05 );
        lbl_pista.add( lbl_carro06 );
        lbl_pista.add( lbl_carro07 );
        lbl_pista.add( lbl_carro08 );
        lbl_pista.add( lbl_carro09 );
        lbl_pista.add( lbl_carro10 );


        JButton btn_start = new JButton( new ImageIcon("./src/images/btn-01.png") );
        btn_start.setBounds(500, 600, 80, 40 );

        btn_start.addActionListener(e -> {

            Logging.clearLog(); //grava a ordem de chegada

            lbl_carro00.setVisible(false);
            lbl_carro00 = setLabelCar("Máquina do Mal", carro1, 12, 0);
            lbl_pista.add(lbl_carro00);

            lbl_carro01.setVisible(false);
            lbl_carro01 = setLabelCar("Carro de Pedra", carro2, 12, 40);
            lbl_pista.add(lbl_carro01);

            lbl_carro02.setVisible(false);
            lbl_carro02 = setLabelCar("Cupê Mal-Assombrado", carro3, 12, 90);
            lbl_pista.add(lbl_carro02);

            lbl_carro03.setVisible(false);
            lbl_carro03 = setLabelCar("Carro Mágico", carro4, 12, 150);
            lbl_pista.add(lbl_carro03);

            lbl_carro04.setVisible(false);
            lbl_carro04 = setLabelCar("Máquina Voadora", carro5, 12, 195);
            lbl_pista.add(lbl_carro04);

            lbl_carro05.setVisible(false);
            lbl_carro05 = setLabelCar("Carrinho pra frente", carro6, 12, 240);
            lbl_pista.add(lbl_carro05);

            lbl_carro06.setVisible(false);
            lbl_carro06 = setLabelCar("Carro Tanque", carro7, 12, 300);
            lbl_pista.add(lbl_carro06);

            lbl_carro07.setVisible(false);
            lbl_carro07 = setLabelCar("Carro a Prova de Balas", carro8, 12, 350);
            lbl_pista.add(lbl_carro07);

            lbl_carro08.setVisible(false);
            lbl_carro08 = setLabelCar("Carroça a Vapor", carro9, 12, 390);
            lbl_pista.add(lbl_carro08);

            lbl_carro09.setVisible(false);
            lbl_carro09 = setLabelCar("Carrão Aerodinâmico", carro10, 12, 430);
            lbl_pista.add(lbl_carro09);

            lbl_carro10.setVisible(false);
            lbl_carro10 = setLabelCar("Carro-Tronco", carro11, 12, 470);
            lbl_pista.add(lbl_carro10);

            lbl_pista.revalidate();
            lbl_pista.repaint();
        });

        JButton btn_cancel = new JButton(new ImageIcon("./src/images/btn-02.png"));
        btn_cancel.setBounds(600, 600, 80, 40 );
        btn_cancel.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,"Bye!");
            System.exit(0);
        });

        //Em camadas


        this.add(btn_start);
        this.add(btn_cancel);
        this.add(lbl_pista);

        this.revalidate();
        this.repaint();

    }

    /*
    *  Retorna um jlabel que funciona como um movieClip
    *  A animação é feita pela classe Cars que implementa Runnable.
    *  Recebe o nome, a imagem e a posição inicial como argumentos.
    *
    *  @param  nome  o nome do clipe
     * @param  img  a imagem do objeto, em um objeto tipo ImageIcon
     * @param posX  a posiçõa do objeto no eixo x
     * @param posY  a posiçõa do objeto no eixo y
     * @return      o jlabel como um clipe de filme
     * @see         JLabel
    * */

    public JLabel setLabelCar(String nome, ImageIcon img, int posX, int posY) {
        Cars carro = new Cars(nome, img, posX, posY);
        carro.setOpaque(false);
        carro.setSize(256, 141);
        carro.setVisible(true);
        this.add(carro);
        return carro;
    }

/*
*  É o painel principal. O nome do método era a antiga main,
*  mas foi decidido que seria executado após um tempo, por isso
*  a main passou para a classe Splash.
* */
    public static void executeScene() {
        Scene scene = new Scene();
        scene.setVisible(true);
        scene.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scene.setSize(1200,680);
        scene.setLocationRelativeTo(null);
    }



}
