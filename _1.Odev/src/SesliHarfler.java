import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SesliHarfler {
    public static void main(String[] args) {

        Character character = 'A';
        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli");
                break;
            default:
                System.out.println("Ince sesli");
                break;
        }

    }
}
