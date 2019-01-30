/*
    HashTable
    This class is a standard (closed) hash table.
    Behaviour includes:
    -addItem        adds a new item to the hashTable
    -generateHash   generates a consistent hashCode
    -getItem        searches for an item and returns it (returns null if not found)
 */

public class HashTable {
    private static final int TABLE_SIZE = 97;//large and prime to minimize collisions
    private static final int HASH_COEFFICIENT = 13;
    private LinkedList[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList();
        }

    }

    public void addItem(LinkItem o) {

        if (getItem(o.getID()) == null) {
            int hashKey = generateHash(o.getID());
            table[hashKey].addItem(o);
        } else
            System.out.println("ERROR: " + o.getID() + " already exists.");
    }

    private int generateHash(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += ((int) (s.charAt(i))) * HASH_COEFFICIENT;
            result %= TABLE_SIZE;
        }
        return result;
    }

    public LinkItem getItem(String s) {
        int hashKey = generateHash(s);
        return table[hashKey].search(s);
    }
}
