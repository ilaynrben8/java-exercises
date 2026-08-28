import java.util.Arrays;

public class FindMinMax {
    public static int[] Find_MinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            } else {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Find_MinMax(arr);
        System.out.println("Min: " + result[0] + " Max: " + result[1]);
    }

    }



