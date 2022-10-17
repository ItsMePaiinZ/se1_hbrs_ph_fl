package uebungen.uebung2;

public class ContainerException extends Exception {
    public ContainerException(int ID){
        super("Das Member-Objekt mit der ID " + ID + " ist bereits vorhanden!");
    }
}
