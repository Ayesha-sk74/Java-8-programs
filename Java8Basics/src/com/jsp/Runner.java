package com.jsp;

public class Runner  {

	public static void main(String[] args) {
		
		//InterfaceName        refvar = () -> {};   //syntax
		FunctionalIntefaceDemo f1=() ->{System.out.println("hello hi");};  //lamda function
		f1.display();
		
		FunctionalIntefaceDemo f2=() ->{System.out.println("byee!!");};  //lamda function
		f2.display();
		
		FunDemo2 f3= (x,y) -> {System.out.println("Sum:"+ (x+y));};
		f3.show(23, 8);
		
		FunDemo3 f4 = ()-> "hello"+67;
		System.out.println(f4.displayy());
	}

}
