package oop.final_.method;

public class Child extends Parent {

    int n1;

    @Override
    void method1() {
        super.method1();
    }

    @Override
    void method2() {
        super.method2();
        super.method3();
    }

//    @Override
//    void method3() {
//        final 메서드는 override를 막습니다. (물려주는 대로 써라~)
//    }

}
