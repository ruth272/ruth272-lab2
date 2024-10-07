import java.util.Random;

public class ThingList {
    private class Node {            //stores references
        public Thing data;
        public Node next;
        
        public Node(Thing data) {
            this.data = data;           //stores Thing's obbject
            this.next = null;           //stores next Node
        }
    }

    private Node head;          //first node
    public ThingList() {            //initializes list as empty
        this.head = null;   
    }

    public void addThing(Thing thing) {     //adds a new object to the list
        Node New = new Node(thing);

        if(head == null) {          //adds new node to the begining of the list if it is empty
            head = New;
            head.next = null;
        }

        New.next = head;            // moves the head of the list as the 2nd node
        head = New;                 // adds new node to the begining of the list
    }

    public void printAll() {            //prints out each thing
        for(Node T = head; T != null; T = T.next ) {
            System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
        }
    }

    public void moveAll(Random rand) {
        Node thing = head;
        while(thing.next != null) {         //iterates over list
            head.data.maybeTurn(rand);              //decides if it wants to turn
            head.data.step();                       //moves foward a direction
        }
    }
}