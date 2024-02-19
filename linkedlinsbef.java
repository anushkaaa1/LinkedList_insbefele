public class linkedlinsbef {
    Node head,tail;

    public linkedlinsbef(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int val){
        Node n = new Node(val);
        if(head == null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void insbefore(int elepos,int value){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            Node prev = null;
            while(temp!=null){
                if(temp.data==elepos){
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            if(temp==null){
                System.out.println("element not found");
            }
            else{
                Node n = new Node(value);
                if(temp==head){
                    n.next = head;
                    head = n;
                }
                else{
                    n.next = temp;
                    prev.next = n;
                }
            }
        }
    }
    public static void main(String args[]){
        linkedlinsbef l = new linkedlinsbef();
        l.create(1);
        l.create(2);
        l.create(3);
        l.create(4);
        l.create(5);
        l.print(l.head);
        System.out.println();
        l.insbefore(8, 9);
        l.print(l.head);
    }
}
