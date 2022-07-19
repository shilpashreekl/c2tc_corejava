package com.cg.application;

import com.cg.framework.Savingacc;

public class MMSavingAcc extends Savingacc {
	private static final float MINBAL=100;
	
	


	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float  accBal) {
		
		System.out.println("Dear Saving Account User, Your account balance:"+accBal);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
