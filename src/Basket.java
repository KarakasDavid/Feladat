public class Basket {
    private String items;   //A kosár tartalma pl.: A A B C
    int summ;               //A kosárban szereplő tárgyak összértéke

    public Basket(String items){
        this.items=items;
    }
    public String getItems() {
        return items;
    }
    public void setSumm(int summ) {
        this.summ = summ;
    }

    //A megadott kosár bemenet alapján kiszámolja annak az összegét
    public int SumValue(Shop shop){

        String[] itemList =items.split(" ");
        for(int i=0; i< itemList.length; i++){
            for (int j=0; j< shop.getItems().size() ;j++){
                if(itemList[i].equals(shop.getItems().get(j).getName())){
                    //System.out.println(itemList[i]+" - "+shop.getItems().get(j).toString());
                    summ += shop.getItems().get(j).getValue();
                }
            }
        }
        return summ;
    }

    /*
    * A boltban található ajánlatok és szabályok alapján kiszámolja a módosított végösszeget
    * Ide tartozik ha valami miatt olcsóbb vagy drágább lenne
    * */
    public int calculateDiscountedValue(Shop shop){
        int originalPrice = summ;
        int discountPrice=originalPrice;
        for(int i =0; i < shop.getFlexibleoffers().size(); i++){
            discountPrice = shop.getFlexibleoffers().get(i).calculateDiscount(this,shop);
            this.setSumm(discountPrice);
        }
        for(int i =0; i < shop.getEndoffers().size(); i++){
            discountPrice = shop.getEndoffers().get(i).calculateDiscount(this,shop);
            this.setSumm(discountPrice);
        }
        return summ;
    }
}
