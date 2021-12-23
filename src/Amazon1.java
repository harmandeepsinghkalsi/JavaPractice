package practice;

class SinglyLinkedListNode{
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data){
        this.data = data;
    }
}

public class Amazon1 {

    public static void main(String[] args) {
        SinglyLinkedListNode list = new SinglyLinkedListNode(1);
        list.next = new SinglyLinkedListNode(2);
        list.next.next = new SinglyLinkedListNode(3);
        list.next.next.next= new SinglyLinkedListNode(4);
        list.next.next.next.next = new SinglyLinkedListNode(5);
        list.next.next.next.next.next = new SinglyLinkedListNode(6);


        SinglyLinkedListNode sp = list;
        SinglyLinkedListNode fp = list.next;
        int count = 1;
        while (fp.next != null && fp.next.next != null){
            sp = sp.next;
            count++;
            fp = fp.next.next;
        }

        printList(list);
        // reverse first half

        SinglyLinkedListNode spNext = sp.next;
        sp.next = null;

        // reversing the first half of list
        SinglyLinkedListNode predecessor = null;
        SinglyLinkedListNode current = list;
        SinglyLinkedListNode successor = null;

        int counter = 1;
        while(counter != count+1){

            successor = current.next;
            current.next = predecessor;
            predecessor = current;
            current = successor;
            counter++;
        }

        list = predecessor;
        current = list;

        while(current.next != null){
            current = current.next;
        }
        current.next = spNext;
        printList(list);

        int max = Integer.MIN_VALUE;
        while(spNext.next!= null){
            max = Integer.max(max,spNext.data+sp.data);
            spNext = spNext.next;
            sp = sp.next;
        }

        System.out.println("maximum is:"+max);
    }

    public static void printList(SinglyLinkedListNode head){
        while(head != null){
            System.out.print(head.data + " ->");
            head = head.next;
        }
        System.out.println();
    }
}
