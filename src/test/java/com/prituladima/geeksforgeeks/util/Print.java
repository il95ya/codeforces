package com.prituladima.geeksforgeeks.util;

import java.util.Arrays;

/**
 * Created by prituladima on 6/13/18.
 */
public class Print {

    public static void printMatrix(int[][] mtx) {
        for (int i = 0; i < mtx.length; i++) {
            sout(Arrays.toString(mtx[i]));
        }
    }

    public static void sout(Object o){
        System.out.println(o);
    }

}
