package oop.this_;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("플레이어1");
        System.out.println("p1이 띠는 주소값: " + p1);
//        System.out.println(p1.toString());

        System.out.println("=============================");

        Player p2 = new Player("플레이어2");
        System.out.println("p2가 띠는 주소값: " + p2);

    }

}
