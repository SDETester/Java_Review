package week07_review;

import java.util.Scanner;

public class memoryTest2 {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long prevTotal = 0;
        long prevFree = rt.freeMemory();

        for (int i = 0; i < 2_000_000; i++) {
            long total = rt.totalMemory();
            long free = rt.freeMemory();
            if (total != prevTotal || free != prevFree) {
                System.out.println(
                        String.format("#%s, Total: %s, Free: %s, Diff: %s",
                                i,
                                total,
                                free,
                                prevFree - free));
                prevTotal = total;
                prevFree = free;
            }
            // map.put(i, new memoryTest.NewObject());
        }}}