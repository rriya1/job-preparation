class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while(word.length()<k){
            StringBuilder wordNeg = new StringBuilder();
            for(int i=0;i<word.length();i++){
                wordNeg.append((char)(word.charAt(i)+1));
            }
            word = word + wordNeg;
            System.out.println(word);

        }
        return word.charAt(k-1);
    }
}
