class Practice {

    public static void buy&sellStocks(int prices[]) {
        int bp = prices[0];
        int maxP = 0;
        for(int i=1; i<=prices.length-1; i++){
            int sp = prices[i];
            if(bp < sp){
                int p = sp - bp;
                if(maxP < p){
                    maxP = p;
                }
            }else{
                bp = sp;
            }
        }

        System.out.println("Maximum Profit is : "+maxP);
    }

//main function
    public static void main(String args[]){
        int prices[] = {1,2,5,9,6,2};
        buy&sellStocks(prices);

        
    }
}
