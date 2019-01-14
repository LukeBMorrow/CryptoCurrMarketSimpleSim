public class Tests {
    private static int numTests = 0;
    private static int numTestsPassed = 0;
    private static final int STRESS_TEST_SIZE = 10000;

    public static void runTests() {
        System.out.print("Testing market creation... ");
        checkSuccess(TestMarketCreation());
        System.out.print("Testing investor creation... ");
        checkSuccess(TestInvestorCreation());
        System.out.print("Testing single investor storage... ");
        checkSuccess(TestSingleInvestorStored());
        System.out.print("Testing single linked list item storage... ");
        checkSuccess(TestSingleLinkedListItem());
        System.out.print("Testing single hash table item storage... ");
        checkSuccess(TestHashAddSingleItem());
        System.out.print("Testing hash table item retrieval... ");
        checkSuccess(TestHashGetItem());
        System.out.print("Testing hash table multiple item storing and retrieval... ");
        checkSuccess(TestHashAddAndGetMultipleItems());
        System.out.print("Testing mass hash storage and retrieval... ");
        checkSuccess(StressTestHashTable());

        System.out.println(numTestsPassed + " out of " + numTests + " passed.");
    }

    private static void checkSuccess(boolean b) {
        numTests++;
        if (b) {
            System.out.println("Success!");
            numTestsPassed++;
        } else {
            System.out.println("Test Failed");
        }
    }

    private static boolean TestMarketCreation() {
        Market main = new Market();
        return main != null;
    }

    private static boolean TestInvestorCreation() {
        Market main = new Market();
        main.newInvestor("FName LName0", "User", 10);
        return main.getInvestor("User") != null;
    }

    private static boolean TestSingleInvestorStored() {
        Market main = new Market();
        main.newInvestor("FName LName0", "User", 10);
        return main.getInvestor("User").getUserID() == "User";
    }

    private static boolean TestSingleLinkedListItem() {
        LinkedList a = new LinkedList();
        Investor b = new Investor("name", "ID", 10);
        a.addItem(b);
        return a.search("ID") == b;
    }

    private static boolean TestHashAddSingleItem() {
        Investor a = new Investor("name", "ID", 10);
        HashTable h = new HashTable();
        h.addItem(a);
        return true;
    }

    private static boolean TestHashGetItem() {
        Investor a = new Investor("name", "ID", 10);
        HashTable h = new HashTable();
        h.addItem(a);
        return h.getItem("ID") == a;
    }

    private static boolean TestHashAddAndGetMultipleItems() {
        boolean result;
        Investor a = new Investor("name", "ID1", 10);
        Investor b = new Investor("name", "ID2", 10);
        Investor c = new Investor("name", "ID3", 10);
        HashTable h = new HashTable();
        h.addItem(a);
        h.addItem(b);
        h.addItem(c);
        result = (a == h.getItem("ID1") && b == h.getItem("ID2") && c == h.getItem("ID3"));
        return result;
    }

    private static boolean StressTestHashTable() {
        boolean result=true;
        HashTable h = new HashTable();
        Investor a;
        for (int i = 0; i < STRESS_TEST_SIZE; i++) {
            h.addItem(a = new Investor("name" + i, "ID"+i, i));
            result = result && (a == h.getItem("ID" + i));
        }
        return result;
    }
}
