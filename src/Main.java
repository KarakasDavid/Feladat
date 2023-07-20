
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Shop shop1 = new Shop();
        shop1.InitializeShop();

        System.out.println("\nÉs most listázás:\n");
        for(int i=0; i< shop1.getItems().size() ;i++){
            System.out.println(shop1.getItems().get(i).toString());
        }

        Scanner shopperScanner = new Scanner(System.in);
        System.out.println("Adja meg a megvásárolni kívánt termékek listáját a következő formában: A A B C E");
        String b = shopperScanner.nextLine();
        System.out.println("Ez volt a bemenet: "+b);
        Basket basket = new Basket(b);
        System.out.println("A kosár összege: "+ basket.SumValue(shop1));
        
    }
}
