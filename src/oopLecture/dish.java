package oopLecture;

public class dish {
// Static is used as tools
    public float costInCents;
    public String nameOfDish;
    public boolean wouldReccomend;

    public void printSummary(){
        System.out.printf(" Costs in cents: %.0f %n Name: %s %n Reccomended: %s %n",costInCents,nameOfDish,wouldReccomend);
    }



}
