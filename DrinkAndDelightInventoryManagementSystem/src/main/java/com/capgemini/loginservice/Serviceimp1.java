package com.capgemini.loginservice;

import com.capgemini.logindao.LoginDao;

public class Serviceimp1 {
	public int servicemethod(String eid,String pswrd) {
		LoginDao lda=new LoginDao();
		return lda.loginmethod(eid, pswrd);
		}
}
