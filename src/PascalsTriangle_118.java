import java.util.*;
public class PascalsTriangle_118 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int numsRow = input.nextInt();
        List<List<Integer>> list = generate(numsRow);

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> generate(int numsRow) {
        int ans[][] = new int[numsRow][numsRow];
        List<List<Integer>> Oans = new ArrayList<>();

        for(int i=0; i<numsRow; i++){
            ans[i][0] = 1;
            ans[i][i] = 1;
        }
        for(int i=2; i<numsRow; i++){
            for(int k=0; k<i-1; k++){
                ans[i][k+1] = ans[i-1][k]+ans[i-1][k+1];
            }
        }

        for(int i=0; i<numsRow; i++){
            List <Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                row.add(ans[i][j]);
            }
            Oans.add(row);
        }
        return Oans;
    }
}