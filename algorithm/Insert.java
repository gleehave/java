package algorithm;

public class Insert {
    public static void sort(int[] a){
        sort(a, a.length);
    }
    private static void sort(int[] a, int size){
        for(int i=1; i<size; i++){
            int target=a[i];
            int j=i-1;
            while(j>=0 && target<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = target;
        }
    }
}
