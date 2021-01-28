package datastructure;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable{
//"timed and polled lock-acquisition."
	public static void main(String[] args) {

	}
	public void run()
	{}
	class Account{}
	
	public boolean transferMoneyWithTryLock(Account fromAccount,
			Account toAccount, float amount) throws  InterruptedException {
		
		Lock lock =new ReentrantLock();   // lock.tryLock()
			// we are defining a stopTime
			long stopTime = System.nanoTime() + 5000;
			while (true) {
			if (lock.tryLock()) {
						try {
							if (lock.tryLock()) {
									try {
										if (amount > 10) {
									//	throw new InsufficientAmountException(
										//"Insufficient Balance");
											} else {
									//	fromAccount.debit(amount);
									//	toAccount.credit(amount);
										}
						
									} finally {
						//	toAccount.lock.unlock();
							}
							}
			
						} finally {
	//		fromAccount.lock.unlock();
			}
			}
			if(System.nanoTime() < stopTime)
			return false;

			Thread.sleep(100);
			}//while
			}
	
}
