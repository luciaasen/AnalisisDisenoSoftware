package task_manager;



import java.util.Iterator;
import java.util.Map;

import console.TextConsole;
import p5.Task;
import p5.Tasks;
import p5.interf.Function;

public class TaskManager extends TextConsole {
	
	Tasks tasks = new Tasks();
	Task current;
	 private long createdMillis;

	   
	@Override
	public void run(){
		
		//Register Commandos
		
		addCommand("start", start);
		addCommand("stop", stop);
		addCommand("list", list);
		addCommand("addEstimate", addEstimate);
		addCommand("spend", spend);
		addCommand("parent", parent);
		addCommand("status", status);
		
		super.run();
	}
	
	
	//Lambda implementations of commands
	
	Function stop = (args) -> {
		
		if(args.length !=0){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		
		//Compute time
		long nowMillis = System.currentTimeMillis();
        int minutes = (int)((nowMillis - this.createdMillis) / 1000);
        current.getDedicated().incrementTime(minutes);
        current = null;
		
	};
	
	Function start = (args) ->{
		
		if(args.length!=1){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		
		if((current != null)){
			stop.execute(null);
		}
		
		current = tasks.newTask(args[0]);
		//Time when created 
		createdMillis = System.currentTimeMillis();
	};
	
	Function list = (args) ->  {
		
		if(args.length!=0){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		
		Iterator iter = tasks.getTasks();
		while (iter.hasNext()) {
		    Map.Entry mEntry = (Map.Entry) iter.next();
		    System.out.println(mEntry.getValue());
		}
		
	};
	
	
	
	Function addEstimate = (args) ->{
		
		if(args.length !=1){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		
		int est = Integer.parseInt(args[0]);
		current.getEstimated().incrementTime(est);
	};
	
	Function spend = (args)->{
		
		if(args.length != 1){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		
		int est = Integer.parseInt(args[0]);
		current.getDedicated().incrementTime(est);
	};
	
	
	
	Function parent = (args) ->{
		if(args.length>1){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		if(args.length==0){
			current.setParent(null);
		}else{
		Task parent = tasks.getTask(args[0]);
		current.setParent(parent);
		}
	};
	
	Function status= (args) ->{
		
		if(args.length>1){
			System.out.println("Numero inadecuado de argumentos\n");
			return;
		}
		
		if(args.length==0){
			System.out.println(current);
		}else{
			Task t = tasks.getTask(args[0]);
			if(t!=null){
				System.out.println(t);
			}
		}
	};
	

}
