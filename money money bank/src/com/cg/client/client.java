package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.Bankfactory;
import com.cg.framework.Currentacc;
import com.cg.framework.Savingacc;

public class client {
	
	public static void main(String[] args) {

	Bankfactory bf  = new MMBankFactory();
	
	Savingacc sa =new MMSavingAcc(2, "sha", 1221213, false);
	
	Currentacc ca = new MMCurrentAcc(1, "adsd", 13213234);
 
	sa.withdraw(sa.getAccBal());
	sa.toString();
	ca.withdraw(ca.getCreditLimit());
		

	}
}

