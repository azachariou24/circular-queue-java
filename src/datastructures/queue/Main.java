package datastructures.queue;

public class Main {
	
    public static void main(String[] args) {
    	
        /* Create a circular queue with a maximum size of 5 */
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        /* Display the initial state of the queue */
        System.out.println("Initial Queue State:");
        queue.display();

        /* Enqueue elements into the queue */
        System.out.println("Enqueuing elements...");
        
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50); // Queue is now full
        
        System.out.println("Queue after enqueuing elements:");
        System.out.println(queue.toString());

        /* Attempt to enqueue an element into a full queue */
        System.out.println("Trying to enqueue an element into a full queue...");
        
        if (!queue.enQueue(60)) {
        	
            System.out.println("Failed to enqueue 60: The Queue is full!");
            
        }
        
        /* Dequeue elements from the queue */
        System.out.println("Dequeuing elements...");
        System.out.println("Removed: " + queue.deQueue());	// Remove first element
        System.out.println("Queue after dequeuing an element:");
        System.out.println(queue.toString());

        /* Continue dequeuing to show queue state */
        System.out.println("Removed: " + queue.deQueue());
        System.out.println("Queue after dequeuing another element:");
        queue.display();

        /* Enqueue another element after some dequeues */
        System.out.println("Enqueuing 60...");
        
        queue.enQueue(60);
        
        System.out.println("Queue after enqueuing 60:");
        System.out.println(queue.toString());

        /* Check the top element without removing it */
        System.out.println("The last element in the queue is: " + queue.top());

        /* Removing all elements except for a specific number (e.g., 30) */
        System.out.println("Removing all elements except for 30...");
        
        QueueAlgorithms.removeItem(queue, 30);
        
        System.out.println("Queue after removing items except 30:");
        queue.display();

        /* Solve the Josephus problem with 7 soldiers, eliminating every 3rd soldier */
        System.out.println("Solving the Josephus problem for 7 soldiers with step count of 3...");
        
        int lastSoldier = QueueAlgorithms.josephus(7, 3);
        
        System.out.println("The last remaining soldier is: " + lastSoldier);

        /* Continue removing elements until the queue is empty */
        System.out.println("Removing all elements from the queue...");
        
        while (!queue.isEmpty()) {
        	
            System.out.println("Removed: " + queue.deQueue());
            System.out.println("Current Queue State:");
            System.out.println(queue.toString());
            
        }

        /* Final state of the queue */
        System.out.println("Final Queue State:");
        queue.display();
        
    }
    
}
