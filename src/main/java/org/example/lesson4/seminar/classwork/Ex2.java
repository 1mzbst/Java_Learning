//package org.example.lesson4.seminar.classwork;
//
//public class Ex2 {
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//            ListNode pred = null;
//            ListNode current = head;
//            while(current!= null){
//                ListNode nextElem = current.next;
//                current.next=pred;
//                pred=current;
//                current = nextElem;
//            }
//            return pred;
//        }
//    }
//}
