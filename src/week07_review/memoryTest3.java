package week07_review;

public class memoryTest3 {

    public static void memoryStats() {
        int mb = 1024 * 1024;
        // get Runtime instance
        Runtime instance = Runtime.getRuntime();
        System.out.println("***** Heap utilization statistics [MB] *****\n");
        // available memory
        System.out.println("Total Memory: " + instance.totalMemory() / mb);
        // free memory
        System.out.println("Free Memory: " + instance.freeMemory() / mb);
        // used memory
        System.out.println("Used Memory: " + (instance.totalMemory() - instance.freeMemory()) / mb);
        // Maximum available memory
        System.out.println("Max Memory: " + instance.maxMemory() / mb);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        memoryStats();


        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        memoryStats();

        int[] arr2 = new int[1000000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }

        memoryStats();

        int[] arr3 = new int[1000000];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }

        memoryStats();

        int[] arr4 = new int[1000000];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i;
        }

        memoryStats();

        int[] arr5 = new int[1000000];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
        }

        memoryStats();

        int[] arr6 = new int[1000000];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = i;
        }

        memoryStats();

        int[] arr7 = new int[1000000];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = i;
        }
    }
}