package model;

import java.util.ArrayList;

public class NDFA {
	private ArrayList<State> states;
	private ArrayList<Transition> transitions;
	
	public NDFA() {
		states=new ArrayList<State>();
		transitions=new ArrayList<Transition>();
	}
	
	public void addState(String name, StateType type) {
		states.add(new State(name,type);
	}
	
	public void deleteState(State state) {
		list.remove(state);
	}
	
	public void addTransition(char transitionValue, State initialState, State finalState) {
		list.add(new Transition(transitionValue,initialState,finalState));
	}
	
	public void deleteTransition(Transition transition) {
		list.remove(transition);
	}
	
	
}