//...traversal by for each loop......

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6}, {4,1,9,8}, {9,1,3,}, {7,4}};
        for(int i[] : arr) {                    //line important
            for(int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
