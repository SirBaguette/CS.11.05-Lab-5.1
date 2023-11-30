import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int sum(int[] array) {
        int rs = 0;
        for (int i=0; i<array.length; i++) {
            rs = rs+array[i];
        }
        return rs;
    }

    public static double average(int[] array) {
        int rs = 0;
        for (int i=0; i<array.length; i++) {
            rs = rs+array[i];
        }
        int a = rs*100/array.length;
        return (double) a/100;
    }

    public static int minimum(int[] array) {
        int rs = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] < rs) {
                rs = array[i];
            }
        }
        return rs;
    }

    public static int maximum(int[] array) {
        int rs = array[0];
        for (int j : array) {
            if (j > rs) {
                rs = j;
            }
        }
        return rs;
    }

    public static int evenCount(int[] array) {
        int rs = 0;
        for (int j : array) {
            if (j%2 == 0) {
                rs++;
            }
        }
        return rs;
    }

    public static int[] reverseOne(int[] array) {
        int[] rv = new int[array.length];
        for (int i = 0; i<array.length; i++) {
            rv[i] = array[array.length-i-1];
        }
        return rv;
    }

    public static void reverseTwo(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i =0; i<array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int s = 0; s< array.length; s++) {
            if (str == array[s]) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i<array.length; i++) {
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i<array.length; i++) {
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static boolean twoSum(int[] array, int num) {
        int nm;
        for (int i = 1; i<array.length; i++) {
            nm = array[i];
            for (int a = 1; a<array.length; a++) {
                if (array[a]+nm == num && a != i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int a = array[array.length-1];
        for (int i = array.length-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = a;
    }

    public static void shiftLeft(int[] array) {
        int a = array[0];
        for (int i = 0; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = a;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int l = array.length;
        n = n % l;
        for (int shift = 0; shift < n; shift++) {
            int le = array[l - 1];
            for (int i = l - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = le;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int l = array.length;
        n = n % l;
        for (int shift = 0; shift < n; shift++) {
            int fe = array[0];
            for (int i = 0; i < l - 1; i++) {
                array[i] = array[i + 1];
            }
            array[l - 1] = fe;
        }
    }


}
