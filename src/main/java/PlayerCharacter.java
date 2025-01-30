public class PlayerCharacter {

    public static int getX()
    {
        return 0;
    }

    public static int getY()
    {
        return 0;
    }

    public static int move(String keyboardLetter) {
        if(keyboardLetter.equals("W")){
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
