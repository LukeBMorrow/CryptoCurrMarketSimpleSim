import java.util.Scanner;

public class Controller {
    Scanner fileScan;
    public Controller(){
        Scanner sysScan= new Scanner(System.in);
        System.out.println("Please enter instruction file: ");
        fileScan= new Scanner(sysScan.nextLine());
    }

    private void fileProcessor(){

    }
}
