import java.util.Random;

public class Dice {
    int me = 1;

    void roll() {
        Random rand = new Random();
        me = rand.nextInt(6) + 1;
    }
}
