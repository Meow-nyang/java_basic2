package etc.api.lang.wrapper;

public class WrapperExample {

    public static void main(String[] args) {

        int a = 100;
        boolean b = false;
        char c = 'A';
        double d = 3.14;

        // boxing: 기본 데이터 타입을 객체 타입으로 변환
//        Integer v1 = new Integer(a); (x) -> deprecated
//        Boolean b1 = new Boolean(b); (x)

        // autoboxing: 기본 타입을 자동으로 객체형으로 변환
        Integer v1 = a;
        Boolean v2 = b;
        Character v3 = c;
        Double v4 = d;

        // unboxing: 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정.
//        int i = v1.intValue(); -> deprecated
        int i = v1;
        double d2 = v4;

    }

}
