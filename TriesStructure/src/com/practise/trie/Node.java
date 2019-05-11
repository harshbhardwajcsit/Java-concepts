package com.practise.trie;

public class Node {
    private Character character;
    private Node nextLink;

    public Node() { }

    public void createNewNode(Character character,Node nextLink){
     this.character=character;
     this.nextLink=nextLink;

    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Node getNextLink() {
        return nextLink;
    }

    public void setNextLink(Node nextLink) {
        this.nextLink = nextLink;
    }
}
