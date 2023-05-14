package org.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {
    @Test
    public void iranianCreatorTest() {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        AbstractFlower iranianFlower = iranianGardenCreator.createFlower();
        AbstractTree iranianTree = iranianGardenCreator.createTree();

        assertEquals(iranianFlower.getFlowerType(), FlowerType.FromIran);
        assertEquals(iranianTree.getTreeType(), TreeType.FromIran);
    }

    @Test
    public void japaneseCreatorTest() {
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
        AbstractFlower iranianFlower = japaneseGardenCreator.createFlower();
        AbstractTree iranianTree = japaneseGardenCreator.createTree();

        assertEquals(iranianFlower.getFlowerType(), FlowerType.FromJapan);
        assertEquals(iranianTree.getTreeType(), TreeType.FromJapan);
    }
}
