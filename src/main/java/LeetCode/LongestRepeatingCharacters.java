package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class LongestRepeatingCharacters {

    private static Map<String, Integer> mapOfCharacters = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));


    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int answer = 0;
        for(int j = 0, i = 0; j < s.length(); j++){

            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }

            answer = Math.max(answer, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return answer;
    }
//
//        char[] chars = s.toCharArray();
//        char currentUniqueCharacter = chars[0];
//        String uniqueSequenceOfCharacters = currentUniqueCharacter+ "";
//        for(int i = 1; i < chars.length; i++){
//
//            if(chars[i] != currentUniqueCharacter && !uniqueSequenceOfCharacters.contains(chars[i] + "")){
//
//                uniqueSequenceOfCharacters += chars[i];
//                currentUniqueCharacter = chars[i];
//
//            }else if(chars[i] == currentUniqueCharacter || uniqueSequenceOfCharacters.contains(chars[i] + "")){
//                if(mapOfCharacters.containsKey(uniqueSequenceOfCharacters)){
//                    mapOfCharacters.put(uniqueSequenceOfCharacters, mapOfCharacters.get(uniqueSequenceOfCharacters) +1);
//                }else{
//                    mapOfCharacters.put(uniqueSequenceOfCharacters, 1);
//                }
//                currentUniqueCharacter = chars[i];
//
//                uniqueSequenceOfCharacters = currentUniqueCharacter + "";
//            }
//        }
//
//        if(mapOfCharacters.containsKey(uniqueSequenceOfCharacters)){
//            mapOfCharacters.put(uniqueSequenceOfCharacters, mapOfCharacters.get(uniqueSequenceOfCharacters) +1);
//        }else{
//            mapOfCharacters.put(uniqueSequenceOfCharacters, 1);
//        }
//
//
//
//        int max = 0;
//        for(String str : mapOfCharacters.keySet()){
//            int num = mapOfCharacters.get(str);
//            max = Math.max(max, mapOfCharacters.get(str));
//        }
//
//        return max;
//
//    }
}
