class Practice {

    public static void selectionSort(int array[]){
       for(int i=0; i<=array.length-2; i++){
        int minPosition = i;
        for(int j=i+1; j<=array.length-1; j++){
            //find minPostion
            if(array[minPosition] > array[j]){
                minPosition = j;
            }
        }
        //swaping
        int temp = array[minPosition];
        array[minPosition] = array[i];
        array[i] = temp;
       }

    //for print shorted array
    for(int p=0; p<=array.length-1; p++){
        System.out.print(array[p]+ " ");
    }
    
    }

    public static void main(String args[]){
        int array[] = {5,2,1,3,4};

        selectionSort(array);
    }
}
