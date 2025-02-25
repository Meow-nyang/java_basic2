package basic.array;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        // [10 50 66 90 100 150]
        int[] arr = {10, 50, 90, 100, 150};
        int newNumber = 66;
        int targetIndex = 3;

        // 50과 90 사이에 66을 삽입하고 싶다!

        // 1. 사이즈가 1개 큰 새로운 배열을 생성
        int[] temp = new int[arr.length + 1];

        // 2. 기존 데이터를 새 배열에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 삽입 위치에서 데이터를 뒤로 한 칸씩 이동시키자.
        // 이동 순서는 끝에서부터 시작해야 한다.
        for (int i = arr.length; i > targetIndex ; i--) {
            temp[i] = temp[i-1];
        }

        // 4. 새로운 데이터를 타겟 인덱스에 할당
        temp[targetIndex] = newNumber;

        // 5. 주소값 이전
        arr = temp; temp = null;

        System.out.println(Arrays.toString(arr));


    }

}
