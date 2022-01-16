package java_assignment;

import java.util.*;

public class queue {
	
		public static void main(String[] args) 
		{
		                Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Bidar");
		                locationsQueue.add("Belgavi");
		                locationsQueue.add("Gulbarga");
		                locationsQueue.add("Banglore");
		                locationsQueue.add("Davngere");
		System.out.println("Queue is : " + locationsQueue);
		                System.out.println("Head of Queue : " + locationsQueue.peek());
		                locationsQueue.remove();
		                System.out.println("After removing Head of Queue : " + locationsQueue);
		                System.out.println("Size of Queue : " + locationsQueue.size());
		        }
		}



