package main.java;

public class Tally {

    private int tally;

    public Tally() {
        this.initialize();
    }

    public final void initialize() {
        tally = 0;
    }

    public void add() {
        tally++;
    }

    public void subtract() {
        tally--;
    }

    public int getTally() {
        return tally;
    }
}
