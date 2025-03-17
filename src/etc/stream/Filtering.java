package etc.stream;

import java.util.List;

import static etc.stream.Menu.*;

public class Filtering {

    public static void main(String[] args) {

        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = menuList.stream()
                            .filter(d -> d.isVegeterian())
                            .toList();

        dishList.forEach(d -> System.out.println(d));

//        for (Dish dish : dishList) {
//            System.out.println("dish = " + dish);
//        }


        System.out.println("======================================");

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링 해서 출력
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT
                        && dish.getCalories() < 600)
                .toList()
                .forEach(dish -> System.out.println(dish));


        System.out.println("======================================");

        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .toList()
                .forEach(System.out::println);

        System.out.println("======================================");

        // 칼로리가 300칼로리보다 큰 요리중에 앞에 3개만 가져와
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) // 앞에서부터 3개만 추출
                .toList()
                .forEach(d -> System.out.println(d));

        System.out.println("======================================");

        // 300칼로리보다 높은 요리 중 처음 2개 제끼고 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외
                .toList()
                .forEach(d -> System.out.println(d));

        System.out.println("======================================");

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 4, 5, 6);


        // 리스트에서 짝수만 필터링 (중복은 제거해서)
        numbers.stream()
                .filter(n -> n% 2 == 0)
                .distinct() // 중복 제거
                .toList()
                .forEach(n -> System.out.println(n));


    }

}
