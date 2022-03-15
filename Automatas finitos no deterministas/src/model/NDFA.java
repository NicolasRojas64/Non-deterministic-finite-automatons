package model;

import java.util.ArrayList;

public class NDFA {
	private ArrayList<State> states;
	private ArrayList<Transition> transitions;
	
	public NDFA() {
		
	}
	
	public void addState(State state) {
		
	}
	
	public void deleteState(State state) {
		
	}
	
	public void addTransition(char transitionValue, State initialState, State finalState) {
		
	}
	
	public void deleteTransition(Transition transition) {
		
	}
	
	public boolean validateWord(String word) {
		boolean validation = true;
		
		return validation;
	}
	
	public boolean isDeterministic() {
		boolean isDeterministic = true;
		
		return isDeterministic;
	}

	public ArrayList<State> getStates(){
		return this.states;
	}

	public ArrayList<Transition> getTransitions(){
		return this.transitions;
	}
}
