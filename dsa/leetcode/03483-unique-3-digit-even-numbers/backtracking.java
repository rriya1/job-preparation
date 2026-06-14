class Solution {
    public int totalNumbers(int[] digits) {
        int[] newarr = new int[]{-1,-1,-1};
        // System.out.println(newarr[0]);

        Set<String> answers = new HashSet<>();
        solution(digits, newarr, 0, new int[digits.length], answers);

        return answers.size();
    }

    public void solution(int[] input, int[] output, int index, int[] used, Set<String> answers){
        if(index==3){
            answers.add(Arrays.toString(output));
            return;
        }

        for(int i=0;i<input.length;i++){
            if(used[i]!=1){
                if(index == 0 && input[i]==0)
                    continue;
                if(index == 2 && input[i]%2!=0)
                    continue;    
                // int[] newUsed = used.clone();
                output[index] = input[i];
                used[i] = 1;
                solution(input, output,index+1, used, answers);
                used[i] = 0;
            }
        }
        return;
    }
}
