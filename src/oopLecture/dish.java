package oopLecture;

public class dish {
// Static is used as tools
    private float costInCents;
    private String nameOfDish;
    private boolean wouldReccomend;

    //Getters
    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public float getCostInCents(){
        return this.costInCents;
    }

    public boolean getwouldReccomend(){
        return this.wouldReccomend;
    }

    //Setters
    public void setCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    public boolean setWouldReccomend(boolean wouldReccomend){
        this.wouldReccomend = wouldReccomend;
        return wouldReccomend;
    }



    public void printSummary(){
        System.out.printf(" Costs in cents: %.0f %n Name: %s %n Reccomended: %s %n",costInCents,nameOfDish,wouldReccomend);
    }

    public dish(int cents, String dishName, boolean recommend) {
        this.costInCents = cents;
        this.nameOfDish = dishName;
        this.wouldReccomend = recommend;
    }

    public dish(int cents, boolean recommend) {
        this.costInCents = cents;
        this.nameOfDish = "None";
        this.wouldReccomend = recommend;
    }

    public dish( String dishName, boolean recommend) {
        this.nameOfDish = dishName;
        this.wouldReccomend = recommend;
    }



    @Override
    public String toString() {
        return "dish{" +
                "costInCents=" + costInCents +
                ", nameOfDish='" + nameOfDish + '\'' +
                ", wouldReccomend=" + wouldReccomend +
                '}';
    }
}
