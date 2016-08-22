package LinkedLists;

import java.lang.reflect.Array;

/**
 * Created by rex on 8/15/16.
 */
public class HashTable<K, V> {

    private static final int HASH_TABLE_SIZE = 5;

    private Object[] table;
    private int amountOfObjects;

    public HashTable(){
        table = new Object[HASH_TABLE_SIZE];
        this.amountOfObjects = 0;
    }
    public int hash(K key){
        return (key.hashCode() & 0x7ffffff) % HASH_TABLE_SIZE;
    }
    public void put(K key, V value){
        int position = hash(key);
        if(table[position] != null){
            while (table[position] != null){
                position++;
                position = position % HASH_TABLE_SIZE;
            }
        }
        table[position] = value;
    }

//    public V get(K key){
//
//    }

    public void display(){
        System.out.print("Current Values:");
        for(int i = 0 ; i < table.length; i++){
            System.out.print(" " + table[i] + " ");
        }
        System.out.println();
    }
}
