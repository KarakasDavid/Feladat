public class Basket {
    private String items;

    public Basket(String items){
        this.items=items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return items;
    }

    //A megadott kosár bemenet alapján kiszámolja annak az összegét
    public int SumValue(Shop shop){
        int sum=0;
        String[] itemList =items.split(" ");
        for(int i=0; i< itemList.length; i++){
            for (int j=0; j< shop.getItems().size() ;j++){
                if(itemList[i].equals(shop.getItems().get(j).getName())){
                    //System.out.println(itemList[i]+" - "+shop.getItems().get(j).toString());
                    sum += shop.getItems().get(j).getValue();
                }
            }
        }
        return sum;
    }
}
