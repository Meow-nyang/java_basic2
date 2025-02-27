package oop.this_;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("플레이어1");
        System.out.println(p1.toString());

        System.out.println("=============================");

        Player p2 = new Player("플레이어2");

        p1.attack(p1);

        System.out.println("=============================");

        Player p3 = new Player("플레이어3", 200);
        System.out.println(p3.toString());

    }

}
