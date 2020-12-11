package Colour;

public class Colour {
    private int[] components;

    public Colour(int[] components){
        this.components = components;
    }

    public boolean testNumComponents(){
        return this.components.length == 3;
    }

}
