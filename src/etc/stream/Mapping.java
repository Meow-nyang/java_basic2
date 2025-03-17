package etc.stream;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 출력
        // toList(): 자바 16부터 쓸 수 있음. 불변 리스트 -> 수정 안됨!
        // collect(Collectors.toList()): 자바 8부터 존재하던 방식 -> 수정 자유로윰.
        menuList.stream()
                .map(Dish::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("==========================================");

        List<String> words
                = List.of("safari", "chrome", "ms edge", "opera", "firefox");

        // 문자들의 길이만 추출
        List<Integer> list = words.stream()
                .map(String::length) // String 클래스의 length를 일괄 적용
                .toList();
//        list.add(50); -> toList로 받아온 리스트는 불변!!!!
        System.out.println(list);

        List<Character> list2 = words.stream()
                .map(w -> w.charAt(0))
                .collect(Collectors.toList());
        list2.add('x');
        System.out.println(list2);

        System.out.println("==========================================");

        // 메뉴 목록에서 메뉴 이름과 칼로리만 추출해서
        // 새로운 객체로 포장해서 받고 싶음.
        List<SimpleDish> simpleDishes
                = menuList.stream()
                .map(SimpleDish::new)
                .toList();

        simpleDishes.forEach(System.out::println);

        System.out.println("==========================================");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new DishDetail(dish))
                .toList()
                .forEach(d -> System.out.println(d));

        System.out.println("==================================================");

        // 메뉴 목록에 있는 요리들의 총 칼로리 구하기
        int sum = menuList.stream()
                .mapToInt(dish -> dish.getCalories())
                .sum();

        System.out.println("sum = " + sum);

        // 육류 메뉴의 평균 칼로리 구하기

        double averageCalories = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();

        System.out.println("averageCalories = " + averageCalories);


    }

}
