package Trie;

import java.util.HashMap;

/**
 * Created by rex on 7/6/17.
 */
public class TrieNode {

    private HashMap<Character, TrieNode> nodeChildren;

    public TrieNode(){
        this.nodeChildren = new HashMap<>();
    }

    public boolean hasChildNode(char character){
        return this.nodeChildren.containsKey(character);
    }

    public void insertChildNode(char character){
        this.nodeChildren.put(character, new TrieNode());
    }

    public TrieNode getChildNode(char character){
        return nodeChildren.get(character);
    }
}
