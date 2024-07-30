import org.w3c.dom.Node;

import java.util.*;
public class product {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int productId;
        String productName;
        int quantity;
        int price;
        Node next;


        public Node(int productId, String productName, int quantity, int price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }
    }

        public void add(int productId, String productName, int quantity,int price){
            Node newNode=new Node(productId,productName,quantity,price);
            if(length==0){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            length++;
        }

        public void printlist() {
            Node temp = head;
            while (temp != null) {
                System.out.println("ProductId:" + temp.productId);
                System.out.println("ProductName:" + temp.productName);
                System.out.println("Quantity:" + temp.quantity);
                System.out.println("Price:" + temp.price);
                temp = temp.next;
            }
        }

            public boolean update(int index, int productId, String productName, int quantity,int price){
                Node temp=get(index);
                if(temp!=null){
                    temp.productId=productId;
                    temp.productName=productName;
                    temp.quantity=quantity;
                    temp.price=price;
                    return true;
                }
                return false;
            }

            public Node get(int index){
            Node temp=head;
            while(temp!=null){
                if(temp.productId==index){
                    return temp;
                }else{
                    temp=temp.next;
                }
            }
                return null;
        }

        public Node delete(int index){
            Node prev=get(index-1);
            Node temp=prev.next;
            prev.next=temp.next;
            temp.next=null;
            length--;
            return temp;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        product obj=new product();
        obj.add(1,"processor",3,30);
        obj.add(2,"RAM",3,30);
        obj.add(3,"ESP32",3,30);
        obj.add(4,"Ardurino",3,30);
        obj.add(5,"CMOS",3,30);
        obj.printlist();
        obj.update(4,4,"Digital logic",6,80);
        obj.delete(5);
        obj.printlist();
    }

}
