package org.hbrs.se1.ws22.uebung2;

public class ConcreteMember implements Member{

    private static int counter = 0;
    private int id = 0;

    public ConcreteMember(){
        id = counter++;
    }

    @Override
    public Integer getID() {
        return id;
    }

    public String toString(){
        return "Member (ID = " + id + ")";
    }
}
