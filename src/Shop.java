import java.util.ArrayList;

public class Shop {
    private ArrayList<ShopItem> items = new ArrayList<ShopItem>();

    public void setItems(ArrayList<ShopItem> items) {
        this.items = items;
    }

    public ArrayList<ShopItem> getItems() {
        return items;
    }

    //Feltölti a boltot alap termékekkel, ezek után ha lenne még egy F termék, azt add-al hozzá lehet adni
    public void InitializeShop(){
        ShopItem item1 = new ShopItem("A",55);
        ShopItem item2 = new ShopItem("B",20);
        ShopItem item3 = new ShopItem("C",60);
        ShopItem item4 = new ShopItem("D",10);
        ShopItem item5 = new ShopItem("E",45);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

    }


}
