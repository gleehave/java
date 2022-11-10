package algorithm;

public class Selection {
    public static void insertion_sort(int[] a){
        sort(a, a.length);
    }

    private static void sort(int[] a, int size){
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            for(int j=i+1; j<size; j++){
                if(a[j] < a[min_index]){
                    min_index=j;
                }
            }
            swap(a, min_index, i);
        }
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
