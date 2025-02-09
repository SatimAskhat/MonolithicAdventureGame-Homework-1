package items;

import interfaces.*;

public class MagicScroll implements IItem {
    @Override
    public String getName() {
        return "Magic Scroll";
    }

    @Override
    public EntityType getType() {
        return EntityType.ITEM;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.EXPERIENCE_SCROLL;
    }

    @Override
    public void use(ICombatant target) {
        target.setExperience(target.getExperience() + 15);
    }
} 