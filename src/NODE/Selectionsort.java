package NODE;
public class Selectionsort{
  
    public void sort(Node head){
      if (head == null || head.next == null)
        return;
      for(Node n=head;n.next!=null;n=n.next){
        Node minNode = n;
        for(Node p=n.next;p!=null;p=p.next){
          if(((Comparable) p.element).compareTo(minNode.element)<0)
            minNode = p;
          
          if (n != minNode){
            Object tmp = n.element;
            n.element = minNode.element;
            minNode.element = tmp;
          }
        }
      }
    }
    public void print(Node h){
      for(Node n=h;n!=null;n=n.next){
        System.out.println(n.element);
      }
    }
  }