
public class HashTable {
    private static final int TABLE_SIZE=97;//large and prime to minimize collisions
    private static final int HASH_COEFFIENT=13;
    private LinkedList[] table;

    public HashTable(){
        table = new LinkedList[TABLE_SIZE];
    }

    public void addItem(String s){

    }
    private int generateHash(String s){
        return 1;
    }
}
