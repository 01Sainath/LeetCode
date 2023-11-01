import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> unique = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            unique.add(nums[i]);
        }

        if(nums.length == unique.size()){
            return false;
        }
        return true;
    }
}
