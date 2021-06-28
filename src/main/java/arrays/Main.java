package arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[10];

        System.out.println(arr1.length);

        Integer[] arr2 = new Integer[] {1, 2, 3};

        System.out.println(arr2.length);

        Integer[][] arr3 = new Integer[10][20];
        System.out.println(arr3.length);
        System.out.println(arr3[0].length);

        Integer[][] arr4= new Integer[][]  {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println(arr4.length);
        System.out.println(arr4[0].length);
    }
}
