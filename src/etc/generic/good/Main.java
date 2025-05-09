package etc.generic.good;

import etc.generic.bad.Person;

public class Main {

    public static void main(String[] args) {

         /*
         # 제네릭

         - 클래스 내부에서 타입을 지정하는 것이 아니라
          외부에서 객체를 생성할 때 타입이 지정될 수 있게 하는 문법.
          제네릭을 사용하면 객체로 생성할 때 사용할 타입을 지정할 수 있고
          따로 타입을 체크하고 변환해줄 필요가 없습니다.
          관리가 용이하고 잘못된 타입이 들어올 수 있는 것을 방지하기 때문에
          유지보수성, 코드의 재사용성이 높아집니다.
         */

        Box<String> box = new Box<>();
        box.setObj("김춘식");
        int length = box.getObj().length();

        Box<Person> pBox = new Box<>();
        pBox.setObj(new Person());
        String name = pBox.getObj().getName();

        MultiBox<String, Integer> multi = new MultiBox<>();
        multi.put("메롱이", 10);
        int i = multi.get();


    }

}
