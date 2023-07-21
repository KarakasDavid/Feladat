public abstract class Offer implements Discount {
    //Kiszámolja az módosítót amivel az ajánlat módosítja a fizetendő összeget
    abstract int modifier(Basket basket, Shop shop);

    // Kiszámolja a végösszeget
    @Override
    public abstract int calculateDiscount(Basket basket, Shop shop);

}
