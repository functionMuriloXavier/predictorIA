package br.com.ia;

import br.com.ia.predictor.Predictor;
import br.com.ia.predictor.job.Job;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Job utilizado para transcrever as palavras do lib.txt para o dicionário words.txt.
        //Job job = new Job();
        //job.exec();

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra: \n");
            String word = scanner.next();

            if(word == "0"){
                break;
            }

            Predictor predictor = new Predictor();
            predictor.setWord(word);
            predictor.run();
            predictor.show();
            predictor.save();
        }
    }
}
