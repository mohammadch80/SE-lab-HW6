package org.factory;

public abstract class AbstractTree {
    public TreeType treeType;

    public AbstractTree(TreeType treeType) {
        this.treeType = treeType;
    }

    public TreeType getTreeType() {
        return treeType;
    }
}
