
 
class Solution {
     public int square(int n){
           int sum=0;
        int a=0;
        while(n!=0){
            a=n%10;
            sum+=Math.pow(a,2);
            n=n/10;
              
           
        }
       
        return sum;
        }
    public boolean isHappy(int n) {
        boolean flag =false;
        HashSet<Integer>out=new HashSet<>();
      
        int sum=n;
        while (sum!=1&&!out.contains(sum)){
            out.add(sum);
            sum=square(sum);}
            
        
     return sum==1;

    }
}
