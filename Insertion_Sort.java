
class Practice {

    public static void insertionSort(int array[]){
        for(int i=1; i<array.length; i++){
            int curr = array[i];
            int prev = i-1;
            while(prev >= 0 && curr < array[prev]){
                array[prev+1] = array[prev];
                prev--;
            }

            array[prev+1] = curr;
        }

    //for print shorted array
    for(int p=0; p<=array.length-1; p++){
        System.out.print(array[p]+ " ");
    }
    
    }

    public static void main(String args[]){
        int array[] = {5,2,1,3,4};

        insertionSort(array);
    }
}
