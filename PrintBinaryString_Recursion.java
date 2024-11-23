public static void printBinString(int n, int prevPlace, String str) {
        //base case
        if(n == 0){
          System.out.println(str);
          return;
        }

        //kaam
        if(prevPlace == 0){
          printBinString(n-1, 0, str+"0");
          printBinString(n-1, 1, str+"1");
        }else{
          printBinString(n-1, 0, str+"0");
        }
    }

    public static void main(String args[]) {
        printBinString(3, 0, "");
    }
