package Colour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private Colour colour;

    @Test
    public void acceptThreeComponentsOnly(){
        final int[] components = {1,2,3};
        colour = new Colour(components);
        assertTrue(colour.testNumComponents());
    }

}