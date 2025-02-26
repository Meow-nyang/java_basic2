package basic.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chicken", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // foods 배열에서 특정 데이터의 인덱스를 반환
    // 메서드 이름: indexOf, 매개변수: 음식이름(String)
    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // 특정 요소가 배열에 포함되어 있는지의 여부를 확인하는 메서드를 작성하세요.
    // static boolean isInclude(String searchTarget)



    // foods 배열에 데이터를 끝에 추가하는 메서드를 작성하세요.
    // static void push(String newFood)


    // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
    // static boolean isOutOfBounds(int targetIndex)
    // 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.


    // 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
    // static void insert(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.


    // 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
    // void modify(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.


    // 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
    // void remove(String deleteTarget)


    // 배열 내부를 깔끔하게 비워버리는 메서드를 작성하세요. (삭제 반복 x)
    // void clear()




    public static void main(String[] args) {

        printFoods();
        int idx = indexOf("apple");
        System.out.println("idx = " + idx);

    }

}
