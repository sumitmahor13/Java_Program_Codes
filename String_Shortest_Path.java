class Practice {

    public static float shortestPath(String path){
        //directions from x axis & y axis
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            //direction at ith character
            int dir = path.charAt(i);

            if(dir == 'E'){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
        }                                                                                      // √(x2-x1)²+(y2-y1)²
        //here X2 means x2-x1 and Y2 means y2-y1                                               // √(3-0)²+(4-0)²
        int X2 = x*x;                                                                          // √3²+4²
        int Y2 = y*y;                                                                          // 5

        return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String args[]){
        String path = "WNEENESENNN";

        System.out.println("Shortest Path: "+ shortestPath(path));

    }
}
