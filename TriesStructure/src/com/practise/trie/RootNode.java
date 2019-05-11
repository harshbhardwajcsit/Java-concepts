package com.practise.trie;

import java.util.List;

public class RootNode {
    String parentString;
    List<Node> nodeList;

    public RootNode(){
    }

    public void addNode(Node node){
        nodeList.add(node);
    }
}
