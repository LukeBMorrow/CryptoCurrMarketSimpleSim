import java.util.Scanner;

public class Controller {
    public Controller() {
        Scanner sysScan = new Scanner(System.in);
        try {
            System.out.println("Please enter instruction file: ");
            Scanner fileScan = new Scanner(sysScan.nextLine());
            Market main = new Market();
            processLine(main,fileScan);
        }catch(Exception e){
            System.out.println("ERROR: file not found: "+e);
        }

    }

    private void processLine(Market main, Scanner fileScan) {
        if (fileScan.hasNextLine()) {
            String[] line = (fileScan.nextLine()).split(" ");
            if (!line[0].equalsIgnoreCase("end")) {
                switch (line[0]) {
                    case "NEW":
                        main.newInvestor(line[1], line[2], Integer.parseInt(line[3]));
                        break;
                    case "CRYPTO":
                        main.newCryptocurrency(line[1], line[2], Integer.parseInt(line[3]));
                        break;
                    case "MINE":
                        main.mine(line[1], line[2], Integer.parseInt(line[3]));
                        break;
                    case "TRADE":
                        main.trade(line[1], line[2], line[3], Integer.parseInt(line[4]), line[5], Integer.parseInt(line[6]));
                        break;
                    case "REPORT":
                        main.report(line[1]);
                        break;
                    case "CRYPORT":
                        main.cryport(line[1]);
                        break;
                    case "#":
                        break;
                    default:
                        System.out.println("ERROR: unknown command: " + line[0]);
                        break;

                }
                processLine(main,fileScan);
            }
        }

    }
}
