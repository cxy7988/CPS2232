package forHomework.HW5;

public class Grapes extends Fruit{
    private String taste;
    private boolean hasSeed;

    public Grapes(){
        super();
        this.taste = "a";
        this.hasSeed = false;
    }

    public Grapes(String taste,boolean hasSeed,Color color,int calories,double pricePerPound){
        super(color,calories,pricePerPound);
        this.taste = taste;
        this.hasSeed = hasSeed;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public boolean isHasSeed() {
        return hasSeed;
    }

    public void setHasSeed(boolean hasSeed) {
        this.hasSeed = hasSeed;
    }

    @Override
    public String toString() {
        return "Grapes{" +
                "taste='" + taste + '\'' +
                ", hasSeed=" + hasSeed +
                '}';
    }
}
