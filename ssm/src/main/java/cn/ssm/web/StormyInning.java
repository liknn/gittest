package cn.ssm.web;

@SuppressWarnings("serial")
class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
	public Inning() throws BaseballException {
	}

	public void event() throws BaseballException {
	}

	public abstract void atBat() throws Strike, Foul;

	public void walk() {}
	
}

class StormException extends Exception{}
class RainedOut extends StormException{}

interface Storm{
	public abstract void event1() throws RainedOut;
	public abstract void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm{

	public StormyInning() throws BaseballException {

	}

	@Override
	public void rainHard() throws RainedOut {
		
	}

	@Override
	public void atBat() throws Strike, Foul {
		
	}

	@Override
	public void event1() throws RainedOut {
		// TODO Auto-generated method stub
		
	}
	
}

