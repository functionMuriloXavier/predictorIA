package br.com.ia.predictor.job;

import br.com.ia.predictor.words.Word;

import java.io.*;

public class Job {
    private final String ORIGIN = "C:\\Users\\T2S-Murilo\\Desktop\\Predictor\\src\\main\\java\\br\\com\\ia\\predictor\\lib\\lib.txt";
    private final String TARGET = "C:\\Users\\T2S-Murilo\\Desktop\\Predictor\\src\\main\\java\\br\\com\\ia\\predictor\\lib\\words.txt";

    public void exec() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ORIGIN), "Cp1252"));
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(TARGET), "Cp1252");

        while ((reader.readLine()) != null){
            Word word = new Word(reader.readLine());
            writer.write(word.getWord()
                    +","+word.getwLength()
                    +","+word.getvLength()
                    +","+word.getcLength()
                    +","+word.getA()
                    +","+word.getB()
                    +","+word.getC()
                    +","+word.getD()
                    +","+word.getE()
                    +","+word.getF()
                    +","+word.getG()
                    +","+word.getH()
                    +","+word.getI()
                    +","+word.getJ()
                    +","+word.getK()
                    +","+word.getL()
                    +","+word.getM()
                    +","+word.getN()
                    +","+word.getO()
                    +","+word.getP()
                    +","+word.getQ()
                    +","+word.getR()
                    +","+word.getS()
                    +","+word.getT()
                    +","+word.getU()
                    +","+word.getV()
                    +","+word.getW()
                    +","+word.getX()
                    +","+word.getY()
                    +","+word.getZ()
                    +","+word.getÀ()
                    +","+word.getÁ()
                    +","+word.getÂ()
                    +","+word.getÃ()
                    +","+word.getÉ()
                    +","+word.getÈ()
                    +","+word.getÊ()
                    +","+word.getÌ()
                    +","+word.getÍ()
                    +","+word.getÎ()
                    +","+word.getÔ()
                    +","+word.getÕ()
                    +","+word.getÓ()
                    +","+word.getÒ()
                    +","+word.getÙ()
                    +","+word.getÚ()
                    +","+word.getÙ() + "\n");
            System.out.println("[" + reader.readLine() + "] escrito com sucesso.");
        }

        writer.close();
        reader.close();
    }
}
