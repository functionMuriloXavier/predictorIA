package br.com.ia.predictor.words;

public class Word {

    private final String[] VOGALS = {"A","E","I","O","U"};
    private final String[] CONSONANTS = {"B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};

    private String word;
    private Integer wLength;
    private Integer vLength;
    private Integer cLength;

    private Integer A;
    private Integer B;
    private Integer C;
    private Integer D;
    private Integer E;
    private Integer F;
    private Integer G;
    private Integer H;
    private Integer I;
    private Integer J;
    private Integer K;
    private Integer L;
    private Integer M;
    private Integer N;
    private Integer O;
    private Integer P;
    private Integer Q;
    private Integer R;
    private Integer S;
    private Integer T;
    private Integer U;
    private Integer V;
    private Integer W;
    private Integer X;
    private Integer Y;
    private Integer Z;
    private Integer À;
    private Integer Á;
    private Integer Â;
    private Integer Ã;
    private Integer È;
    private Integer É;
    private Integer Ê;
    private Integer Í;
    private Integer Ì;
    private Integer Î;
    private Integer Ô;
    private Integer Õ;
    private Integer Ó;
    private Integer Ò;
    private Integer Ú;
    private Integer Ù;
    private Integer Û;

    public Word(String word)
    {
        this.word = word.toUpperCase();
        this.wLength = word.length();
        this.vLength = 0;
        this.cLength = 0;
        A = 0;B = 0;C = 0;D = 0;E = 0;F = 0;G = 0;H = 0;I = 0;J = 0;
        K = 0;L = 0;M = 0;N = 0;O = 0;P = 0;Q = 0;R = 0;S = 0;T = 0;
        U = 0;V = 0;W = 0;X = 0;Y = 0;Z = 0;À = 0;Á = 0;Â = 0;Ã = 0;
        È = 0;É = 0;Ê = 0;Í = 0;Ì = 0;Î = 0;Ô = 0;Õ = 0;Ó = 0;Ò = 0;
        Ú = 0;Ù = 0;Û = 0;
        defineCV();
    }

    public Word(String word, Integer wLength, Integer vLength, Integer cLength, Integer a, Integer b, Integer c, Integer d, Integer e, Integer f, Integer g, Integer h, Integer i, Integer j, Integer k, Integer l, Integer m, Integer n, Integer o, Integer p, Integer q, Integer r, Integer s, Integer t, Integer u, Integer v, Integer w, Integer x, Integer y, Integer z, Integer à, Integer á, Integer â, Integer ã, Integer è, Integer é, Integer ê, Integer í, Integer ì, Integer î, Integer ô, Integer õ, Integer ó, Integer ò, Integer ú, Integer ù, Integer û) {
        this.word = word;
        this.wLength = wLength;
        this.vLength = vLength;
        this.cLength = cLength;
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
        G = g;
        H = h;
        I = i;
        J = j;
        K = k;
        L = l;
        M = m;
        N = n;
        O = o;
        P = p;
        Q = q;
        R = r;
        S = s;
        T = t;
        U = u;
        V = v;
        W = w;
        X = x;
        Y = y;
        Z = z;
        À = à;
        Á = á;
        Â = â;
        Ã = ã;
        È = è;
        É = é;
        Ê = ê;
        Í = í;
        Ì = ì;
        Î = î;
        Ô = ô;
        Õ = õ;
        Ó = ó;
        Ò = ò;
        Ú = ú;
        Ù = ù;
        Û = û;
    }

    public void defineCV()
    {
        for(int i = 0; i < this.wLength; i++){
            for(int j = 0; j < this.VOGALS.length; j++){
                if(this.VOGALS[j].equals(this.word.toUpperCase().substring(i, i+1))){
                    this.vLength += 1;
                }
            }
        }

        for(int i = 0; i < this.wLength; i++){
            for(int j = 0; j < this.CONSONANTS.length; j++){
                if(this.CONSONANTS[j].equals(this.word.toUpperCase().substring(i, i+1))){
                    this.cLength += 1;
                }
            }
        }

        for(int i = 0; i < this.wLength; i++){
            if(this.word.toUpperCase().substring(i, i+1).equals("A")){
                this.A += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("B")){
                this.B += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("C")){
                this.C += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("D")){
                this.D += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("E")){
                this.E += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("F")){
                this.F += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("G")){
                this.G += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("H")){
                this.H += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("I")){
                this.I += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("J")){
                this.J += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("K")){
                this.K += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("L")){
                this.L += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("M")){
                this.M += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("N")){
                this.N += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("O")){
                this.O += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("P")){
                this.P += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Q")){
                this.Q += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("R")){
                this.R += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("S")){
                this.S += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("T")){
                this.T += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("U")){
                this.U += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("V")){
                this.V += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("W")){
                this.W += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("X")){
                this.X += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Y")){
                this.Y += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Z")){
                this.Z += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("À")){
                this.À += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Á")){
                this.Á += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Â")){
                this.Â += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ã")){
                this.Ã += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("È")){
                this.È += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("É")){
                this.É += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ê")){
                this.Ê += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ì")){
                this.Ì += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Í")){
                this.Í += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Î")){
                this.Î += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ô")){
                this.Ô += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Õ")){
                this.Õ += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ó")){
                this.Ó += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ò")){
                this.Ò += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ú")){
                this.Ú += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Ù")){
                this.Ù += 1;
            }
            else if(this.word.toUpperCase().substring(i, i+1).equals("Û")){
                this.Û += 1;
            }
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getwLength() {
        return wLength;
    }

    public void setwLength(Integer wLength) {
        this.wLength = wLength;
    }

    public Integer getvLength() {
        return vLength;
    }

    public void setvLength(Integer vLength) {
        this.vLength = vLength;
    }

    public Integer getcLength() {
        return cLength;
    }

    public void setcLength(Integer cLength) {
        this.cLength = cLength;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    public Integer getC() {
        return C;
    }

    public void setC(Integer c) {
        C = c;
    }

    public Integer getD() {
        return D;
    }

    public void setD(Integer d) {
        D = d;
    }

    public Integer getE() {
        return E;
    }

    public void setE(Integer e) {
        E = e;
    }

    public Integer getF() {
        return F;
    }

    public void setF(Integer f) {
        F = f;
    }

    public Integer getG() {
        return G;
    }

    public void setG(Integer g) {
        G = g;
    }

    public Integer getH() {
        return H;
    }

    public void setH(Integer h) {
        H = h;
    }

    public Integer getI() {
        return I;
    }

    public void setI(Integer i) {
        I = i;
    }

    public Integer getJ() {
        return J;
    }

    public void setJ(Integer j) {
        J = j;
    }

    public Integer getK() {
        return K;
    }

    public void setK(Integer k) {
        K = k;
    }

    public Integer getL() {
        return L;
    }

    public void setL(Integer l) {
        L = l;
    }

    public Integer getM() {
        return M;
    }

    public void setM(Integer m) {
        M = m;
    }

    public Integer getN() {
        return N;
    }

    public void setN(Integer n) {
        N = n;
    }

    public Integer getO() {
        return O;
    }

    public void setO(Integer o) {
        O = o;
    }

    public Integer getP() {
        return P;
    }

    public void setP(Integer p) {
        P = p;
    }

    public Integer getQ() {
        return Q;
    }

    public void setQ(Integer q) {
        Q = q;
    }

    public Integer getR() {
        return R;
    }

    public void setR(Integer r) {
        R = r;
    }

    public Integer getS() {
        return S;
    }

    public void setS(Integer s) {
        S = s;
    }

    public Integer getT() {
        return T;
    }

    public void setT(Integer t) {
        T = t;
    }

    public Integer getU() {
        return U;
    }

    public void setU(Integer u) {
        U = u;
    }

    public Integer getV() {
        return V;
    }

    public void setV(Integer v) {
        V = v;
    }

    public Integer getW() {
        return W;
    }

    public void setW(Integer w) {
        W = w;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Integer getZ() {
        return Z;
    }

    public void setZ(Integer z) {
        Z = z;
    }

    public Integer getÀ() {
        return À;
    }

    public void setÀ(Integer à) {
        À = à;
    }

    public Integer getÁ() {
        return Á;
    }

    public void setÁ(Integer á) {
        Á = á;
    }

    public Integer getÂ() {
        return Â;
    }

    public void setÂ(Integer â) {
        Â = â;
    }

    public Integer getÃ() {
        return Ã;
    }

    public void setÃ(Integer ã) {
        Ã = ã;
    }

    public Integer getÈ() {
        return È;
    }

    public void setÈ(Integer è) {
        È = è;
    }

    public Integer getÉ() {
        return É;
    }

    public void setÉ(Integer é) {
        É = é;
    }

    public Integer getÊ() {
        return Ê;
    }

    public void setÊ(Integer ê) {
        Ê = ê;
    }

    public Integer getÍ() {
        return Í;
    }

    public void setÍ(Integer í) {
        Í = í;
    }

    public Integer getÌ() {
        return Ì;
    }

    public void setÌ(Integer ì) {
        Ì = ì;
    }

    public Integer getÎ() {
        return Î;
    }

    public void setÎ(Integer î) {
        Î = î;
    }

    public Integer getÔ() {
        return Ô;
    }

    public void setÔ(Integer ô) {
        Ô = ô;
    }

    public Integer getÕ() {
        return Õ;
    }

    public void setÕ(Integer õ) {
        Õ = õ;
    }

    public Integer getÓ() {
        return Ó;
    }

    public void setÓ(Integer ó) {
        Ó = ó;
    }

    public Integer getÒ() {
        return Ò;
    }

    public void setÒ(Integer ò) {
        Ò = ò;
    }

    public Integer getÚ() {
        return Ú;
    }

    public void setÚ(Integer ú) {
        Ú = ú;
    }

    public Integer getÙ() {
        return Ù;
    }

    public void setÙ(Integer ù) {
        Ù = ù;
    }

    public Integer getÛ() {
        return Û;
    }

    public void setÛ(Integer û) {
        Û = û;
    }
}
