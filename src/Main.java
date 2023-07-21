
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner shopperScanner = new Scanner(System.in);
        Shop shop1 = new Shop();
        shop1.InitializeShop();
        ShopItem f = new ShopItem("F",10);    //Példa új termék hozzáadására
        shop1.getItems().add(f);


        System.out.println("A következő tárgyak vásárolhatóak:\n");
        for(int i=0; i< shop1.getItems().size() ;i++){
            System.out.println(shop1.getItems().get(i).toString());
        }

        System.out.println("Adja meg a megvásárolni kívánt termékek listáját a következő formában: A A B C E");
        String b = shopperScanner.nextLine();
        System.out.println("Ez volt a bemenet: "+b);
        Basket basket = new Basket(b);

        int originalPrice = basket.SumValue(shop1);
        int discountPrice = basket.calculateDiscountedValue(shop1);

        System.out.println("A kosár összege módosítók nélkül: "+ originalPrice);
        System.out.println("A kosár összege módosítók után: "+ discountPrice);

    }
}
