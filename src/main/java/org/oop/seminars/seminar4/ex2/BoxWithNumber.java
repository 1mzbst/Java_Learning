package org.oop.seminars.seminar4.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data


public class BoxWithNumber<E extends Number> {
//    public E compareAvarge;
    private E[] num;

    public BoxWithNumber(E... num) {
        this.num = num;
    }

    public double avarge(){
        double result  = 0;
        for(int i = 0; i<num.length; i++){
            result += num[i].doubleValue();
        }
        return result;
    }

    public boolean compareAvarge(BoxWithNumber<E> boxWithNumber2) {
        return (this.avarge() == boxWithNumber2.avarge());
    }
}
