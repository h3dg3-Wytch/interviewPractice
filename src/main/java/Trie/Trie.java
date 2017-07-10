package Trie;

/**
 * Created by rex on 7/6/17.
 */
public class Trie {

    private TrieNode rootNode;
    private final char endOfWordMarker = '\0';

    public Trie(){ this.rootNode = new TrieNode();}

    public boolean checkPresentAndAdd(String word){
        TrieNode currentNode = rootNode;
        boolean isNewWord = false;

        for(int i = 0; i < word.length(); i++){
            char character = word.charAt(i);
            if(!currentNode.hasChildNode(character)){
                isNewWord = true;
                currentNode.insertChildNode(character);
            }
            currentNode = currentNode.getChildNode(character);
        }

        if(!currentNode.hasChildNode(endOfWordMarker)){
            isNewWord = true;
            currentNode.insertChildNode(endOfWordMarker);
        }

        return isNewWord;
    }
}
