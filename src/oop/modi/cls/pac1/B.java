package oop.modi.cls.pac1;

// public 제한자는 접근 제한이 없는 형태 (어디에서나 접근이 가능)
public class B {

    // 클래스 A의 접근제한자는 default.
    // 동일 패키지 내부의 클래스는 접근을 허용.
    A a = new A();

}
