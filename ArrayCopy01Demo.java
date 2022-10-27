public class ArrayCopy01Demo {
    public static void main(String[] args){
        int[] sourceData = new int[]{1,2,3};
        int[] targetData = new int[3];

        for(int i=0; i<sourceData.length; i++){
            targetData[i] = sourceData[i];
        }

        for(int i=0; i<targetData.length; i++){
            System.out.println("targetData["+i+"] = "+targetData[i]);
        }
    }
}
