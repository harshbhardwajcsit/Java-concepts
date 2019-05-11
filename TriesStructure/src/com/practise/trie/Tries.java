package com.practise.trie;

public interface Tries {
    void insert(RootNode rootNode, Character character, Node nextLink);

    void traverse();

    boolean findWordInBag(String string);

    RootNode getTries();
}
