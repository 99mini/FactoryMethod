package framework;

public abstract class ItemCreater {

    public Item create(){
        Item item;

        requestItemsInfo();
        item = createItem();
        createItemLog();
        return item;
    }

    //아이템을 생선하기 전에 DB에서 아이템 정보를 요청
    abstract protected void requestItemsInfo();

    //아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 DB에 아이템 생성 로그
    abstract protected void createItemLog();

    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();
}
