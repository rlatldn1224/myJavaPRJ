package kopo;

import java.util.LinkedList;
import java.util.List;

public class ListExam01 {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list.size());

        list.forEach( name -> System.out.println(name));

        list.stream().forEach(name -> System.out.println(name));

    }
}
