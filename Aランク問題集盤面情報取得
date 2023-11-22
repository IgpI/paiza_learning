/*ARankLevelUp-盤面取得*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        String[][] banmen = new String[H][W];
        
        for(int i=0;i<H;i++){
            String input2_tmp = sc.next();
            for(int j=0; j<W;j++){
                banmen[i][j] = String.valueOf(input2_tmp.charAt(j));
            }
        }
        //otput
        for(int k=0; k<N; k++){
          int Y = sc.nextInt();
          int X = sc.nextInt();
          System.out.println(banmen[Y][X]);
        } 
    }
