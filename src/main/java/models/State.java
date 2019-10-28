package models;

public class State {

	private StateValue stateValue;

	public State() {
	}

	public void next() {
		this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
	}

	public StateValue getStateValue() {
		return null;
	}

	public void reset() {
	}

	public void setState(StateValue newState) {
	}

}