package com.behavioural.state;

//Step 3a - create the state classes
//Step 3d - implement the state interface
public class A1Class extends AClass implements StateInterface  
{
    
	//Step 3b - making the state variable final
	//Step 3c - initializing it
    private final String varA = "1";
    
    public void methodX(){
    	//Step 3e change the logic of the method
        System.out.println("this is the 1st logic of X");
        
    }
    
    public void methodY(){
    	//Step 3e change the logic of the method
        System.out.println("this is the 1st logic of Y");
    }
    
    //Step 3f - remove all other variables and methods
}
