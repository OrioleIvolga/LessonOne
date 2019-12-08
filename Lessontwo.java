package ru.geekbrains.java_one.lesson_a.homework;

public class Lessontwo {

    private static void changeArray (int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else arr[i] = 0;
            i++;
        }
    }

    private static void pushArray (int[] arr) {
        int a = 1;
        int i = 0;
        while (i < arr.length) {
            arr[i] = a;
            a += 3;
            i++;
        }
    }

    private static void raiseArray (int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else arr[i] = arr [i];
            i++;
        }
    }

    private static int maxCount (int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

    private static boolean middleArray (int[] arr) {
        float sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum % 2 == 0;
    }

    private static void shiftArray (int[] arr, int n) {
        while(n > arr.length) {
            n -= arr.length;
        }
        int[] helper = new int[arr.length];
        for (int i = 0; i < arr.length - n; i++) {
            helper[i+n] = arr[i];
        }
        for (int i = 0; i < n ; i++) {
            helper[i] = arr[arr.length - n + i];
        }
     }

    private static void shiftNoHelper(int[] arr, int n) {
        if (n < 0) {
            n = arr.length + n;
        } else {
            while(n > arr.length) {
                n -= arr.length;
            }
        }
        if (n != 0) {
            int buffer1, buffer2;
            for (int n1 = 0; n1 < n; n1++) {
                buffer1 = arr[arr.length - 1];
                buffer2 = arr[n1];
                for (int i = n1+1; i < arr.length; i++) {
                    int b = arr[i];
                    arr[i] = buffer2;
                    buffer2 = b;
                }
                arr[n1] = buffer1;
            }
            for (int i = 0; i < n; i++) {
                if (i < n / 2) {
                    int a = arr[i];
                    arr[i] = arr[n - i - 1];
                    arr[n - i - 1] = a;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] arr =  {0,0,1,0};
        int i = 0;
        while (i < arr.length) {
            i++;
        }
        changeArray (arr);

        int[] arr1 = new int[8];
        pushArray (arr1);

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        raiseArray (arr3);

        maxCount (arr3);

        int[][] arr4 = new int[7][7];
        int k = 0;
        for (i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = 0;
            }
            arr4[i][k] = 1;
            k++;
        }
        k = arr4.length - 1;
        for (i = 0; i < arr4.length; i++) {
            arr4[i][k] = 1;
            k--;
        }

        middleArray (arr3);

        shiftArray (arr3, 3);

        shiftNoHelper(arr3, 3);
    }
  }

