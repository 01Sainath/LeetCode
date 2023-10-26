import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray2_80 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums);

        System.out.println(removeDuplicates(nums));
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        int unique = Integer.MIN_VALUE;
        int counter = 0;
        int flag = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != unique){
                unique = nums[i];
                counter=1;
            }
            else{
                counter++;
                if(counter>2){
                    nums[i] = Integer.MAX_VALUE;
                    flag++;
                }
            }
        }
        Arrays.sort(nums);
        return nums.length-flag;
    }
}
