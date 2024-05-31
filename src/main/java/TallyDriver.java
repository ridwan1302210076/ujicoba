import main.java.Tally;

public class TallyDriver {

    public static void main(String[] args) {
        
        Tally tally = new Tally();
        
        System.out.println("Tally: " + tally.getTally());
        
        tally.add();
        
        System.out.println("Tally: " + tally.getTally());
        
        tally.subtract();
        
        System.out.println("Tally: " + tally.getTally());
    }
}
