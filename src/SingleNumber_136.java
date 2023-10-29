import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber_136 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(singleNumber(arr));

    }
    static public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i])+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> ele: hash.entrySet()){
            if(hash.get(ele.getKey()) == 1){
                return ele.getKey();
            }
        }

        return -1;
    }

}
