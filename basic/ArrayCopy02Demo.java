package basic;
public class ArrayCopy02Demo {
    public static void main(String[] args){
        int[] sourceData = new int[]{1,2,3};
        int[] targetData = new int[3];

        System.arraycopy(sourceData, 0, targetData, 0, 3);
        
        for(int i=0; i<3; i++){
            System.out.println("targetData["+i+"] = "+targetData[i]);
        }
    }
}
