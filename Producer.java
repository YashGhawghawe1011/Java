package com.hcl;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> pro;

	public Producer(BlockingQueue<Integer> pro) {
		this.pro = pro;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				pro.put(i);
				System.out.println("Produced By producer : " + i);
			} catch (InterruptedException e) {

			}
		}

	}

}
