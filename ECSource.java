class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    T uniq = head.val;

    while (head != null) {
      if (head.val != uniq) {
        return false;
      }
      head = head.next;
    }

    return true;
  }

  public static void main(String[] args) {

    // ---------------------------------------------------------------------
    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(2);
    Node<Integer> x = new Node<>(2);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

    // 2 -> 2 -> 2 -> 2 -> 2

    System.out.println(ECSource.isUnivalueList(u)); // true

    // ---------------------------------------------------------------------
    Node<Integer> u4 = new Node<>(2);
    Node<Integer> v4 = new Node<>(2);
    Node<Integer> w4 = new Node<>(3);
    Node<Integer> x4 = new Node<>(3);
    Node<Integer> y4 = new Node<>(2);

    u4.next = v4;
    v4.next = w4;
    w4.next = x4;
    x4.next = y4;

    // 2 -> 2 -> 3 -> 3 -> 2

    System.out.println(ECSource.isUnivalueList(u4)); // false

    Node<String> z = new Node<>("z");
    // z

    // Printing solution
    System.out.println((ECSource.isUnivalueList(z))); // true
  }
}
