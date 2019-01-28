public class Market {
    private HashTable investors;
    private HashTable cryptoCurrencies;

    public Market() {
        investors = new HashTable();
        cryptoCurrencies = new HashTable();
        cryptoCurrencies.addItem(new Cryptocurrency("cash", "CAD",0));
    }

    public void newCryptocurrency(String name, String currID, int amount) {
        if(currID.length()>4){
            System.out.println("investor ID "+currID+" too long");
        }else {
            cryptoCurrencies.addItem(new Cryptocurrency(name, currID, amount));
        }
    }

    public void newInvestor(String name, String userID, int cash) {
        if(userID.length()>4){
            System.out.println("investor ID "+userID+" too long");
        }else {
            investors.addItem(new Investor(name, userID, cash));
        }
    }

    public void mine(String investorID, String currID, int amount) {
        Investor receiver = ((Investor) investors.getItem(investorID));
        if (receiver == null) {
            System.out.println("Unknown investor " + investorID);
        } else {
            ((Cryptocurrency) cryptoCurrencies.getItem(currID)).mine(amount, receiver);
        }
    }

    public void trade(String investorID1, String investorID2, String cryptoCurr1, int curr1Amount, String cryptoCurr2, int curr2Amount) {
        Investor investor1 = ((Investor) investors.getItem(investorID1));
        Investor investor2 = ((Investor) investors.getItem(investorID2));
        Cryptocurrency currency1 = ((Cryptocurrency) cryptoCurrencies.getItem(cryptoCurr1));
        Cryptocurrency currency2 = ((Cryptocurrency) cryptoCurrencies.getItem(cryptoCurr2));
        if (investor1 == null) {
            System.out.println("Unknown investor " + investorID1);
        } else if (investor2 == null) {
            System.out.println("Unknown investor " + investorID2);
        } else if (currency1 == null) {
            System.out.println("Unknown currency " + cryptoCurr1);
        } else if (currency2 == null) {
            System.out.println("Unknown currency " + cryptoCurr2);
        } else {
            if ((investor1).hasSufficientCurr(cryptoCurr1, curr1Amount) && investor2.hasSufficientCurr(cryptoCurr2, curr2Amount)) {
                investor1.transfer(cryptoCurr1, curr1Amount, investor2);
                currency1.addTrade(curr1Amount, investor2, investor1);
                investor2.transfer(cryptoCurr2, curr2Amount, investor1);
                currency2.addTrade(curr2Amount, investor1, investor2);
            }
        }

    }

    public void report(String investorID) {
        Investor query = ((Investor) investors.getItem(investorID));
        if (query == null) {
            System.out.println("Unknown investor " + investorID);
        } else {
            query.report();
        }
    }

    public void cryport(String currID) {
        Cryptocurrency query = ((Cryptocurrency) cryptoCurrencies.getItem(currID));
        if (query == null) {
            System.out.println("Unknown currency " + currID);
        } else {
            ((Cryptocurrency) cryptoCurrencies.getItem(currID)).report();
        }
    }

}
