class Solution {//Runtime: 28 ms, faster than 14.91% of Java online submissions for Ransom Note.
 // Memory Usage: 38.2 MB, less than 98.30% of Java online submissions for Ransom          
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ran= ransomNote.toCharArray();
        char[] maga = magazine.toCharArray();
        Map<Object,Integer> map = new HashMap<>();
        for(int i =0;i<maga.length;i++)
        {
            if(map.containsKey(maga[i]))
            {
                map.put(maga[i],map.get(maga[i])+1);
            }
            else{
                map.put(maga[i],1);
            }
        }
        for(int i =0;i< ran.length;i++)
        {
            if(!map.containsKey(ran[i]) || map.get(ran[i])<=0)
            {
                return false;
            }
            else{
                map.put(ran[i],map.get(ran[i])-1);
            }
        }
        return true;
    }
}
