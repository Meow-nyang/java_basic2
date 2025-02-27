package oop.encap.good;

public class Main {

    public static void main(String[] args) {
        MyBirth my = new MyBirth();
//        my.day = 13; (x) private
        my.setYear(1992);
        my.setMonth(6);
        my.setDay(31);
        my.birthInfo();



    }

}
