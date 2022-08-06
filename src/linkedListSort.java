import java.util.Scanner;

class LinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void sortList()
    {
        //Write code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        Node temp = head;

        while(temp!=null){
            if(temp.data==0){count0++;}
            if(temp.data==1){count1++;}
            if(temp.data==2){count2++;}
            temp = temp.next;
        }

        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);

        temp = head;

        for(int i=0; i<count0; i++){
            temp.data = 0;
            temp = temp.next;
        }
        for(int i=0; i<count1; i++){
            temp.data = 1;
            temp = temp.next;
        }
        for(int i=0; i<count2; i++){
            temp.data = 2;
            temp = temp.next;
        }

    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;//new_node's next node is the current head ( the previous element in the linked list)
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class linkedListSort
{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        LinkedList li = new LinkedList();

        for(int i = 0; i < n; i++)
        {
            int a;
            a = s.nextInt();
            li.push(a);
        }

        li.sortList();
        li.printList();
    }
}