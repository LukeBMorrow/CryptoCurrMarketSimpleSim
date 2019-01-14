
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

    public void addItem(Object o) {
        if (o instanceof Investor) {
            int hashKey = generateHash(((Investor) o).getUserID());
            table[hashKey].addItem(o);
        } else {
            System.out.println("Error: unrecognized type in hash table");
        }
    }

    private int generateHash(String s) {
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            result += ((int)(s.charAt(i)))* HASH_COEFFICIENT;
            result%=TABLE_SIZE;
        }
        return result;
    }

    public Object getItem(String s) {
        int hashKey = generateHash(s);
        return table[hashKey].search(s);
    }
}
