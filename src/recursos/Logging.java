package recursos;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/*
* Esta classe é responsável em criar os registros de chegada no pódio*
*
* */

public class Logging extends JFrame implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String relativePath = "./log.txt";

    public static void clearLog(){

        try {

            PrintWriter writer;
            writer = new PrintWriter(relativePath);
            writer.print("");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void setLogger(String evento) {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(relativePath,true) );
            bufferedWriter.write(evento + '\n');
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
     * Lendo o arquivo de texto com as posições de chegada
     * */

    public static void getLogger() {

        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(relativePath))) {

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
        if(lines.size() > 10){
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
