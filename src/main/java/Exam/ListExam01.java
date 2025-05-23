package Exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam01 {

        public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            a.add(i);
        }

        System.out.println("2세대 for문 출력: ");
        for (int num : a){
            System.out.println(num);
        }

        System.out.println("3세대 for문 출력 : ");
        a.forEach(num -> System.out.println(num));
    }
}


