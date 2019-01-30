/*
    Controller
    This class will ask for a file name and process the commands in the file
    using a switch statement for each line.
    prints an error if:
        -file is not found
        -type of currency is invalid
        -command type is invalid
    Behaviours include:
    -run            asks the user for a file name and open it, then calls processLine, passing it the
                    file scanner and the Market.
    -processLine    takes a file scanner(already open) and a Market, then calls commands on the Market
                    based on the instruction in the file.
*/

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Controller {

    public void run() {
        Scanner sysScan = new Scanner(System.in);
        try {
            System.out.println("Please enter instruction file: ");
            Scanner fileScan = new Scanner(new File(sysScan.nextLine()));
            Market main = new Market();
            processLine(main, fileScan);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found: " + e);
        }
    }

    private void processLine(Market main, Scanner fileScan) {
        if (fileScan.hasNextLine()) {
            String[] line = (fileScan.nextLine()).split(" ");
            if (!line[0].equalsIgnoreCase("end")) {
                switch (line[0]) {
                    case "NEW":
                        try {
                            main.newInvestor(line[1] + line[2], line[3], Integer.parseInt(line[4]));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid currency amount " + line[4]);
                        }
                        break;
                    case "CRYPTO":
                        try {
                            main.newCryptocurrency(line[1], line[2], Integer.parseInt(line[3]));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid currency amount " + line[3]);
                        }
                        break;
                    case "MINE":
                        try {
                            main.mine(line[1], line[2], Integer.parseInt(line[3]));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid currency amount " + line[3]);
                        }
                        break;
                    case "TRADE":
                        try {
                            main.trade(line[1], line[2], line[3], Integer.parseInt(line[4]), line[5], Integer.parseInt(line[6]));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid currency amount " + line[4] + " or " + line[6]);
                        }
                        break;
                    case "REPORT":
                        main.report(line[1]);
                        break;
                    case "CRYPORT":
                        main.cryport(line[1]);
                        break;
                    case "#":   //to make the file processor ignore comments
                        break;
                    case "":    //to make the file processor ignore white space
                        break;
                    default:
                        System.out.println("ERROR: unknown command: " + line[0]);
                        break;
                }
                processLine(main, fileScan);
            }
        }
    }
}
