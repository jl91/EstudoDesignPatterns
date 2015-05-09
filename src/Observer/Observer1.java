package Observer;

public class Observer1 implements IObserver {
	int val1, val2, val3;

	@Override
	public void update(int val1, int val2, int val3) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		
		
		System.out.println(this.hashCode()+" - val1 - " + this.val1);
		System.out.println(this.hashCode()+" - val2 - " + this.val2);
		System.out.println(this.hashCode()+" - val3 - " + this.val3);

	}
}
