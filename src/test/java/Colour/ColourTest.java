package Colour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private Colour colour;

    @Test
    public void acceptThreeComponentsOnly(){
        colour = new Colour(10, 20, 30);
    }

    @Test
    public void acceptValidComponentValues(){
        colour = new Colour(10,20, 30);
        assertNotNull(colour);
    }

    @Test
    public void rejectInvalidComponentValues(){
        colour = new Colour(100000, -10, 3);
        assertNull(colour);
    }

}