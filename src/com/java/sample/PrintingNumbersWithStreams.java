package com.java.sample;

import java.util.stream.IntStream;

public class PrintingNumbersWithStreams {
    public static void main(String[] args) {
        //1.
        System.out.println("Method 1");
        IntStream.range(1, 1000000).forEach(
                val -> System.out.print(val)
        );

        System.out.println("Method 2");
        //range excludes the
        IntStream.range(1, 1000000).forEach(System.out::print);

        System.out.println("Using rangeClosed");
        //rangeClosed includes the number
        IntStream.rangeClosed(1, 1000000).forEach(System.out::print);


    }
}
