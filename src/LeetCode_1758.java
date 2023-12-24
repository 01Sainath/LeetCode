public class LeetCode_1758 {
    public static void main(String args[]){

        System.out.println(minOperations("0010101"));
    }
    public static int minOperations(String s) {

        int n = s.length();
        int countChanges0=0;
        int countChanges1=0;

        for(int i=0; i<n; i++){

            if(i%2 == 0){
                if(s.charAt(i) == '0'){
                    countChanges1++;
                }
                else{
                    countChanges0++;
                }
            }
            else{
                if(s.charAt(i) == '1'){
                    countChanges1++;
                }
                else{
                    countChanges0++;
                }
            }
        }

        return Math.min(countChanges1,countChanges0);
    }
}
