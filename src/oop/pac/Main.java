package oop.pac;

// 다른 패키지에 존재하는 클래스의 객체를 생성할 때는 반드시 import 선언이 있어야 합니다.
import oop.pac.fruits.Banana;
import oop.pac.fruits.Melon;
import oop.pac.fruits.Apple;


public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Banana banana = new Banana();
        Melon melon = new Melon();

        // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 표시해 주어야 합니다.
        oop.pac.juice.Apple apple2 = new oop.pac.juice.Apple();

    }

}
