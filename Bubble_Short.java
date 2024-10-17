class Practice {
    public static void bubbleSort(int array[]){
       for(int i=0; i<=array.length-2; i++){                  //i shows turns 
        for(int j=0; j<=array.length-2-i; j++){
            if(array[j] > array[j+1]){                        //swaping...
                int temp; 
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
       }
    
        for(int i=0; i<=array.length-1; i++){                 //print shorted array
            System.out.print(array[i]+ " ");
        }
    }

    public static void main(String args[]){
        int array[] = {2,5,7,1,6,-3,-5,4,8};

        bubbleSort(array);
    }
}
