package arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[10];

        // System.out.println(arr1.length);

        Integer[] arr2 = new Integer[] {Integer.valueOf(36), -12, 13};
        display1DArray(arr2);

        // System.out.println(arr2.length);

        Integer[][] arr3 = new Integer[10][20];
        // System.out.println(arr3.length);
        // System.out.println(arr3[0].length);

        Integer[][] arr4= new Integer[][]  {
                {21, 42},
                {73, 43},
                {51, 65}
        };
        arr4[1][1] = 7;
        display2DArray(arr4);

        // System.out.println(arr4.length);
        // System.out.println(arr4[0].length);

        int[] arr5 = new int[20];
    }

    public static void display1DArray(Integer[] x) {
       for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
       }

        System.out.println("while 1d before");
       int i = 0;
       while (i < x.length) {
           System.out.println(x[i]);
           i++;
       }
        System.out.println("while 1d after");

       System.out.println("foreach 1d before");
       for (Integer n: x) {
           System.out.println(n);
       }
        System.out.println("foreach 1d after");

        System.out.println("do while 1d before");
        i = 0;
        do {
            System.out.println(x[i]);
            i++;
        } while (i < x.length);
        System.out.println("do while 1d after");
    }

    public static void display2DArray(Integer[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j]);
            }
        }
        System.out.println("foreach 2d before");
        for (Integer[] n: x) {
            for (Integer a: n) {
                System.out.println(a);
            }
        }
        System.out.println("foreach 2d after");
    }
}
