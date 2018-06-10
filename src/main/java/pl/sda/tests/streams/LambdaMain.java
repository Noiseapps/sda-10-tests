package pl.sda.tests.streams;


import java.util.ArrayList;
import java.util.List;

public class LambdaMain {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            ints.add(i);
        }

        ints.stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .sorted((o1, o2) -> o2 - o1)
                .map(value -> String.format("value is %d", value))
                .forEach(System.out::println);


//        ints.sort((o1, o2) -> o1 - o2);
//
//        calculateThings(new FunctionalInterface() {
//            @Override
//            public boolean test(int value) {
//                return value % 2 == 0;
//            }
//        });
//
//        calculateThings((value) -> value % 2 == 0);
    }


    public static void calculateThings(FunctionalInterface param) {
        System.out.println(param.test(10));
    }
}
