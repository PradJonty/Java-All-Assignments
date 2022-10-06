package com.valtech.training.corejava.day05;

public class PasswordStrength {

	

	    int cnt = 0;



	   public boolean checklower(String str) {
	        int flag = 0;
	        if (str.length() < 8)
	            return false;
	        for (char ch = 0; ch < str.length(); ch++) {
	            if (Character.isLowerCase(ch)) {
	                if (flag == 0) {
	                    cnt += 5;
	                    flag = 1;
	                    return true;
	                } else {
	                    break;
	                }
	            }
	        }
	        return true;
	    }



	   public boolean checkupper(String str) {
	        int flag = 0;
	        if (str.length() < 8)
	            return false;
	        for (char ch = 0; ch < str.length(); ch++) {
	            if (!Character.isLowerCase(ch)) {
	                if (flag == 0) {
	                    cnt += 5;
	                    flag = 1;
	                    return true;
	                } else {
	                    break;
	                }



	           }



	       }
	        return true;
	    }



	   public boolean checkdigit(String str) {
	        int flag = 0;



	       for (char ch = 0; ch < str.length(); ch++) {
	            if (Character.isDigit(ch)) {
	                if (flag == 0) {
	                    cnt += 5;
	                    flag = 1;
	                    return true;
	                } else {
	                    cnt += 1;
	                }
	            } else {
	                return false;
	            }



	       }
	        return true;
	    }
	   public int checkspecialchar(String str) {
	        int flag = 0;



	       String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
	        for (int i = 0; i < str.length(); i++) {
	            String strChar = Character.toString(str.charAt(i));
	            // Check whether String contains special character or not
	            if (specialChars.contains(strChar)) {
	                if (flag == 0) {
	                    cnt += 5;
	                    flag = 1;
	                } else {
	                    cnt += 1;
	                }
	            }



	       }
	        return cnt;
	    }
	
	   public String checkPasswordStrength(String a) {
			checkPasswordStrength(a);
			if(totalValue>25) {
				return("Strong");
			}
			if(totalValue<=25 && totalValue>20) {
				return ("Moderate");
			}
			if(totalValue<=20 && totalValue>=8) {
				return ("Weak");
			}
			return "Weak Password";
		}
	
	      

/* password strength checker
 *lower case 5
 *upper case 5
 *number 5,6.....
 * special character 5,7,9
 * password is strong if more than 25
 * 20 - 25 moderate
 * >20 poor
 * >8 weak
*/

	public char[] value;

	public Object checkTestLower(String a) {
		// TODO Auto-generated method stub
		return null;
	}



	public Object checkScore(String a) {
		// TODO Auto-generated method stub
		return null;
	}
}