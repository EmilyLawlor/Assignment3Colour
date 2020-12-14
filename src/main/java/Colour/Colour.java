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
}
