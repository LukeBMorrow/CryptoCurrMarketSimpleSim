
public class HashTable {
    private static final int TABLE_SIZE=97;//large and prime to minimize collisions
    private static final int HASH_COEFFIENT=13;
    private LinkedList[] table;

    public HashTable(){
        table = new LinkedList[TABLE_SIZE];
    }

    public void addItem(Object o){
        if(o instanceof Investor){
            int hashKey = generateHash(((Investor) o).getUserID());
            table[hashKey].addItem(o);
        }else{
            System.out.println("Error: unrecognized type in hash table");
        }
    }

    private int generateHash(String s){
        return 1;
    }

    public Object getItem(String s){
        int hashKey = generateHash(s);
        return table[hashKey].search(s);
    }
}
