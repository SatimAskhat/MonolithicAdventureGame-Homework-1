package interfaces;

public interface IEntity {
    String getName();
    EntityType getType();
}

enum EntityType {
    PLAYER,
    ENEMY,
    ITEM
} 