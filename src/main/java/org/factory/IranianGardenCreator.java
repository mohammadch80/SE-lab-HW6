package org.factory;

public class IranianGardenCreator extends AbstractGardenCreator {
    @Override
    public AbstractTree createTree() {
        return new ChenarTree(TreeType.FromIran);
    }

    @Override
    public AbstractFlower createFlower() {
        return new KhatmiFlower(FlowerType.FromIran);
    }
}
