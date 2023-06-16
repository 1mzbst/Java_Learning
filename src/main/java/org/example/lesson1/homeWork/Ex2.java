package org.example.lesson1.homeWork;
public class Ex2 {
    public static void main(String[] args){
      String s = "   the sky is blue";
      System.out.println(s);
      String sTrim = s.trim();
      System.out.println(sTrim);
      String [] sArr = sTrim.split(" ");
      for (String word: sArr)
      System.out.println(word);
      for (int i = sArr.length - 1; i >= 0; i--){
          System.out.println(sArr[i]);
      }
    }
}
