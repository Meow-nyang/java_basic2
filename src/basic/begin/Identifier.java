package basic.begin;

import java.util.Scanner;

public class Identifier {

    public static void main(String[] args) {

        // 1. 식별자는 대/소문자를 철저하게 구분함!
        int age = 35;
//        int age = 40; (x)
        int Age = 40;

        // 2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 안됨!
//        int 700 = 365; (x)
//        int 7number = 7; (x)
        int number7 = 7;
        int num7ber = 7;

        // 3. 식별자에 공백 못들어가요!
//        int my birth day = 19921013;
        int myBirthDay = 19921013; // camel case

        // 4. 식별자에 특수기호는 밑줄(_), 달러기호($) 뿐입니다.
        // 사용을 권장하지는 않습니다. 이미 사용하기로 약속한 곳이 있어요.
        String $hello_ = "안녕";

        // 5. 키워드 (예약어)는 식별자로 사용할 수 없음!
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.
//        String class = "8반"; (x)
        String Class = "8반"; // 권장하지 않습니다.
        String classNumber = "8반";

        // 6. 한글이나 한자 같은 식별자도 문법적으로 허용하기는 합니다만...
        // 권장하지는 않습니다.
        int 숫자 = 10;
        int sagwa = 20;

    }

}













