public class PlayerCharacter {

    static int posX = 0;
    static int posY = 0;

    public static int getX()
    {
        return posX;
    }

    public static int getY()
    {
        return posY;
    }

    public static int setX(int x)
    {
        posX = x;
        return posX;
    }

    public static int setY(int y)
    {
        posY = y;
        return posY;
    }

    public static void move(String keyboardLetter) {
        switch(keyboardLetter)
        {
            case("S"): // go up
                posY+=-1;
                break;
            case("A"): // go left
                posX+=-1;
                break;
            case("W"): // go down
                posY+=1;
                break;
            case("D"): //go right
                posX+=1;
                break;
            default:
                System.out.println("No valid movement");
                break;
        }
        return;
    }
}
