class Solution {
    public int compress(char[] chars) {
      StringBuilder sb= new StringBuilder();
   
     
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            int j = i;

            while (j < chars.length && chars[j] == chars[i]) {
                count++;
                j++;
            }

            sb.append(chars[i]);
            if (count > 1) {
                sb.append(count);
            }

            i = j - 1; // 🔥 key fix: skip counted chars
        }
         for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
         }
        return sb.length();
    }
}