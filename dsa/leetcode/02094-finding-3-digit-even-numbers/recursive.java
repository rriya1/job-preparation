//simple recursion, no optemisation

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] newarr = new int[]{-1,-1,-1};
        Set<Integer> answers = new HashSet<>();

        solve(digits, newarr, 0, answers);

        int[] arr = new int[answers.size()];
        int i =0 ;
        for(Integer ele : answers){
            arr[i++] = ele;
        }

        Arrays.sort(arr);
        return arr;

    }

    public void solve(int[] input, int[] output, int index, Set<Integer> answers){
        if(index == 3){
            answers.add(output[0]*100+output[1]*10+output[2]);
            return;
        }
        for(int i=0;i<input.length; i++){
            if(input[i]!= -1){
                if(index==0 && input[i] == 0)
                    continue;
                if(index == 2 && input[i]%2!=0)
                    continue;

                int tmp = input[i];
                input[i] = -1;
                output[index] = tmp;
                solve(input, output, index+1, answers);
                input[i] = tmp;        
            }
        }
        return;

    }
}
