import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestGameBoard {
    @BeforeEach
    void initialize()
    {
        PlayerCharacter.posX = 0;
        PlayerCharacter.posY = 0;
    }

    @Test
    void expect0_whenCalledGetXAtBeginning()
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
    void expectX_whenCalledGetX()
    {
        // GIVEN
        // not needed;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        int expected = PlayerCharacter.posX;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectY_whenCalledGetY()
    {
        // GIVEN
        // not needed;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        int expected = PlayerCharacter.posY;;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectY3_whenCalledWithSAndY2()
    {
        // GIVEN
        String keyboardLetter = "S";
        PlayerCharacter.setY(2);
        // WHEN
        PlayerCharacter.move(keyboardLetter);
        // THEN
        int expected = 1;
        Assertions.assertEquals(expected, PlayerCharacter.posY);
    }

    @Test
    void expectDecrementY_whenCalledWithW()
    {
        // GIVEN
        String keyboardLetter = "S";
        int currentPosY = PlayerCharacter.posY;
        // WHEN
        PlayerCharacter.move(keyboardLetter);
        // THEN
        int expected = currentPosY - 1;
        Assertions.assertEquals(expected, PlayerCharacter.posY);
    }

    @Test
    void expectInccrementY_whenCalledWithS()
    {
        // GIVEN
        String keyboardLetter = "W";
        int currentPosY = PlayerCharacter.posY;
        // WHEN
        PlayerCharacter.move(keyboardLetter);
        // THEN
        int expected = currentPosY + 1;
        Assertions.assertEquals(expected, PlayerCharacter.posY);
    }

    @Test
    void expectDecrementX_whenCalledWithA()
    {
        // GIVEN
        String keyboardLetter = "A";
        int currentPosX = PlayerCharacter.posX;
        // WHEN
        PlayerCharacter.move(keyboardLetter);
        // THEN
        int expected = currentPosX - 1;
        Assertions.assertEquals(expected, PlayerCharacter.posX);
    }

    @Test
    void expectIncrementX_whenCalledWithD()
    {
        // GIVEN
        String keyboardLetter = "D";
        int currentPosX = PlayerCharacter.posX;
        // WHEN
        PlayerCharacter.move(keyboardLetter);
        // THEN
        int expected = currentPosX + 1;
        Assertions.assertEquals(expected, PlayerCharacter.posX);
    }

    @Test
    void expectX1Y1_whenCalledWithRRWA()
    {
        // GIVEN
        String[] myLetters = {"D", "D", "W", "A"};
        // WHEN
        for (String currLetter : myLetters)
        {
            PlayerCharacter.move(currLetter);
        }
        // THEN
        int expectedY = 1;
        int expectedX = 1;
        Assertions.assertEquals(expectedX, PlayerCharacter.posX);
        Assertions.assertEquals(expectedY, PlayerCharacter.posY);
    }
}
