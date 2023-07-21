public class PayTowDGetOneFree extends Offer{
    private int dPrice;

    @Override
    public int modifier(Basket basket, Shop shop) {
        for (int i = 0; i < shop.getItems().size(); i++) {
            if (shop.getItems().get(i).getName().equals("D"))
                dPrice = shop.getItems().get(i).getValue();
        }
        int dCount = countItem(basket,"D");

        if(dCount <= 2 ){                           // Nincs leárazás
            return 0;
        }
        else if( dCount % 3 == 0){                  // Minden második D-re jut egy ingyenes
            return -(dPrice * (dCount / 3));
        }
        else{
            return -(((dCount / 2) -1) *dPrice);
        }
    }

    @Override
    public int calculateDiscount(Basket basket, Shop shop) {
        return basket.summ + modifier(basket,shop);
    }

}
