import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCard {
    private final CardParser cardParser = new CardParser();

    @Test
    void withSuitSpades(){

        Card card = cardParser.parse("5S");
        assertEquals('S', card.suit());
    }

    @Test
    void withSuitHearts(){

        Card card = cardParser.parse("5H");
        assertEquals('H', card.suit());
    }

    @Test
    void withSuitClubs(){

        Card card = cardParser.parse("5C");
        assertEquals('C', card.suit());
    }

    @Test
    void withSuitDiamonds(){

        Card card = cardParser.parse("5D");
        assertEquals('D', card.suit());
    }

}
