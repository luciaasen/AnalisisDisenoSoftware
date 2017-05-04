package p5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tasks {
	public static HashMap<String,Task> tasks= new HashMap<String,Task>();
	
	/**
	 * If it doesnt exist yet, adds a new task to the Tasks
	 * @param taskName name of the new task
	 * @return t the new task
	 * @throws IllegalArgumentException
	 */
	
	
	public Task newTask(String taskName) throws IllegalArgumentException{
		Task t = new Task(taskName);
		if(Tasks.contains(t)) throw new IllegalArgumentException();
		Tasks.tasks.put(t.getName(), t);
		return t;
	}
	
	public static Task getTask(String name){
		Iterator iter = tasks.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry mEntry = (Map.Entry) iter.next();
		    if(mEntry.getKey().equals(name)){
		    	return (Task) mEntry.getValue();
		    }
		}
		return null;
	}
	public static Iterator getTasks(){
		Iterator iter = tasks.entrySet().iterator();
		return iter;
	}
	
	
	
	public static boolean contains(Task t){
		return Tasks.tasks.values().contains(t);
	}
}
