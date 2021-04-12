package com.hcl;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> con;
	int taken = -1;

	public Consumer(BlockingQueue<Integer> con) {
		this.con = con;
	}

	@Override
	public void run() {
		while (taken != 10) {
			try {
				taken = con.take();
				System.out.println("Consumed By consumer : " + taken);
			} catch (InterruptedException e) {
			}
		}

	}

}
