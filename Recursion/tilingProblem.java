// given a @xn board and tiles of size 2x1 count the number of ways to tile the given board using the 2x1 tiles (A tile can either be placed horizontally or vertically)

class Main {
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    static int tilingProblem( int n)
    {
        if(n==0  || n==1){
            return 1;
        } 
        return tilingProblem(n-1) + tilingProblem(n-2);
        
    }
}
