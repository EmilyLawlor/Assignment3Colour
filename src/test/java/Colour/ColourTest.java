package Colour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    private Colour colour;

    @Test
    public void acceptThreeComponentsOnly(){
        colour = new Colour(10, 20, 30);
    }

}