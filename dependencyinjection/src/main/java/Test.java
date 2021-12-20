
public class Test {
	private int val1;
	private float val2;
	private long val3;
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public float getVal2() {
		return val2;
	}
	public void setVal2(float val2) {
		this.val2 = val2;
	}
	public long getVal3() {
		return val3;
	}
	public void setVal3(long val3) {
		this.val3 = val3;
	}
	public static void amin(String[] ar)
	{
		Test test=(Test)of.getbean("test");
		System.out.println(test.getVal1());
		System.out.println(test.getVal1());
		System.out.println(test.getVal3());
	}

}
