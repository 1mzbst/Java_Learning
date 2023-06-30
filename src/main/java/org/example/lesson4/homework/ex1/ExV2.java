package org.example.lesson4.homework.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ExV2 {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }

            public static List<Integer> reverseList(List<Integer> list)
        {
            List<Integer> reverse = new ArrayList<>(list.size());

            ListIterator<Integer> itr = list.listIterator(list.size());
            while (itr.hasPrevious()) {
                reverse.add(itr.previous());
            }

            return reverse;
        }


}
