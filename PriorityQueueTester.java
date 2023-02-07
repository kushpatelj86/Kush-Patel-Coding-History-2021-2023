public class PriorityQueueTester 
{



    public static void main(String[] args) 
    {
        PriorityQueue<Integer> priortyqueue = new PriorityQueue<Integer>();
        priortyqueue.add(3);
        priortyqueue.add(4);
        priortyqueue.add(6);
        System.out.println("Size: " + priortyqueue.size());
        System.out.println("Empty: " + priortyqueue.isEmpty());
        System.out.println("Contains: " + priortyqueue.contains(2));
        System.out.println("isMinHeap: " + priortyqueue.isMinHeap(2));

        


    }















}