public class TwoAOneCHalf extends Offer{
    private int cHalfPrice;

    @Override
    public int modifier(Basket basket, Shop shop){
        for(int i=0; i<shop.getItems().size(); i++){
            if(shop.getItems().get(i).getName().equals("C"))
                cHalfPrice=shop.getItems().get(i).getValue() / 2;
        }


        // ------- Megszámolta az A és C előfordulását --------
        int aCount = basket.countItem("A");
        int cCount = basket.countItem("C");
        int szam = aCount / 2;

        // ------- Amennyiben páros A van -------
        if(aCount % 2 == 0) {
            if(cCount == 0)
                return 0;
            if(szam == cCount || szam < cCount)
                return (szam*cHalfPrice)*(-1);
            else
                return (cCount*cHalfPrice)*(-1);
        }

        // ------- Amennyiben páratlan A van -------
        else{
            if(szam == 0){
                return 0;
            }
            if(szam == cCount || szam < cCount)
                return (szam*cHalfPrice)*(-1);
            else
                return (cCount*cHalfPrice)*(-1);
        }
    }

    @Override
    public int calculateDiscount(Basket basket, Shop shop) {
        return basket.summ + modifier(basket,shop);
    }
}
