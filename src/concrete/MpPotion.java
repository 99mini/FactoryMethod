package concrete;

import framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("MP 포션 사용");
    }
}
