package com.dub;

import com.dub.site.minimumSpanningTree.MinHeap;

public class MinHeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		
		//int[] keys = {77, 42, 33, 66, 15, 25};
		int[] keys = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
		
		System.out.println("main sator");
		
		MinHeap queue = new MinHeap(keys);
		
		System.out.println("main arepo");
		
		queue.display();
		
		queue.build();
		
		queue.display();
		
		//queue.extractMin()
		
		System.out.println("min " + queue.extractMin());
		
		//queue.build();
		
		queue.display();
		
		System.out.println("decreaseKey");
		queue.decreaseKey(2, 6);
		
		queue.display();
		
		System.out.println("isInQueue 7 " + queue.isInQueue(7));
		
		System.out.println("min " + queue.extractMin());
		
		System.out.println("isInQueue 7 " + queue.isInQueue(7));
		
		System.out.println("main completed");

	}

}
