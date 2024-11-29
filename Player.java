public class Player {
    String name;
    int point;

    Player(String n) {
        name = n;
    }

    void turn(Dice d) {
        d.roll();
        point = d.me;
    }
}
