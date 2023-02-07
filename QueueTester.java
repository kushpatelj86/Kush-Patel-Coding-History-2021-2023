public class QueueTester 
{



    public static void main(String[] args) 
    {
        //queue follow first in first  out
        Queue<Integer> queue = new Queue<Integer>();

        System.out.println("Empty: " + queue.isEmpty());
        queue.offer(3);
        queue.offer(4);
        queue.offer(6);
        System.out.println("Size: " + queue.size());


    }















}