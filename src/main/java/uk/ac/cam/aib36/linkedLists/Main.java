package uk.ac.cam.aib36.linkedLists;

public class Main {
    public static void main(String[] args) {

        OOPLinkedList firstList = new OOPLinkedList();

        firstList.addToHead(1);
        firstList.addToHead(2);
        firstList.addToHead(3);

        for (int i = 1; i <= firstList.getLength(); i++) {
            System.out.println(firstList.getNthElement(i));
        }

        OOPSortedLinkedList myList = new OOPSortedLinkedList();

        myList.addToHead(1);
        myList.addToHead(2);
        myList.addToHead(3);

        for (int i = 1; i <= myList.getLength(); i++) {
            System.out.println(myList.getNthElement(i));
        }
    }
}
