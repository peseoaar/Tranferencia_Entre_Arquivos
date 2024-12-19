package org.example;
import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = LerArquivo();
        System.out.println(nomes);
        EscreverArquivo(nomes);
    }

    public static ArrayList<String> LerArquivo() {
        ArrayList<String> nomes = new ArrayList<String>();

        try {
            FileReader arquivo = new FileReader("C://Users/pedro/IdeaProjects/ArrayList_Para_Arquivos/src/main/resources/data/nomes.txt");
            BufferedReader reader = new BufferedReader(arquivo);
            String linha;
            while ((linha = reader.readLine()) != null) {
                nomes.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nomes;
    }

    public static void EscreverArquivo(ArrayList<String> nomes){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users/pedro/IdeaProjects/ArrayList_Para_Arquivos/src/main/resources/data/nomesCopiados.txt", true));

            for(String linha : nomes){
                writer.write(linha);
                writer.newLine();
            }
                writer.flush();
                writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

