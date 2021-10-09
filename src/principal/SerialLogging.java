package principal;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/*
 * Esta classe é responsável em criar os registros de chegada no pódio*
 *
 * */

public class SerialLogging extends JFrame implements Serializable {

    /* Cria um arquivo serializado em um path relativo
     *  Por questão de segurança deve ser colocado em um path absoluto.
     *  Este método apaga o conteúdo do arquivo    *
     * */

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String relativePath = "./log.ser";

    public static void clearLog(){

        try {

            File file = new File(relativePath);
            if(file.createNewFile()){

                FileOutputStream saida = new FileOutputStream(file.getAbsolutePath());
                ObjectOutputStream rank = new ObjectOutputStream(saida);
                rank.writeObject("");
                rank.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void setLogger(String evento) {
        try{

            File file = new File(relativePath);
            if(file.createNewFile()){

                FileOutputStream saida = new FileOutputStream(file.getAbsolutePath(), true);
                ObjectOutputStream rank = new ObjectOutputStream(saida);
                rank.writeObject(evento + '\n');
                rank.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getLogger() throws Exception {


        FileInputStream fileinputStream = new FileInputStream(relativePath);
        ObjectInputStream ioSer = new ObjectInputStream( fileinputStream );
        Object result = ioSer.readObject();
        ioSer.close();


        /*
         * Lendo o arquivo de texto com as posições de chegada
         * */
        String fileName = "./log.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String text;
            while((text = br.readLine()) != null){
                lines.add(text + "\n");
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        /*
         *  As vezes o metodo de leitura de arquivo dá erro e as vezes
         *  não lê todas as linhas; às vezes lê e considera as linhas em branco
         *  por isso, a sentença não usar o sinal de igualdade e sim o maior e o igual
         * */
        if(lines.size() >= 10){
            try {
                Thread.sleep(500);
                Podium.exibir( lines.toString()
                        .replace(",", "")
                        .replace("[", "")
                        .replace("]", "")
                );

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



}
