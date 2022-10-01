package uebungen.uebung1.control;

public class Server {

    public static String translator(int aNumber) {
        Translator trans = new GermanTranslator();
        return trans.translateNumber(aNumber);
    }

}
