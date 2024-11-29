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
        System.out.println(p1.name + "の目 " + p1.point);
        p2.turn(d);
        System.out.println(p2.name + "の目 " + p2.point);

        judge();
    }

    void judge() {
        System.out.println("-------------------");
        if (p1.point < p2.point) {
            System.out.println(p2.name + "の勝ち");
        } else if (p1.point > p2.point) {
            System.out.println(p1.name + "の勝ち");
        } else {
            System.out.println("あいこ");
        }
        System.out.println("-------------------");
    }
}
