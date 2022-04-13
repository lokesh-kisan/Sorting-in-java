public class SelectionSort1 {

    public static void  printArry(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        
        //Selection Sort
        
        for(int i=0; i<arr.length-1; i++){
            int small=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[small] )
                    small=j;
            }
            //swap
            int temp=arr[small];
            arr[small]= arr[i];
            arr[i]=temp;
        }
        printArry(arr);
    }
}
