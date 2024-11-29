public class Game {
    Player p1;
    Player p2;
    Dice d;

    Game() {
        p1 = new Player("プレーヤー１");
        p2 = new Player("プレーヤー２");
        d = new Dice();
    }

    void start() {
        p1.turn(d);
        int d1 = d.me;
        System.out.println(p1.name + "の目 " + d1);
        p2.turn(d);
        int d2 = d.me;
        System.out.println(p2.name + "の目 " + d2);

        System.out.println("----------------");
        if (d1 < d2) {
            System.out.println(p2.name + "の勝ち");
        } else if (d1 > d2) {
            System.out.println(p1.name + "の勝ち");
        } else {
            System.out.println("あいこ");
        }
    }
}
