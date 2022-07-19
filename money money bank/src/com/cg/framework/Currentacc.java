package com.cg.framework;

public abstract class Currentacc extends Bankacc {
	private final float creditLimit=100;
	
	public Currentacc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}


	public float getCreditLimit() {
		return creditLimit;
	}


	public void withdraw(float creditLimit)
	{
		System.out.println("Your creditlimit:"+creditLimit);
	
	}


	@Override
	public String toString() {
		return "Currentacc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
	}
