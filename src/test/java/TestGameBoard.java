import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestGameBoard {

    @Test
    void expect0_whenCalledGetX()
    {
        // GIVEN
        // not needed;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect0_whenCalledGetY()
    {
        // GIVEN
        // not needed;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectIncrementY_whenCalledWithW()
    {
        // GIVEN
        String keyboardLetter = "W";

        // WHEN
        int actual = PlayerCharacter.move(keyboardLetter);
        // THEN
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
