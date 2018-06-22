import java.util.Random;
public class Roll {

    public static String numberOfFaces(final int faces)
    {
        if(faces%2==1)
            return "Invalid";
        else if(faces == 2)
            return rand.nextInt(2)+1 == 1?"HEAD":"Tail";
        else
            return faces==4?"4":"6";
    }
    public static Random rand = new Random();
    public static void main(String[] args) {
        int randomNumber = rand.nextInt(6) + 1;
        System.out.println(numberOfFaces(randomNumber));
    }
}
