package com.company;

public class Main {
    public static void main(String [] args){
        final int ab = 23;
        System.out.println(ab);
        int x = Math.summ(23, 43);
        System.out.println(x);

        Math a = new Math();
        System.out.println(a.x);
        a.x = 34;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);

//        int y = Math.mult(23, 43);
//        System.out.println(y);
    }
}

//public final class Main {
//    public final static void main(String [] args){
//        final int ab = 23;
//        System.out.println(ab);
//        int x = Math.summ(23, 43);
//        System.out.println(x);
//
//        Math a = new Math();
//        System.out.println(a.x);
//        a.x = 34;
//        System.out.println(a.x);
//        Math b = new Math();
//        System.out.println(b.x);
//
////        int y = Math.mult(23, 43);
////        System.out.println(y);
//    }
//}

