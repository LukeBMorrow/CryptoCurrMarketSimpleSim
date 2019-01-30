/*
    Market
    This class groups investors and crypto-currencies together and directs
    commands to their respective location and prints errors if:
        -the investor isn't found
        -the currency isn't found
        -the investor is trying to trade more money than they have
    Behaviours include:
    -newCryptocurrency  creates a new crypto-currency and adds it to the HashTable of crypto-currencies
    -newInvestor        creates a new investor and adds it to the HashTable of investors
    -mine               mines a specified amount of a specified cryptocurrency and gives it to the specified investor
    -trade              trades crypto-currency between two investors
    -report             reports all of the currencies currently held by a specified investor
    -cryport            reports all trades/mines that have happened to a specified crypto-currency
*/
public class Market {
    private HashTable investors;
    private HashTable cryptoCurrencies;

    public Market() {
        investors = new HashTable();
        cryptoCurrencies = new HashTable();
        cryptoCurrencies.addItem(new Cryptocurrency("cash", "CAD", 0));
    }

    public void newCryptocurrency(String name, String currID, int amount) {
        assert (amount >= 0);//can only initialize a cryptocurrency with a zero/positive amount of mine-able resources
        if (currID.length() > 4) {
            System.out.println("ERROR: currency ID " + currID + " is too long");
        } else {
            cryptoCurrencies.addItem(new Cryptocurrency(name, currID, amount));
        }
    }

    public void newInvestor(String name, String userID, int cash) {
        assert (cash >= 0);//can only be initialized with a zero/positive amount of cash
        investors.addItem(new Investor(name, userID, cash));
    }

    public void mine(String investorID, String currID, int amount) {
        assert (amount >= 0);//can only mine a zero/positive amount of currency
        Investor receiver = ((Investor) investors.getItem(investorID));
        Cryptocurrency currency = ((Cryptocurrency) cryptoCurrencies.getItem(currID));
        if (receiver == null) {
            System.out.println("ERROR: Unknown investor " + investorID);
        } else if (currency == null) {
            System.out.println("ERROR: Unknown currency " + currID);
        } else {
            currency.mine(amount, receiver);
        }
    }

    public void trade(String investorID1, String investorID2, String currID1, int curr1Amount, String currID2, int curr2Amount) {
        assert (curr1Amount >= 0 && curr2Amount >= 0);//can only trade zero/positive amounts
        Investor investor1 = ((Investor) investors.getItem(investorID1));
        Investor investor2 = ((Investor) investors.getItem(investorID2));
        Cryptocurrency currency1 = ((Cryptocurrency) cryptoCurrencies.getItem(currID1));
        Cryptocurrency currency2 = ((Cryptocurrency) cryptoCurrencies.getItem(currID2));
        if (investor1 == null) {
            System.out.println("ERROR: Unknown investor " + investorID1);
        } else if (investor2 == null) {
            System.out.println("ERROR: Unknown investor " + investorID2);
        } else if (currency1 == null) {
            System.out.println("ERROR: Unknown currency " + currID1);
        } else if (currency2 == null) {
            System.out.println("ERROR: Unknown currency " + currID2);
        } else if (!investor1.hasSufficientCurr(currID1, curr1Amount)) {
            System.out.println("ERROR: " + investorID1 + " has insufficient " + currID1 + " for trade");
        } else if (!investor2.hasSufficientCurr(currID2, curr2Amount)) {
            System.out.println("ERROR: " + investorID2 + " has insufficient " + currID2 + " for trade");
        } else {
            investor1.transfer(currID1, curr1Amount, investor2);
            currency1.addTrade(curr1Amount, investor2, investor1);
            investor2.transfer(currID2, curr2Amount, investor1);
            currency2.addTrade(curr2Amount, investor1, investor2);
        }
    }

    public void report(String investorID) {
        Investor query = ((Investor) investors.getItem(investorID));
        if (query == null) {
            System.out.println("ERROR: Unknown investor " + investorID);
        } else {
            query.report();
        }
    }

    public void cryport(String currID) {
        Cryptocurrency query = ((Cryptocurrency) cryptoCurrencies.getItem(currID));
        if (query == null) {
            System.out.println("ERROR: Unknown currency " + currID);
        } else {
            query.report();
        }
    }

}
