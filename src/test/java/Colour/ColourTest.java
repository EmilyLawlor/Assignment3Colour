package Colour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private Colour colour;
    private Colour anotherColour;
    private Colour result;

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

    @Test
    public void coloursWithDifferentCompoenentsNotEqual(){
        colour = new Colour(10,20,30);
        anotherColour = new Colour(30,210,0);
        assertNotEquals(anotherColour, colour);
    }

    @Test
    public void coloursWithDifferentModelsNotEqual(){
        colour = new Colour(10,20,30);
        anotherColour = new Colour(10,20,30, "CMYK");
        assertNotEquals(anotherColour, colour);
    }

    @Test
    public void coloursCanBeAddedIfTheSameModel(){
        colour = new Colour(10,20,30);
        anotherColour = new Colour(30,210,0);
        result = colour.plus(anotherColour);
        assertEquals(result, new Colour(40, 230, 30));
    }

    @Test
    public void coloursOfDifferentModelsCanNotBeAdded(){
        colour = new Colour(10,20,30);
        anotherColour = new Colour(10,20,30, "CMYK");
        assertThrows(IllegalArgumentException.class, () -> colour.plus(anotherColour));
    }

    @Test
    public void addedComponentsMustBeLessThan255(){
        colour = new Colour(200,20,200);
        anotherColour = new Colour(100,100,100);
        result = colour.plus(anotherColour);
        assertEquals(result, new Colour(255, 120, 255));
    }
}