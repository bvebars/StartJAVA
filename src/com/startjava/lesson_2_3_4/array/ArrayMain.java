package com.startjava.lesson_2_3_4.array;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String []args){
        String[] array = {"4","2"};



        array = putNumberInSeries(array);

//        System.out.println(Arrays.toString(array));//return false. you won't get the same int[] object. But functionality achieved.


        String j = StringUtils.join(Arrays.asList(array), ", ");

        System.out.println(j);
    }
    private static String[] putNumberInSeries(String[] series) {
        String[] localSeries = Arrays.copyOf(series, series.length+1);
        localSeries[series.length] = "1";
        System.out.println(Arrays.toString(localSeries));
        return localSeries;
    }
}
