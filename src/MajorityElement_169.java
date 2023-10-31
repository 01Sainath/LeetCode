import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement_169 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> mapElement : freq.entrySet()){
            Integer value = mapElement.getValue();

            if(value>nums.length/2){
                return mapElement.getKey();
            }

        }

        return -1;
    }
}
