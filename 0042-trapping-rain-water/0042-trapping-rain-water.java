class Solution {
    public int trap(int[] numbers) {
         int n= numbers.length;
              int leftmax[]= new int[n];
        leftmax[0]=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            leftmax[i]=Math.max(numbers[i],leftmax[i-1]);
            //System.out.println(leftmax[i]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=numbers[n-1];
        for(int i=n-2;i>=0;i--){
             rightmax[i]=Math.max(numbers[i],rightmax[i+1]);
           // System.out.println(rightmax[i]);
        }

        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-numbers[i];
        }
        return trappedwater;
        
        
    }
}