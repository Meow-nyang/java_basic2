package etc.lambda;

import java.util.List;

// static 필드나 메서드를 클래스 이름 없이 호출하기 위한 import
import static etc.lambda.Color.*;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        // List.of -> 고정형 리스트 생성 (Arrays.asList와 유사)
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========== 녹색 사과만 필터링 ==========");
        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("========== 원하는 조건의 사과 필터링 ==========");
        List<Apple> lightApples
                = FilterApple.filterApple(appleBasket, new LightApplePredicate());
        for (Apple apple : lightApples) {
            System.out.println(apple);
        }

        System.out.println("==============================================");
        // 빨강 또는 노랑 사과만 필터링
        // 그럼 클래스 또 만들겨? Light Apple Predicate 처럼? 귀찮다...
        // 메서드 선언할 때 이름 없는 클래스 즉석에서 선언해서 보내주면 안되나? -> 익명 클래스!!!!
        List<Apple> apples
                = FilterApple.filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        System.out.println("==============================================");

        // 녹색이면서 100g 이하인 사과만 필터링
        // 우리는 이제 익명클래스를 통해, 새 클래스파일 생성 없이 즉석에서 보낼 수 있음!
        // 근데... 생각해보니, 어짜피 인터페이스에 추상메서드 하나 아니냐?
        // 그럼 이름을 굳이 언급할 필요가 있나? -> 람다식으로 작성하면 어떨까?
        List<Apple> apples2 = FilterApple.filterApple(
                appleBasket,
                (apple -> apple.getColor() == GREEN && apple.getWeight() <= 100)
        );
        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        System.out.println("==============================================");

        // 색깔이 빨강 혹은 초록이면서, 무게는 150g 미만이어야 한다.
        List<Apple> apples3 = FilterApple.filterApple(
                appleBasket,
                apple -> (apple.getColor() == RED || apple.getColor() == GREEN)
                        && apple.getWeight() < 150
        );
        for (Apple apple : apples3) {
            System.out.println(apple);
        }

        System.out.println("========== 여러가지 타입의 객체를 필터링 ==========");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filter1 = FilterApple.filter(numbers, n -> n % 2 == 0);
        System.out.println(filter1);

        List<String> foods =
                List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살", "파스타");

        List<String> filter2 = FilterApple.filter(foods, f -> f.length() == 3);
        System.out.println(filter2);

        System.out.println("=================== 맵핑 =====================");
        // 이번에는 사과의 색상만 싹 뽑아서 리스트로 받고 싶어요.
        List<Color> colorList = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("=============== 사과의 무게만 뽑아봐 ================");
        List<Integer> map1 = MappingApple.map(appleBasket, new GenericFunction<Apple, Integer>() {
            @Override
            public Integer apply(Apple apple) {
                return apple.getWeight();
            }
        });
        System.out.println("map1 = " + map1);

        System.out.println("============ 숫자를 주면 제곱된 수를 가져와 =============");
        List<Integer> map2 = MappingApple.map(numbers, n -> n * n);
        System.out.println("map2 = " + map2);

        System.out.println("============= 음식을 주면 첫글자만 뽑아와 ==============");
        List<Character> map3 = MappingApple.map(foods, f -> f.charAt(0));
        System.out.println("map3 = " + map3);

    }

}