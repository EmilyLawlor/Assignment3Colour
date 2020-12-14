package Colour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private Colour colour;
    private Colour anotherColour;

    @Test
    public void acceptThreeComponentsOnly(){
        colour = new Colour(10, 20, 30);
        assertNotNull(colour);
    }

    @Test
    public void acceptValidComponentValues() {
        colour = new Colour(10, 20, 30);
        assertNotNull(colour);
    }

    @Test
    public void rejectInvalidComponentValues() {
        assertThrows(IllegalArgumentException.class, () -> colour = new Colour(10000, -24, 12345));
    }

    @Test
    public void defaultMethodMustBeRBG(){
        colour = new Colour(10, 20, 30);
        assertEquals("RGB", colour.getModel());
    }

    @Test
    public void twoColoursEqualIfTheyHaveTheSameComponentsAndModel(){
        colour = new Colour(10,20,30);
        anotherColour = new Colour(10,20,30);
        assertEquals(anotherColour, colour);
    }
}