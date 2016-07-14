package com.niit.loginpage;

public class logindao {

public boolean iSValidUser(String userid,String password)
{
	if(userid.contentEquals(password))
	{
		return true;
		
	}
	else
	{
		return false;
	}
}
}

