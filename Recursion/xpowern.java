class Main {
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
    static int pow(int a, int n)
    {
        if(n==0){
            return 1;
        } 
        int halfpowSquared = pow(a,n/2)*pow(a,n/2);
        if(n%2 !=0){
            halfpowSquared*=a;
        }
        return halfpowSquared;
        
    }
}