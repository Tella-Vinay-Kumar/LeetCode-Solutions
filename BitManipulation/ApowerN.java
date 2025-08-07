class Main {
    public static void main(String[] args) {
        int a=2;
        int n=3;
        System.out.println(getPower(a,n));
    }
   public static int getPower(int a,int n){
       int ans=1;
       while(n>0){
           if((n&1)!=0){
               ans=ans*a;
           }
           a=a*a;
           n=n>>1;
       }
       return ans;
   }
}