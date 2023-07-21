public class EAndD extends Offer {
    @Override
    public int modifier(Basket basket, Shop shop){
        // ------- Megszámolta az E és D előfordulását --------
        int eCount = countItem(basket,"E");
        int dCount = countItem(basket,"D");

        if(eCount > 0 && dCount > 0)
            return 1;
        else
            return 0;
    }

    @Override
    public int calculateDiscount(Basket basket, Shop shop) {
        return (int)(basket.summ + basket.summ * modifier(basket,shop) *0.3);
    }
}
