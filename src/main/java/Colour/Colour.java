package Colour;

public class Colour {
    private float r;
    private float g;
    private float b;
    private String model;

    public Colour(float r, float g, float b) {
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255){
            this.r = r;
            this.g = g;
            this.b = b;
        } else {
           throw new IllegalArgumentException("Values must be between 0 and 255");
        }
        this.model = "RGB";
    }

    public Colour(float r, float g, float b, String model) {
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255){
            this.r = r;
            this.g = g;
            this.b = b;
        } else {
            throw new IllegalArgumentException("Values must be between 0 and 255");
        }
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override public boolean equals(Object o){
        if (!(o instanceof Colour)){
            return false;
        }
        Colour otherColour = (Colour) o;
        return this.sameModel(otherColour) && this.r == otherColour.getR() &&
                this.g == otherColour.getG() && this.b == otherColour.getB();
    }

    public float getR() {
        return r;
    }

    public float getG() {
        return g;
    }

    public float getB() {
        return b;
    }

    public boolean sameModel(Colour otherColour){
        return this.getModel().equals(otherColour.getModel());
    }

    public Colour plus(Colour otherColour){
        if (!(this.sameModel(otherColour))){
            throw new IllegalArgumentException("Colours must have the same model");
        }
        float newR = this.r + otherColour.getR();
        float newG = this.g + otherColour.getG();
        float newB = this.b + otherColour.getB();
        return new Colour(newR, newG, newB, this.getModel());
    }

}
