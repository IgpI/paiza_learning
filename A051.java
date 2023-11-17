import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=0;
        int x=0;
        int num = 0;
        //input_1
        String tmp1 = sc.nextLine();
        String[] line_tmp1 = tmp1.split(" ");
        y = Integer.parseInt(line_tmp1[0]);
        x = Integer.parseInt(line_tmp1[1]);
        
        //prepared_input2
        int [][] input_2 = new int[y][x];
        
        //input_2
        for(int i=0;i<y;i++){
            String tmp2 = sc.nextLine();
            String[] line_tmp2 = tmp2.split(" ");
            for(int j = 0;j<x;j++){
                input_2[i][j] = Integer.parseInt(line_tmp2[j]);
            }
        }
        
        //search
        int initial_num_point = 0;
        int max_value_tmp1 = max_num(input_2[0]);
        for(int j = 0;j<x;j++){
                if(input_2[0][j] == max_value_tmp1){
                    initial_num_point = j;
                }
        }
        
        int pivot_point = initial_num_point;
        int left_point = 0;
        int right_point = 0;
        int sum = max_value_tmp1;
        int max_flg=0;
        for(int i=0;i<y-1;i++){
            max_flg = 0;
            
            //define_point
            if (pivot_point>0){
                left_point = pivot_point-1;
            }else{
                left_point = pivot_point;
            }
            if (pivot_point<x-1){
                right_point = pivot_point+1;
            }else{
                right_point = pivot_point;
            }
            /*debug
            System.out.println(pivot_point);
            System.out.println(left_point);
            System.out.println(right_point);
            */
            if(input_2[i+1][pivot_point]<input_2[i+1][left_point] && input_2[i+1][right_point]<input_2[i+1][left_point]){
                max_flg = 1;
            }else if(input_2[i+1][pivot_point]<input_2[i+1][right_point] && input_2[i+1][left_point]<input_2[i+1][right_point]){
                max_flg = 2;
            }
            if(max_flg==0){sum += input_2[i+1][pivot_point];}
            if(max_flg==1){sum += input_2[i+1][pivot_point-1];pivot_point=left_point;}
            if(max_flg==2){sum += input_2[i+1][pivot_point+1];pivot_point=right_point;}
            
        }
        
        
    System.out.println(sum);
        
        
        
        //output
    }
    //search_max_function
    public static Integer max_num(int[] arg1){
        int Max_value = 0;
        for(int i =0;i<arg1.length;i++){
            if(Max_value<arg1[i]){
                Max_value = arg1[i];
            }
        }
        return Max_value;
    }
     
    
    
}

