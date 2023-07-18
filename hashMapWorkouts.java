package workoutprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapWorkouts {

	public static void main(String[] args) {

		Map<Integer, String> mapObj = new HashMap<Integer, String>();
		mapObj.put(1, "NIC");
		mapObj.put(2, "Emerson");
		mapObj.put(3, "Accenture");
		mapObj.put(4, "TCS");
		
/*		
		  Iterator<Map.Entry<Integer,String>> iterObj = mapObj.entrySet().iterator();
		  while(iterObj.hasNext()) { Map.Entry<Integer, String> entryObj =
		  iterObj.next();
		  System.out.print("Keys:\n"+entryObj.getKey()+"Values:\n"+entryObj.getValue())
		  ; }
		  */
		  
		  long start = System.currentTimeMillis();
		  for(Map.Entry<Integer, String> set:mapObj.entrySet()){
		  
		  System.out.println(set.getKey()+" "+set.getValue()); }
		  
		   long end = System.currentTimeMillis();
		   long diff = end - start;
		   System.out.println("Time Taken: "+diff);
		  
		  
		  //using lambda expression 
	/*	  mapObj.forEach( (key,value) ->
		  System.out.println(key + "="+ value));*/
		 		
		
	//   long start = System.currentTimeMillis();
		//using streams
		/*
		 * mapObj.entrySet().stream().forEach(input ->
		 * System.out.println(input.getValue() + ":" +input.getValue()));
		 *  long end = System.currentTimeMillis();
		 */	
	   
/*	   for(Map.Entry<Integer, String> set:mapObj.entrySet()){

		   System.out.println(set.getKey()+""+set.getValue()); 

	   }*/
	

	   
	   /*
	    * //using lambda expression mapObj.forEach( (key,value) ->
	    * System.out.println(key + "="+ value)); */

}
}