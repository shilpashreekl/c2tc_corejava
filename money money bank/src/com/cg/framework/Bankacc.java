package com.cg.framework;

public abstract class Bankacc {
	private int accNo;
	private String accNm;
	private float accBal;

	

		public Bankacc(int accNo, String accNm, float accBal) {
			super();
			this.accNo = accNo;
			this.accNm = accNm;
			this.accBal = accBal;
		}
		
		
		
		
		 public int getAccNo() {
			return accNo;
		}




		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}




		public String getAccNm() {
			return accNm;
		}




		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}




		public float getAccBal() {
			return accBal;
		}




		public void setAccBal(float accBal) {
			this.accBal = accBal;
		}




		public void withdraw(float accBal) {
				
		 }
		@Override
		public String toString() {
			return "Bankacc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
					+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
}


