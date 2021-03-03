package JavaHomeWork;

import java.util.HashMap;
import java.util.Map;

public class Magazine {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.isEmpty() && magazine.isEmpty()) {
                return true;
            }

            Map<Character, Integer> rMap = new HashMap<>();
            Map<Character, Integer> mMap = new HashMap<>();
            for (int i = 0; i < ransomNote.length(); i++) {
                rMap.put(ransomNote.charAt(i), rMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
            }

            for (int i = 0; i < magazine.length(); i++) {
                mMap.put(magazine.charAt(i), mMap.getOrDefault(magazine.charAt(i), 0) + 1);
            }

            for(char c :rMap.keySet()) {
                if (mMap.get(c) == null) {
                    return false;
                }
                if (rMap.get(c) > mMap.get(c)) {
                    return false;
                }
            }
            return true;
        }
    }
/**2
 *   public boolean canConstruct(String ransomNote, String magazine) {
 *         int[] magazinemap = new int[26];
 *         for (char c : magazine.toCharArray())
 *             magazinemap[c - 'a']++;
 *         for (char c : ransomNote.toCharArray())
 *             if (magazinemap[c - 'a']-- == 0)
 *                 return false;
 *         return true;
 *     }
 */
/**3
 * public boolean canConstruct(String ransomNote, String magazine) {
 *         int[] words = new int[26];
 *         for(int i = 0; i < ransomNote.length(); i++){
 *             char cur = ransomNote.charAt(i);
 *             words[cur-'a']++;
 *         }
 *         int len = ransomNote.length();
 *         for(int i = 0; i<magazine.length()&&len>0; i++){
 *             char cur = magazine.charAt(i);
 *             if(words[cur-'a']!=0) {
 *             	len--;
 *             	words[cur-'a']--;
 *             }
 *         }
 *         return len==0;
 *     }
 */
