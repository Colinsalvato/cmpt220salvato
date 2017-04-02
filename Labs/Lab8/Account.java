import java.util.ArrayList;
import java.util.Date;

// JA: There is no class to test this
public class Account {

	String mName;
	int mId;
	double mBalance;
	double mAnnualInterestRate;
	Date mDateCreated;

	public Account() {
		mDateCreated = new Date();
	}

	public Account(int id, double balance) {
		this();
		mId = id;
		mBalance = balance;
	}

	public Account(String name, int id, double balance) {
		this(id, balance);
		mName = name;

	}

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		mId = id;
	}

	public double getBalance() {
		return mBalance;
	}

	public void setBalance(double balance) {
		mBalance = balance;
	}

	public double getAnnualInterestRate() {
		return mAnnualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		mAnnualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return mDateCreated;
	}

	public double getMonthlyInterestRate() {
		return mBalance * (mAnnualInterestRate / 12) / 100;
	}

	public void withdraw(double amount) {
		mBalance -= amount;
	}

	public void deposit(double amount) {
		mBalance += amount;
	}

	public String toString() {
		return "Account name: " + mName + "\n" + "Interest rate: " + mAnnualInterestRate;
	}


}
