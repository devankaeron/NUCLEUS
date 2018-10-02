





Take an input N, the size of array.
Take N more inputs and store that in an array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Take One More Input I which I'm going to use for verification that you
returned a array or not.

Write a recursive function which reverses the array.

print the reversed array.
print the value of I index of the reversed array.


Example(To be used only for expected output):
Input:
9
2 8 6 4 8 6 4 9 0
1
Output:
0 9 4 6 8 4 6 8 2
9

----------------------------------------------------------------------------------------------------------------------------------




 Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        reverse(arr, 0, arr.length - 1);
        System.out.println(arr[x]);
    }

    public static int[] reverse(int[] arr, int left, int right) {
        if (left > right) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return arr;
        }
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
        
    //    swap(arr[left] , arr[right]);
        reverse(arr, left+1, right-1);
        return arr;
    }

    public static void swap(int a , int b) {
        int temp = a;
        a=b;
        b= temp;
    }
}
