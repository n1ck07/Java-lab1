package Stock;

import java.util.Scanner;
import Stock.classes.TitleNameValidate;
import Stock.classes.Firm;
import Stock.classes.costforone;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TitleNameValidate.titlevalidate("Andrey");
        //System.out.print(TitleNameValidate.nameslist.get(0));
        Firm.firmlist.add("Guchi");
        Firm.firmlist.add("Prada");
        Firm.firmlist.add("Adidas");
        Firm.firmlist.add("Mersedes");
        System.out.println("Chouse Firme");
        System.out.print(Firm.firmlist);
        int firmchouse = input.nextInt();

        try{
            System.out.print("Your chose is: " + Firm.firmlist.get(firmchouse-1));

        }

        catch(IndexOutOfBoundsException e){
            System.out.print("There is no attribute with number like " + firmchouse);
        }



    }
}
