public class Dice {
    int me = 1;

    void roll() {
        me = (int)(Math.random() * 6) + 1;
    }
}
