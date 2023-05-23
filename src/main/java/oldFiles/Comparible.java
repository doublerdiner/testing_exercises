package oldFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparible implements Comparable<Comparible>{

    public int number;
    public int age;


    public static void main(String[] args) {
        Comparible number1 = new Comparible();
        number1.age = 30;
        number1.number = 5;
        Comparible number2 = new Comparible();
        number2.age = 22;
        number2.number = 2;
        List<Comparible> arr = new ArrayList<>();
        arr.add(number1);
        arr.add(number2);

        System.out.println(number1.compareTo(number2));
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

    }
    @Override
    public int compareTo(Comparible o) {
        if(age == o.age){return 0;}
        else if(age > o.age){return 1;}
        else{return -1;}


    }
}
