package org.factory;

public abstract class AbstractFlower {
    private final FlowerType flowerType;

    public AbstractFlower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }
}
