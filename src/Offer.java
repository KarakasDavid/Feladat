public class Offer implements Discount {
    //Kiszámolja az módosítót amivel az ajánlat módosítja a fizetendő összeget
    int modifier(Basket basket, Shop shop){
        return 0;
    }

    // Kiszámolja a végösszeget
    @Override
    public int calculateDiscount(Basket basket, Shop shop) {
        return basket.summ + modifier(basket,shop);
    }

    // Megszámolja, hogy egy termék hányszor szerepel az adott kosárban
    public int countItem(Basket basket,String name){
        String[] itemList =basket.getItems().split(" ");
        int count = 0;
        for(int i=0; i<itemList.length; i++){
            if(itemList[i].equals(name))
                count++;
        }
        return  count;
    }
}
