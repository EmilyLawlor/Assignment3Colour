package Colour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private Colour colour;

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
        assertThrows(IllegalArgumentException.class, () -> {
            colour = new Colour(10000, -24, 12345);
        });
    }


}