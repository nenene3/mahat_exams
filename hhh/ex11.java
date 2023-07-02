package hhh;

public class ex11 {
    public static void main(String[] args) {
        int[] arr1 = {10, 10, 20, 10, 30};
        int[] arr2 = {20, 20, 20, 20};
        int[] res = getDiffArr(arr1, arr2);

        for (int num : res) {
            System.out.println(num);
        }

    }

    public static int[] a(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    break;
                if (j == arr2.length - 1) {
                    arr[index++] = arr1[i];
                }
            }
        }
        int tmp = index;
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {

            }
        }
        return arr;
    }


    public static int[] getDiffArr(int[] arr1, int[] arr2) {
        boolean[] tmpRes = new boolean[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (!isExistInArrUntilIndex(arr1, i) && (!isNumExistInArr(arr2, arr1[i]))) {
                tmpRes[i] = true;
            }
        }

        int[] res = new int[getResArrSize(tmpRes)];
        int cnt = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (tmpRes[i]) {
                res[cnt++] = arr1[i];
            }
        }

        return res;
    }

    private static int getResArrSize(boolean[] tmpRes) {
        int cnt = 0;
        for (boolean isNotExistNum : tmpRes) {
            if (isNotExistNum) {
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean isExistInArrUntilIndex(int[] arr1, int i) {
        for (int j = 0; j < i; j++) {
            if (arr1[i] == arr1[j]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumExistInArr(int[] arr, int num) {
        for (int element : arr) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

}
