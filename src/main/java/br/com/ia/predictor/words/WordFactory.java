package br.com.ia.predictor.words;

public class WordFactory {
    public static Word generateWord(String bufferInput)
    {
        String[] values = bufferInput.split(",");
        return new Word(values[0],
                Integer.parseInt(values[1]),
                Integer.parseInt(values[2]),
                Integer.parseInt(values[3]),
                Integer.parseInt(values[4]),
                Integer.parseInt(values[5]),
                Integer.parseInt(values[6]),
                Integer.parseInt(values[7]),
                Integer.parseInt(values[8]),
                Integer.parseInt(values[9]),
                Integer.parseInt(values[10]),
                Integer.parseInt(values[11]),
                Integer.parseInt(values[12]),
                Integer.parseInt(values[13]),
                Integer.parseInt(values[14]),
                Integer.parseInt(values[15]),
                Integer.parseInt(values[16]),
                Integer.parseInt(values[17]),
                Integer.parseInt(values[18]),
                Integer.parseInt(values[19]),
                Integer.parseInt(values[20]),
                Integer.parseInt(values[21]),
                Integer.parseInt(values[22]),
                Integer.parseInt(values[23]),
                Integer.parseInt(values[24]),
                Integer.parseInt(values[25]),
                Integer.parseInt(values[26]),
                Integer.parseInt(values[27]),
                Integer.parseInt(values[28]),
                Integer.parseInt(values[29]),
                Integer.parseInt(values[30]),
                Integer.parseInt(values[31]),
                Integer.parseInt(values[32]),
                Integer.parseInt(values[33]),
                Integer.parseInt(values[34]),
                Integer.parseInt(values[35]),
                Integer.parseInt(values[36]),
                Integer.parseInt(values[37]),
                Integer.parseInt(values[38]),
                Integer.parseInt(values[39]),
                Integer.parseInt(values[40]),
                Integer.parseInt(values[41]),
                Integer.parseInt(values[42]),
                Integer.parseInt(values[43]),
                Integer.parseInt(values[44]),
                Integer.parseInt(values[45]),
                Integer.parseInt(values[46]));
    }
}