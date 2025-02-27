package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

    void test() {
        A a1 = new A(50);
//        A a2 = new A(5.55); default
//        A a3 = new A(true); private

        a1.f1 = 20;
//        a1.f2 = 30; default
//        a1.f3 = 40; private

        a1.m1();
//        a1.m2(); default
//        a1.m3(); private

    }

}
