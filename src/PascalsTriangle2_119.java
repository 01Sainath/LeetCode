import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle2_119 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rowIndex = input.nextInt();
        List <Integer> row = getRow(rowIndex);

        for(int ele:row){
            System.out.print(ele+" ");
        }
    }
    public static List<Integer> getRow(int rowIndex) {

        int arr[][] = new int[rowIndex+1][rowIndex+1];

        for(int i=0; i<rowIndex+1; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for(int i=2; i<rowIndex+1; i++){
            for(int j=0; j<i-1; j++){
                arr[i][j+1] = arr[i-1][j] + arr[i-1][j+1];
            }
        }

        List <Integer> l = new ArrayList<>();

        for(int i=0; i<rowIndex+1; i++){
            if(arr[rowIndex][i] != 0){
                l.add(arr[rowIndex][i]);
            }
        }

        return l;

    }
}
