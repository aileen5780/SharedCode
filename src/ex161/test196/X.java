package ex161.test196;

abstract class X {
	public abstract void methodX();
}

interface Y{
	public void methodY();
}

abstract class Z extends X implements Y{
	public abstract void methodZ();
}
