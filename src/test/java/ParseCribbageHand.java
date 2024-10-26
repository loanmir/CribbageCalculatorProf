import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCribbageHand {

    @Test
    void withStarterCardFiveOfClubs(){
        CribbageHandParser cribbageHandParser = new CribbageHandParser();
        CribbageHand cribbageHand = cribbageHandParser.parse("5H5D5SJC5C");
        assertAll(
                () -> assertEquals('5', cribbageHand.starterCard().rank()),
                () -> assertEquals('C', cribbageHand.starterCard().suit())
        );


    }



}
