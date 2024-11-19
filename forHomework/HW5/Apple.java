package forHomework.HW5;

class Apple extends Fruit{
    private String variety;
    private String texture;

    public Apple(){
        super();
        variety = "a";
        texture = "b";
    }

    public Apple(String variety, String texture, Color color,int calories, double pricePerPound){
        super(color,calories,pricePerPound);
        this.texture = texture;
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "variety='" + variety + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}
