package com.java.lj.structure.queue;

import com.java.lj.algorithm.MyPrintln;

public class Test {

	public static void main(String[] args) {
		MyPrintln.start("testSeqQueue");
		testSeqQueue();
		
		MyPrintln.start("testLinkedQueue");
	}

	private static void testSeqQueue() {
		
		SeqQueue<String> seqQueue = new SeqQueue<>();
		
		/*
		 * 超过容量报异常
		seqQueue.add("a");
		seqQueue.add("b");
		seqQueue.add("c");
		seqQueue.add("d");
		seqQueue.add("e");
		seqQueue.add("f");
		seqQueue.add("g");
		seqQueue.add("h");
		seqQueue.add("i");
		seqQueue.add("j");
		seqQueue.add("k");
		seqQueue.add("l");
		seqQueue.add("m");
		seqQueue.add("n");
		*/
		
		seqQueue.offer("a");
		seqQueue.offer("b");
		seqQueue.offer("c");
		seqQueue.offer("d");
		seqQueue.offer("e");
		seqQueue.offer("f");
		
		int s = seqQueue.size();
		for (int i = 0; i < s; i++) {
			System.out.println("seqQueue.poll->" + seqQueue.poll());
		}
		seqQueue.offer("g");
		seqQueue.offer("h");
		seqQueue.offer("i");
		seqQueue.offer("j");
		seqQueue.offer("k");
		seqQueue.offer("l");
		seqQueue.offer("m");
		seqQueue.offer("n");
		seqQueue.offer("o");
		seqQueue.offer("p");
		seqQueue.offer("q");
		seqQueue.offer("r");
		seqQueue.offer("s");
		seqQueue.offer("t");
		System.out.println("---------");
		s = seqQueue.size();
		for (int i = 0; i < s; i++) {
			System.out.println("seqQueue.poll->" + seqQueue.poll());
		}
	}
}