package interfaces;

public interface IItem extends IEntity {
    void use(ICombatant target);
    ItemType getItemType();
}

enum ItemType {
    HEALTH_POTION,
    EXPERIENCE_SCROLL,
    GOLD
} 