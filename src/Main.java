public class Main {
    private static int numTests=0;
    private static int numTestsPassed=0;

    public static void main(String[] args) {
	 runTests();
    }

    //TEST GENERIC
    //    private static boolean Test(){ }
    private static void runTests(){
        System.out.print("Testing market creation... ");
        checkSuccess(TestMarketCreation());
        System.out.print("Testing investor creation... ");
        checkSuccess(TestInvestorCreation());
        System.out.print("Testing single investor storage... ");
        checkSuccess(TestSingleInvestorStored());
        System.out.print("Testing single linked list item storage... ");
        checkSuccess(TestSingleLinkedListItem());

        System.out.println(numTestsPassed+" out of "+numTests+" passed.");
    }

    private static void checkSuccess(boolean b){
        numTests++;
        if(b){
            System.out.println("Success!");
            numTestsPassed++;
        }else{
            System.out.println("Test Failed");
        }
    }

    private static boolean TestMarketCreation(){
        Market main = new Market();
        return main!=null;
    }

    private static boolean TestInvestorCreation(){
        Market main = new Market();
        main.newInvestor("FName LName0", "User", 10);
        return main.getInvestor("User")!=null;
    }

    private static boolean TestSingleInvestorStored(){
        Market main = new Market();
        main.newInvestor("FName LName0", "User", 10);
        return main.getInvestor("User").getUserID() == "User";
    }

    private static boolean TestSingleLinkedListItem(){
        LinkedList a = new LinkedList();
        Investor b = new Investor("name","ID",10);
        a.addItem(b);
        return a.search("ID") == b;
    }
}
