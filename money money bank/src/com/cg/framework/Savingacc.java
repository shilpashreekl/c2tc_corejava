package com.cg.framework;

public abstract class Savingacc extends Bankacc {
	private boolean isSalary ;
	private static final float MINBAL =100;
	
	
	
	public Savingacc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	
		
		
	
	public boolean isSalary() {
		return isSalary;
	}




	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}




	public static float getMinbal() {
		return MINBAL;
	}




	public void withdraw(float accBal) {
	
	System.out.println("Account Balace:"+accBal);
	
	}



	@Override
	public String toString() {
		return "Savingacc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
	}
