package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
	private ArrayList<IObserver> observers = new ArrayList<IObserver>();
	private int param3;
	private int param2;
	private int param1;

	@Override
	public void attach(IObserver observer) {
		observers.add(observer);

	}

	@Override
	public void detach(IObserver observer) {
		int index = this.observers.indexOf(observer);
		if (index > 0) {
			this.observers.remove(index);
		}

	}

	@Override
	public void notifyObservers() {
		if (this.observers.size() > 0) {
			for (IObserver observer : this.observers) {
				observer.update(this.param1, this.param2, this.param3);
			}
		}
	}
	
	public void setParams(int param1, int param2, int param3){
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.notifyObservers();
	}
}
