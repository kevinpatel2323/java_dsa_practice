public class buy_sell_stocks {
    public static void profit(int a[]){
        int profit = 0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i]<a[i+1]) {
                profit += a[i+1]-a[i];
            }
        }

        System.out.println(profit);
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        profit(prices);
    }
}
