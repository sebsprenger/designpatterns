package designpatterns.adaptee;

public class WuTangPlugin {
	
	private int sizeInKb = 5120;
	
	public void doSomething() {
		System.out.println("Wu tang clan ain't nothing to "
				+ "-- what was the text again?");
	}
	
	/**
	 * Returns size in kB
	 * @return size in kB
	 */
	public int getSize() {
		return sizeInKb;
	}
	
}
