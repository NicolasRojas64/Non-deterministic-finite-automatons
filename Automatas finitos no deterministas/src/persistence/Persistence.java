package persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.Gson;
import model.State;
import model.StateType;
import model.Transition;

public class Persistence {
	
	//Ejemplo de escritura JSON y lectura JSON
	public static void main(String[] args) {
		//Escritura de Array a JSON en txt
		ArrayList<Transition> transition = new ArrayList<Transition>();
		transition.add(new Transition('1', new State("q0", StateType.INITIAL), new State("q1", StateType.DEFAULT)));
		transition.add(new Transition('0', new State("q1", StateType.DEFAULT), new State("q2", StateType.DEFAULT)));
		transition.add(new Transition('1', new State("q2", StateType.DEFAULT), new State("q3", StateType.FINAL)));
		toJsonTransition(transition);
		
		//Lectura de JSON a Array
		Path path = Paths.get("Automatas finitos no deterministas/src/data/transitions.txt");
		try {
			String txt = Files.readString(path);
			ArrayList<Transition> array = toArrayTransition(txt);
			for (Transition transition2 : array) {
				System.out.println(transition2.getTransitionValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void toJsonTransition(ArrayList<Transition> transition) {
		String json = new Gson().toJson(transition);
		try {
			FileWriter fw = new FileWriter("Automatas finitos no deterministas/src/data/transitions.txt");
			fw.write(json);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Transition> toArrayTransition(String jsonText) {
		Gson gson = new Gson();
		ArrayList<Transition> array = new ArrayList<Transition>();
		Transition[] userArray = gson.fromJson(jsonText, Transition[].class);  
		for (Transition transition : userArray) {
			array.add(transition);
		}
		return array;
	}
}