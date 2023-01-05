class sumOfNNums{

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int x = n + sum(n-1);
        return x;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}