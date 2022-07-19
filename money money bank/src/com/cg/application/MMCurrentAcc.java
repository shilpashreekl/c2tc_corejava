package com.cg.application;

import com.cg.framework.Currentacc;

public class MMCurrentAcc extends Currentacc{
	





public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}



public void withdraw (float creditLimit) {

	System.out.println("Dear Current Account User, Your account balance:"+getAccBal()+"Your creditlimit:"+creditLimit);
}

@Override
public String toString() {
	return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}