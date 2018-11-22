import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

class Data {
	
	private int result;
	private boolean pChance;
	private boolean mChance;
	private Object lock;
	private int nop;
	
	public Data(){ // 8 Marks
		Scanner scan = null;
		//Q.1 Write your code here
		try {
			scan = new Scanner(new FileInputStream("input.txt"));
		} catch (FileNotFoundException E) {
			System.err.println(E);
		}
		while(scan.hasNext()) {
			result = scan.nextInt();
			pChance = scan.nextBoolean();
			mChance = scan.nextBoolean();
			nop = scan.nextInt();
		}
		lock = new Object();
		scan.close();
	}

	public int getResult() {
		return result;
	}

	public void setResult(int value) {
		this.result = value;
	}

	public boolean isPChance() {
		return pChance;
	}

	public void setPChance(boolean pChance) {
		this.pChance = pChance;
	}

	public boolean isMChance() {
		return mChance;
	}

	public void setMChance(boolean mChance) {
		this.mChance = mChance;
	}

	public Object getLock() {
		return lock;
	}

	public int getNoP() {
		return nop;
	}	
}

class Monitor implements Runnable {

	private Data d;
	private int tails = 0;
	private int heads = 0;
	
	public Monitor(Data d){
		this.d = d;
	}
	
	public void run() {
		int i;
		PrintWriter outStream = null;
		Object obj = d.getLock();
		
		//Q.2 (a) - 2 Marks
		
		//Q.2 (b) - 3 Marks
		
		//Q.2 (c) - 6 Marks	
		
		for(i=0; i<d.getNoP(); i++ ) {
			synchronized(obj) {
				while( d.isPChance()) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		
		
		/*
		 * Uncomment the following two lines after writing
		 * solution for Q.2(a), Q.2(b)and Q.2(c)		 
		 */
		System.out.println("monitor is going to read value ...");
		if(d.getResult() == 0) tails++; else heads++;
		
		//Q.2 (d) - 6 Marks
				d.setMChance(false);
				d.setPChance(true);
				obj.notifyAll();
			}
		}
		//Q.2 (e) - 3 Marks		
		try {
			outStream = new PrintWriter(new FileOutputStream("output.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		outStream.println("Number of heads: " + heads);
		outStream.println("Number of tails: " + tails);
		outStream.close();
	}
}

class Player implements Runnable{
	private Data d;
	Random rand = new Random();
	
	public Player(Data d) {
		this.d = d;
	}
	
	public void run() {
		
		Object obj = d.getLock();
		
		//Q.3(a) - 3 Marks
		
		//Q.3(b) - 3 Marks
		synchronized(obj) {
			while( d.isMChance()) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		
		/*
		 * Uncomment the following two lines after writing
		 * solution for Q.3(a) and Q.3(b)		 
		 */
		d.setResult(rand.nextInt(2));
		System.out.println("player is going to write value :" + d.getResult());
		
		//Q.3(c) - 6 Marks
			d.setPChance(false);
			d.setMChance(true);
			obj.notifyAll();
		}
	} //end of run method		
}

class Lab10 {
	
	public static void main(String[] args){
		
		Data data = new Data();
		Thread[] players;
		Thread monitor;
		
		players = new Thread[data.getNoP()];
		//Q.4(a) - 7 Marks
		for(int i=0; i<data.getNoP(); i++) {
			players[i] = new Thread(new Player(data));
			players[i].start();
		}
		//Q.4(b) - 3 Marks
		monitor = new Thread(new Monitor(data));
		monitor.start();
	}
}
