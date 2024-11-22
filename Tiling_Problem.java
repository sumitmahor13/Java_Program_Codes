public static int tilingProblem(int n) {       //floor size (2 x n);
        //base case
        if (n == 0 || n == 1) {
            return 1;
        } 

        //verticle choice
        int fnm1 = tilingProblem(n - 1);
        //horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    //main fn.
public static void main(String args[]) {
        int n = 5;
        System.out.println(tilingProblem(n));
    }
