
public class DoublyLinkedListedTester
{
    public static void main(String[] args) 
    {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer> ();

        System.out.println("Size: " + list.size());
        System.out.println("Empty: " + list.isEmpty());
        list.add(3);
        list.addFirst(2);
        list.addLast(4);
        System.out.println("Peek First: " + list.peekFirst());
        System.out.println("Peek Last: " + list.peekLast());
        System.out.println(list);
        list.add(3);
        list.removeAt(0);
        list.remove(2);
        System.out.println("Index: " +         list.indexOf(4));
        System.out.println(("Contains: " +         list.contains(4) ));

    }
}

