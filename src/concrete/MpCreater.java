package concrete;

import framework.Item;
import framework.ItemCreater;

import java.util.Date;

public class MpCreater extends ItemCreater {

    @Override
    protected void requestItemsInfo() {
        System.out.println("DB에서 마력 회복 물약 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약을 새로 생성하였습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
