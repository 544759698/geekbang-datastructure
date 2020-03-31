package com.yang.algorithm.day24;

/**
 * Created by yangguojun01 on 2020/3/31.
 */
public class AndOp {

    public static void main(String[] args) {
        int i0 = 0;
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        System.out.println(i0 | i1);
        System.out.println(i1 | i0);
        System.out.println(i1 | i2);
        System.out.println(i2 | i0);
        System.out.println(i2 | i3);
        System.out.println(i1 | i3);
        System.out.println(i2 | i1);
        System.out.println(i3 | i1);
        System.out.println(i3 | i2);

    }

}
