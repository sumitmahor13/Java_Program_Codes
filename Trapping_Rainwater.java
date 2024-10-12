class Practice {

    public static void TrapWater(int heights[], int width){
        //Calculate LeftMax boundry Axularry array
        int leftMax[] = new int[heights.length];
        
        leftMax[0] = heights[0];
        for(int i=1; i<=heights.length-1; i++){
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }

         //Calculate RightMax boundry Axularry array
         int rightMax[] = new int[heights.length];


         rightMax[heights.length-1] = heights[heights.length-1];
         for(int i=heights.length-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
         }
        
        //for waterLevel

        int volume = 0;
        
        for(int i=0; i<=heights.length-1; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            if(waterLevel < 0){
                waterLevel = 0;
            }
            volume = volume + (waterLevel - heights[i])*width;
        }

        System.out.println("Volume of Trapping water is: "+ volume);

    } 

//------------main Function---------------
    public static void main(String args[]){
         int heights[] = {2,4,5,3,4,6,1,4,3,6,3,2,5,0,5,2,3};
         int width = 1;
         TrapWater(heights, width);
    }
}
