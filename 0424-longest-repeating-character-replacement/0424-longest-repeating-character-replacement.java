public class Solution {
    public int characterReplacement(String s, int k) {
        char[] sc = s.toCharArray();
        int[] count = new int[26];
        int maxCount = 0, start = 0;
        for(int i=0;i<sc.length;i++){
            int index = sc[i]-'A';
            count[index]++;
            maxCount = Math.max(maxCount, count[index]);
            // i - start means the current longest length, if the (maxCount + k) <= (the current longest length), we move whole windows right.
            // otherwise the start stays at current position, but the "i" moves, means next round the longest length will increase.
            if(maxCount + k <= i - start){
                int indexStart = sc[start] - 'A';
                count[indexStart]--;
                start++;
            }
        }
        
        return sc.length-start;
    }
}