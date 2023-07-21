public class EAndD extends Offer {
    private double percentage = 0.3;

    @Override
    public int modifier(Basket basket, Shop shop){
        // ------- Megszámolta az E és D előfordulását --------
        int eCount = basket.countItem("E");
        int dCount = basket.countItem("D");

        if(eCount > 0 && dCount > 0)
            return 1;
        else
            return 0;
    }

    @Override
    public int calculateDiscount(Basket basket, Shop shop) {
        return (int)(basket.summ + basket.summ * modifier(basket,shop) * percentage);
    }
}
