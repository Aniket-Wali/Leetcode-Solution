class Solution {
    public boolean buddyStrings(String s, String goal) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        if(s.length() != goal.length())
            return false;
        else if(s.equals(goal)){
            for(int i = 0; i<s.length(); i++){
                if(hm.containsKey(s.charAt(i)))
                    return true;
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            }
            return false;
        }
        else{
            int count = 0;
            for(int i = 0; i<s.length(); i++){
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
                hm1.put(goal.charAt(i), hm1.getOrDefault(goal.charAt(i), 0) + 1);
            }
            for(Character str : hm.keySet()){
                if(hm.containsKey(str) == false || hm1.containsKey(str) == false)
                    return false;
                if((int)hm.get(str) != (int)hm1.get(str))
                    return false;
               
            }
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) != goal.charAt(i))
                    count++;
                if(count > 2)
                    return false;
            }
            return true;
        }
    }
}