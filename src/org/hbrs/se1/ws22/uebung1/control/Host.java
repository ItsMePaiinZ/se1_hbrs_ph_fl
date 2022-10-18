package org.hbrs.se1.ws22.uebung1.control;

public class Host {

    public static Translator translator() {
        Translator trans = new GermanTranslator();
        return trans;
    }

}
