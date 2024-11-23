public static int friendsPairing(int n) {
        //base case
        if (n == 1 || n == 2) {
            return n;
        }

        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);                      // Goldman Sachs
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }
