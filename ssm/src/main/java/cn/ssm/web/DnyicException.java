package cn.ssm.web;

public class DnyicException extends Exception{

	
    static void f(String str) throws DnyicException{
    	if(null == str) {
    		DnyicException de = new DnyicException();
    		de.initCause(new NullPointerException());
    		
    		throw de;
    	}
    }
    
    public static void main(String[] args) {
		try {
			f(null);
		} catch (DnyicException e) {
			e.printStackTrace();
		}
	}
	
}
