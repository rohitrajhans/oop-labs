package lab7;
import java.util.*;

public class Bank {
	private ArrayList<Account>accts;
	int maxActive;
	
	Bank() {
		accts = new ArrayList<Account>();
	}
	
	public boolean addAccount( Account newone) {
		if( this.accts.size() <= 30) {
			accts.add(newone);
			return true;
		}
		return false;
	}
	
	public boolean removeAccount(long accNum) {
		Iterator<Account> itr = accts.iterator();
		while( itr.hasNext()) {
			Account obj = (Account) itr.next();
			if( obj.getAccNumber() == accNum) {
				itr.remove();
				return true;
			}
		}
		return false;
	}
	
	public double deposit( long acctnum, double amount) {
		Iterator<Account> itr = accts.iterator();
		while( itr.hasNext()) {
			Account ob = (Account)itr.next();
			if( ob.getAccNumber() == acctnum) {
				return ob.depositAmt(amount);
			}
		}
		return -1;
	}
	
	public double withdraw( long acctnum, double amount) {
		Iterator<Account> itr = accts.iterator();
		while( itr.hasNext()) {
			Account ob = (Account)itr.next();
			if( ob.getAccNumber() == acctnum) {
				return ob.withdrawAmt(amount);
			}
		}
		return -1;
	}
	
	public String toString() {
		Iterator<Account> itr = accts.iterator();
		String accDetails = new String();
		while( itr.hasNext()) {
			Account el = (Account)itr.next();
			accDetails += el;
		}
		return accDetails;
	}
}
