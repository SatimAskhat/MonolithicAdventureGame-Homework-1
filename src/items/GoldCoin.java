package items;

import interfaces.*;

public class GoldCoin implements IItem {
    @Override
    public String getName() {
        return "Gold Coin";
    }

    @Override
    public EntityType getType() {
        return EntityType.ITEM;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.GOLD;
    }

    @Override
    public void use(ICombatant target) {
        target.setExperience(target.getExperience() + 5);
    }
} 