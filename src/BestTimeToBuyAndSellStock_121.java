import java.util.Scanner;

public class BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int arr[] = new int[input.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }

        return op;
    }
}
