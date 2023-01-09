class Solution {
    public int commonFactors(int a, int b) {
         int j=0;
         int min=Math.min(a,b);
         int max=Math.max(a,b);
        for(int i=1;i<=(min;i++)
        {
            if(min%i==0 && max%i==0)
            {
               j++;
            }
        }
        return j;
        
        
    }
}