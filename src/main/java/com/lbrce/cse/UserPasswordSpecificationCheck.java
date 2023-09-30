package com.lbrce.cse;

import java.util.ResourceBundle;

public class UserPasswordSpecificationCheck {
	public boolean userValidation(String uname,String psw)
	{
		//System.out.println(uid+" "+psw);
				ResourceBundle rb = ResourceBundle.getBundle("config");
				String username=rb.getString("username");
				String password=rb.getString("password");
				//System.out.println(uname+" "+password);
				if(username.equals(uname)&&psw.equals(password))
				return true;
				else
				return false;
	}

}
