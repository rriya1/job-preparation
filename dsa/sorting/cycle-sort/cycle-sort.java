//case when 1...n integers are given, no duplicates, no missing numbers. This is basic cycle sort

import java.util.*;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Array size: ");
        int n = sc.nextInt();
        
        int[] input = new int[n];
        System.out.print("Elements: \n");
        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        
        int[] result = cycle_sort(input);
        
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
    
    public int[] cycle_sort(int[] input){
      for(int i=0; i < input.length; i++){
        while(input[i] != i+1){
          int curr_val = input[i];
          int correct_index_of_curr_val = curr_val-1;
          int tmp = input[correct_index_of_curr_val];
          input[correct_index_of_curr_val] = curr_val;
          input[i] = tmp;
        }
      }
      return input;
    }
}
