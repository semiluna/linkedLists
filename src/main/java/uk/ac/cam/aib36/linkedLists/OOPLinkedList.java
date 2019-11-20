package uk.ac.cam.aib36.linkedLists;

public class OOPLinkedList {

    private OOPLinkedListElement head;
    private int length;

    OOPLinkedList() {
        this.head = null;
        this.length = 0;
    }

    OOPLinkedList(int value) {
        OOPLinkedListElement element = new OOPLinkedListElement(value);
        this.head = element;
        this.length = 1;
    }

    void removeFromHead() {
        OOPLinkedListElement next = this.head.getRef();
        this.head = next;
        this.length--;
    }

    void addToHead(int value) {
        OOPLinkedListElement newHead = new OOPLinkedListElement(value, this.head);
        this.head = newHead;
        this.length++;

    }

    int getHeadValue() {
        return this.head.getValue();
    }

    OOPLinkedListElement getHeadRef() {
        return this.head;
    }

    private int getNthElement(int n, OOPLinkedListElement elementRef) {
        if (n == 1) {
            return elementRef.getValue();
        } else {
            return getNthElement(n-1, elementRef.getRef());
        }
    }

    int getNthElement(int n) {
        return getNthElement(n, this.head);
    }

    boolean isEmpty() {
        if (this.head == null)
            return true;
        return false;
    }

    int getLength() {
        return this.length;
    }

}
