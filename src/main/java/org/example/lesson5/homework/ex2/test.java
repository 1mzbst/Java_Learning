package org.example.lesson5.homework.ex2;

import java.util.ArrayList;
import java.util.Collections;

public class test {
        public static void main(String [] args)
        {

            // Get the ArrayList
            ArrayList<String>
                    list = new ArrayList<String>();

            // Populate the ArrayList
            list.add("Geeks");
            list.add("For");
            list.add("ForGeeks");
            list.add("GeeksForGeeks");
            list.add("A computer portal");

            // Print the unsorted ArrayList


            // Sorting ArrayList in descending Order
            // using Collection.sort() method
            // by passing Collections.reverseOrder() as comparator
            Collections.sort(list, Collections.reverseOrder());

            // Print the sorted ArrayList
            System.out.println(list);
        }
    }
