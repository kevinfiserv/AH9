class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      // todo
      // a -> b -> c -> d -> e -> f
      
      // got to do
      // a <- b <- c <- d <- e <- f
      // equal to
      // f -> e -> d -> c -> b -> a

      Node<T> previousNode = null;
      Node<T> currentNode = head;
      Node<T> nextNode = null;

      while(currentNode!=null){ // a=currentNode in | b=currentNode for 2nd
          nextNode = currentNode.next; //b | c

          //Arrow flip
          currentNode.next = previousNode; //no node will be after a (flipping arrow) | next node for b is now a
          previousNode = currentNode; //a is now previous node for next iteration | b is now previous node for next iteration

          currentNode = nextNode; //now on b for next iteration | now on c for next iteration

      }

      return previousNode;

    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        // reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }

        // --------------------------------

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // a -> b -> c -> d -> e -> f

        //got to do 
        // a <- b <- c <- d <- e <- f
        // equal to 
        // f -> e -> d -> c -> b -> a

        // reverseList(a); // f -> e -> d -> c -> b -> a
        Node<String> head2 = Source.reverseList(a);
        System.out.println("----------------");
        while (head2 != null) {
          System.out.println(head2.val);
          head2 = head2.next;
        }
    }
  }