package com.cg.framework;

public abstract class Bankfactory {
	public abstract Savingacc getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried);
	public abstract Currentacc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit);
	
	

}
