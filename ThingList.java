import java.util.Random;

public class ThingList {
    private class Node {
        public Thing data;
        public Node next;
        public Node(Thing data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public ThingList() {
        this.head = null;
    }
    public void addThing(Thing thing) {
        Node New = new Node(thing);

        if(head == null) {
            head = New;
            head.next = null;
        }

        New.next = head;
        head = New;
    }

    public void printAll() {
        for(Node T = head; T != null; T = T.next ) {
            System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
        }
    }

    public void moveAll(Random rand) {
        for(Node T = head; T != null; T = T.next) {
            head.data.maybeTurn(rand);
            head.data.step();
        }
    }
}