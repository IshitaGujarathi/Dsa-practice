public class Solution {
    public int characterReplacement(String s, int k) {
        char[] sc = s.toCharArray();
        int[] count = new int[26];
        int maxCount = 0, start = 0;
        for(int i=0;i<sc.length;i++){
            int index = sc[i]-'A';
            count[index]++;
            maxCount = Math.max(maxCount, count[index]);
            
            if(maxCount + k <= i - start){
                int indexStart = sc[start] - 'A';
                count[indexStart]--;
                start++;
            }
        }
        
        return sc.length-start;
    }
}