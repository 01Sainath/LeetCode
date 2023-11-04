import java.util.Scanner;

public class ContainsDuplicate2_219 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        System.out.println(containsNearbyDuplicate(arr, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int limit = Math.min(i+1+k,nums.length);
            for(int j=i+1; j<limit; j++){
                if(nums[i] == nums[j] && j-i <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
