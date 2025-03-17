package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        // 메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegeterian());

        System.out.println("flag1 = " + flag1);

        //  메뉴 목록 중 칼로리가 100 이하인 요리가 하나라도 존재하는가?
        boolean flag2 = menuList.stream()
                .anyMatch(d -> d.getCalories() <= 100);

        System.out.println("flag2 = " + flag2);

        // 음식 메누 중에 모든 요리가 1000칼로리 미만인가요?

        boolean flag3 = menuList.stream()
                .allMatch(d -> d.getCalories() < 1000);

        System.out.println("flag3 = " + flag3);

        // 음식 메뉴 중 모든 요리가 1000칼로리 미만이 아닙니까?
        boolean flag4 = menuList.stream()
                .noneMatch(d -> d.getCalories() > 1000); // 전부 불일치 하는가?
//                .allMatch(d -> d.getCalories() > 1000); // 전부 일치 하는가?

        System.out.println("flag4 = " + flag4);

        // 음식 중에 칼로리가 제일 낮은 음식이 누구에요?
        Dish dish = menuList.stream()
                .min(Comparator.comparing(Dish::getCalories))
                .get();

        System.out.println("dish = " + dish);



    }
}
