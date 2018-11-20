package br.com.ia.predictor;

import br.com.ia.predictor.words.Word;
import br.com.ia.predictor.words.WordFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Predictor {

    private Word word;
    private Word mostApproximated;
    private Double result = 99999999.0;

    private final String PATH = "C:\\Users\\T2S-Murilo\\Desktop\\Predictor\\src\\main\\java\\br\\com\\ia\\predictor\\lib\\words.txt";

    public void setWord(String word) throws RuntimeException
    {
        try{
            this.word = new Word(word);
        }catch(Exception e){
            throw new RuntimeException("[ERROR] Ocorreu um erro durante a execução do processo. \n [ERROR] " + e);
        }
    }

    public void run() throws IOException
    {
        System.out.println("Calculando ... ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(PATH), "Cp1252"));

        while((reader.readLine()) != null) {
            calculate(reader.readLine(), this.word);
        }

        reader.close();
    }

    public void calculate(String stream, Word word)
    {
        Word wordStream = null;
        try{
            wordStream = WordFactory.generateWord(stream);
        }catch(NullPointerException npe){
            return;
        }

        Double result = Math.sqrt(
                (Math.pow((wordStream.getwLength() - word.getwLength()), 2)) +
                        (Math.pow((wordStream.getvLength() - word.getvLength()), 2)) +
                        (Math.pow((wordStream.getcLength() - word.getcLength()), 2)) +
                        (Math.pow((wordStream.getA() - word.getA()), 2)) +
                        (Math.pow((wordStream.getB() - word.getB()), 2)) +
                        (Math.pow((wordStream.getC() - word.getC()), 2)) +
                        (Math.pow((wordStream.getD() - word.getD()), 2)) +
                        (Math.pow((wordStream.getE() - word.getE()), 2)) +
                        (Math.pow((wordStream.getF() - word.getF()), 2)) +
                        (Math.pow((wordStream.getG() - word.getG()), 2)) +
                        (Math.pow((wordStream.getH() - word.getH()), 2)) +
                        (Math.pow((wordStream.getI() - word.getI()), 2)) +
                        (Math.pow((wordStream.getJ() - word.getJ()), 2)) +
                        (Math.pow((wordStream.getK() - word.getK()), 2)) +
                        (Math.pow((wordStream.getL() - word.getL()), 2)) +
                        (Math.pow((wordStream.getM() - word.getM()), 2)) +
                        (Math.pow((wordStream.getN() - word.getN()), 2)) +
                        (Math.pow((wordStream.getO() - word.getO()), 2)) +
                        (Math.pow((wordStream.getP() - word.getP()), 2)) +
                        (Math.pow((wordStream.getQ() - word.getQ()), 2)) +
                        (Math.pow((wordStream.getR() - word.getR()), 2)) +
                        (Math.pow((wordStream.getS() - word.getS()), 2)) +
                        (Math.pow((wordStream.getT() - word.getT()), 2)) +
                        (Math.pow((wordStream.getU() - word.getU()), 2)) +
                        (Math.pow((wordStream.getV() - word.getV()), 2)) +
                        (Math.pow((wordStream.getW() - word.getW()), 2)) +
                        (Math.pow((wordStream.getX() - word.getX()), 2)) +
                        (Math.pow((wordStream.getY() - word.getY()), 2)) +
                        (Math.pow((wordStream.getZ() - word.getZ()), 2)) +
                        (Math.pow((wordStream.getÀ() - word.getÀ()), 2)) +
                        (Math.pow((wordStream.getÁ() - word.getÁ()), 2)) +
                        (Math.pow((wordStream.getÂ() - word.getÂ()), 2)) +
                        (Math.pow((wordStream.getÃ() - word.getÃ()), 2)) +
                        (Math.pow((wordStream.getÉ() - word.getÉ()), 2)) +
                        (Math.pow((wordStream.getÈ() - word.getÈ()), 2)) +
                        (Math.pow((wordStream.getÊ() - word.getÊ()), 2)) +
                        (Math.pow((wordStream.getÌ() - word.getÌ()), 2)) +
                        (Math.pow((wordStream.getÍ() - word.getÍ()), 2)) +
                        (Math.pow((wordStream.getÎ() - word.getÎ()), 2)) +
                        (Math.pow((wordStream.getÔ() - word.getÔ()), 2)) +
                        (Math.pow((wordStream.getÕ() - word.getÕ()), 2)) +
                        (Math.pow((wordStream.getÓ() - word.getÓ()), 2)) +
                        (Math.pow((wordStream.getÒ() - word.getÒ()), 2)) +
                        (Math.pow((wordStream.getÙ() - word.getÙ()), 2)) +
                        (Math.pow((wordStream.getÚ() - word.getÚ()), 2)) +
                        (Math.pow((wordStream.getÙ() - word.getÙ()), 2))
        );

        if(result < this.result){
            this.mostApproximated = wordStream;
            this.result = result;
        }
    }

    public void show()
    {
        System.out.println("Você quis dizer: " + this.mostApproximated.getWord() + "?");
        System.out.println("A distância desta palavra com a informada é de " + this.result + " pontos.");
    }

    public void save() throws IOException
    {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(PATH, true), "Cp1252");
        writer.write(mostApproximated.getWord()
                +","+mostApproximated.getwLength()
                +","+mostApproximated.getvLength()
                +","+mostApproximated.getcLength()
                +","+mostApproximated.getA()
                +","+mostApproximated.getB()
                +","+mostApproximated.getC()
                +","+mostApproximated.getD()
                +","+mostApproximated.getE()
                +","+mostApproximated.getF()
                +","+mostApproximated.getG()
                +","+mostApproximated.getH()
                +","+mostApproximated.getI()
                +","+mostApproximated.getJ()
                +","+mostApproximated.getK()
                +","+mostApproximated.getL()
                +","+mostApproximated.getM()
                +","+mostApproximated.getN()
                +","+mostApproximated.getO()
                +","+mostApproximated.getP()
                +","+mostApproximated.getQ()
                +","+mostApproximated.getR()
                +","+mostApproximated.getS()
                +","+mostApproximated.getT()
                +","+mostApproximated.getU()
                +","+mostApproximated.getV()
                +","+mostApproximated.getW()
                +","+mostApproximated.getX()
                +","+mostApproximated.getY()
                +","+mostApproximated.getZ()
                +","+mostApproximated.getÀ()
                +","+mostApproximated.getÁ()
                +","+mostApproximated.getÂ()
                +","+mostApproximated.getÃ()
                +","+mostApproximated.getÉ()
                +","+mostApproximated.getÈ()
                +","+mostApproximated.getÊ()
                +","+mostApproximated.getÌ()
                +","+mostApproximated.getÍ()
                +","+mostApproximated.getÎ()
                +","+mostApproximated.getÔ()
                +","+mostApproximated.getÕ()
                +","+mostApproximated.getÓ()
                +","+mostApproximated.getÒ()
                +","+mostApproximated.getÙ()
                +","+mostApproximated.getÚ()
                +","+mostApproximated.getÙ() + "\n");
        System.out.println("A palavra [" + mostApproximated.getWord() + "] foi grifada e salva no dicionário de palavras.");
        writer.close();
    }
}
