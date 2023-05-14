package org.factory;

public class JapaneseGardenCreator extends AbstractGardenCreator {
    @Override
    public AbstractTree createTree() {
        return new J1Tree(TreeType.FromJapan);
    }

    @Override
    public AbstractFlower createFlower() {
        return new G1Flower(FlowerType.FromJapan);
    }
}
