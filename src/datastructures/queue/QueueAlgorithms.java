package datastructures.queue;

public class QueueAlgorithms {

	// Constants for better readability
	static final int ZERO = 0;	// Zero value
	static final int ONE = 1;	// One value
	static final int NINE = 9;	// Nine value
	static final int TEN = 10;	// Ten value
	
    /**
     * This method removes all items from the queue except for a specified number.
     * 
     * @param acircularQ Is the circular queue from which items will be removed.
     * @param aNumber Is the number to be retained in the queue.
     * 
     * @since 23/09/2024
     * @version 1.0
     * @author Anastasis Zachariou
     */
	public static void removeItem(CircularQueue<Integer> aCircularQ , int aNumber) {
		
		int i = ZERO;	// Counter
		
		// Loop until we have processed all elements in the queue
		while(i <= ( aCircularQ.size() + ONE )) {
			
			// Remove the front element of the queue
			int popNumber = (int)(aCircularQ.deQueue());
			
			// If the element is not the target number, reinsert it into the queue
			if(popNumber != aNumber)
				
				aCircularQ.enQueue(popNumber);
			
			i++;	// Increment the counter
			
		}
		
	}
	
	/**
     * This method appears to be incomplete and currently returns a constant value.
     * 
     * @param aNumber Is an integer number (currently unused).
     * @return Returns a constant value of 1.
     * 
     * @since 23/09/2024
     * @version 1.0
     * @author Anastasis Zachariou
     */
	public static int MidenikaKaiEnniaria(int aNumber) {
		
		if(aNumber == ZERO) {
			
			return (ZERO);
			
		}
		
		CircularQueue<Integer> helperQueue = new CircularQueue<Integer>((TEN * TEN));
		
		int firstNumber = NINE;
		
		if((firstNumber % aNumber) == ZERO) {
			
			return (firstNumber);
			
		}
		
		helperQueue.enQueue(firstNumber);
		
		firstNumber = (firstNumber * TEN);
		
		if((firstNumber % aNumber) == ZERO) {
			
			return (firstNumber);
			
		}
		
		helperQueue.enQueue(firstNumber);
		
		int number , helperNumber;
		
		while(helperQueue.size() != 100) {
			
			int i = ZERO;
			
			int length = helperQueue.size();
			
			number = firstNumber;
			
			while(i < (length - ONE)) {
				
				helperNumber = helperQueue.deQueue();
				
				number = (number + helperNumber);
				
				if((number % aNumber) == ZERO) {
					
					return (number);
					
				}
				
				helperQueue.enQueue(helperNumber);
				
				i++;
				
			}
			
			helperQueue.enQueue(helperQueue.deQueue());
			
			helperQueue.enQueue(number);
			
			firstNumber = (firstNumber * TEN); 
			
		}
		
		
		
		
		return (1);
		
	}
	
    /**
     * This method solves the Josephus problem, determining the last remaining soldier.
     * 
     * @param soldiersNum Is the total number of soldiers in the circle.
     * @param nthSoldier Is the step count for elimination.
     * @return Returns the last remaining soldier's number.
     * 
     * @since 23/09/2024
     * @version 1.0
     * @author Anastasis Zachariou
     */
	public static int josephus(int soldiersNum, int nthSoldier) {
		
		// Create a circular queue with the number of soldiers
		CircularQueue<Integer> josephusQ = new CircularQueue<Integer>(soldiersNum);
		
		// Enqueue all soldiers into the queue
		for(int i = ONE; i <= soldiersNum; i++)
			
			josephusQ.enQueue(i);
		
		// Continue until only one soldier remains
		while(josephusQ.size() != ONE) {
			
			// Move soldiers around until we reach the nth soldier
			for(int i = ZERO; i < (nthSoldier - 1); i++)
				
				josephusQ.enQueue(josephusQ.deQueue());
			
			// Remove the nth soldier
			josephusQ.deQueue();
			
		}
		
		// Return the last remaining soldier
		return ((int)josephusQ.deQueue());
		
	}
	
}
