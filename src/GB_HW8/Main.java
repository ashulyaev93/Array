package GB_HW8;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 5, 2, 2, 4, 1, 4, 5, 1, 5, 3, 2, 4, 4, 4, 5, 1, 3, 4, 2, 2, 1, 2, 4, 4, 4, 5, 4, 3, 5, 4, 4,
                5, 5, 1, 4, 1, 5, 3, 1, 4, 5, 3, 3, 4, 2, 2, 4, 4, 5, 5, 1, 1, 1, 4, 5, 5, 4, 4, 2, 4, 3, 1, 3, 3, 1, 1,
                3, 1, 3, 4, 4, 3, 2, 2, 1, 3, 4, 4, 2, 3, 4, 2, 4, 4, 1, 4, 4, 4, 2, 1, 2, 4, 1, 5, 2, 2, 5, 4, 2, 2, 3,
                1, 5, 5, 3, 5, 3, 1, 4, 5, 4, 2, 1, 3, 1, 2, 1 ,4 ,1 ,3 ,4 ,2 ,2 ,5 ,2 ,3 ,1 ,1 ,2 ,3 ,3 ,4, 4, 2, 4, 1,
                2, 2, 2, 5, 1, 5, 1, 2, 2, 1 ,3 ,3 ,4 ,3 ,5 ,3 ,5 ,1 ,2 ,1 ,3 ,3 ,2 ,4 ,1 ,4 ,3 ,5 ,1 ,2 ,1, 2, 3, 2, 1,
                3, 2, 2, 4, 3, 2, 1, 5, 1, 4, 5, 4, 4, 5, 5, 4, 2, 3, 5, 1, 3, 4, 3, 2, 4, 5 ,2 ,5 ,2 ,4 ,1, 4, 5, 2, 3,
                3, 4, 4, 3, 5, 2, 2, 3, 5, 1, 2, 4, 3, 4, 4, 3, 2, 2, 1, 4, 5, 5, 1, 5, 2, 4, 5, 5, 4, 2, 2, 1, 5, 1, 3,
                4, 2, 4, 2, 2, 4, 3, 5, 2, 2, 4, 4, 4, 5, 5, 2, 5, 5, 2, 5, 1, 1, 5, 5, 4, 1, 2, 4, 1, 2, 2, 5, 4, 5, 1,
                5, 4, 4, 5, 5 ,5 ,3 ,3 ,4 ,3 ,3 ,5, 3, 2, 2, 2, 2, 2, 1, 2, 5, 2, 3, 4, 3, 5, 5, 2, 4, 5, 3, 4, 3, 1, 3,
                2, 1, 1, 5, 4, 4, 2 ,3 ,1 ,3 ,4 ,2 ,4 ,1 ,3 ,5 ,1, 5, 3, 5, 2, 3, 4, 4, 1, 3, 1, 5, 5, 1, 2, 2, 1, 3, 1,
                5, 1, 2, 2, 1, 5, 1 ,3 ,3, 2, 1, 3, 2, 5, 1, 1, 2, 3, 5, 5 ,4 ,3, 1, 3, 3, 1, 5, 4, 2, 3, 4};

        int m = 1;
        int n = 1;
        int k = 1;
        int l = 1;
        int p = 1;
        int[] array2= new int[5];

        for(int i = 0; i<array.length; i++) {
            if (array[i] == 1) {
                array2[0] = m++;
            }
            if (array[i] == 2) {
                array2[1] = n++;
            }
            if (array[i] == 3) {
                array2[2] = k++;
            }
            if (array[i] == 4) {
                array2[3] = l++;
            }
            if (array[i] == 5) {
                array2[4] = p++;
            }
        }
        System.out.print(array2[0] + " ");
        System.out.print(array2[1] + " ");
        System.out.print(array2[2] + " ");
        System.out.print(array2[3] + " ");
        System.out.print(array2[4] + " ");
    }
}
