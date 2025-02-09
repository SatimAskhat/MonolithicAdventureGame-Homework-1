package items;

import interfaces.*;

public class HealthElixir implements IItem {
    @Override
    public String getName() {
        return "Health Elixir";
    }

    @Override
    public EntityType getType() {
        return EntityType.ITEM;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HEALTH_POTION;
    }

    @Override
    public void use(ICombatant target) {
        target.setHealth(target.getHealth() + 20);
    }
} 