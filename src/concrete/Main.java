package concrete;

import framework.Item;
import framework.ItemCreater;

public class Main {
    public static void main(String[] args) {
        ItemCreater creater;
        Item item;

        creater = new HpCreater();
        item = creater.create();
        item.use();

        creater = new MpCreater();
        item = creater.create();
        item.use();
    }
}
