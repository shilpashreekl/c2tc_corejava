package com.cg.application;


import com.cg.framework.Bankfactory;
import com.cg.framework.Currentacc;
import com.cg.framework.Savingacc;

public class MMBankFactory extends Bankfactory {

	@Override
	public Savingacc getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried) {
		
		Savingacc sa = new MMSavingAcc(AccNo, accNm, isSalaried, false);
		
		return sa;
	}

	@Override
	public Currentacc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		
		Currentacc ca = new MMCurrentAcc(AccNo, accNm, creditLimit);
		
		return ca;
	}

	
	
	
}
