public class Player {
    String name;

    Player(String n) {
        name = n;
    }

    void turn(Dice d) {
        d.roll();
    }
}
