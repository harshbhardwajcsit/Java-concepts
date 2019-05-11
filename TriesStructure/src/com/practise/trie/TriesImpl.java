package com.practise.trie;

public class TriesImpl implements Tries {


    @Override
    public void insert(RootNode rootNode, Character character, Node nextLink) {
        if (rootNode.parentString.isEmpty()) {
            rootNode.parentString = "";
        }
        com.practise.trie.Node node = new com.practise.trie.Node();
        node.createNewNode('A', nextLink);
        rootNode.addNode(node);
    }

    @Override
    public void traverse() {

    }

    @Override
    public boolean findWordInBag(String string) {
        return false;
    }

    @Override
    public RootNode getTries() {
        return null;
    }


    public static void main(String[] args) {
        Tries tries = new TriesImpl();
        RootNode rootNode = new RootNode();
        tries.insert(rootNode, 'A', null);
        System.out.println(rootNode);
    }


}
