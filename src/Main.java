/*
    A1
    Luke Morrow, 7787696
    Comp 2150, Michael Domaratzki

    This assignment creates a mock crypto-currency marketplace that allows for
    mining, trading, and creating crypto-currencies.
    The behaviour of the program is decided based on commands given via .txt file, the
    name of which will be requested upon the the execution of the run() method in the Controller class.
 */
public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        c.run();
    }
}
