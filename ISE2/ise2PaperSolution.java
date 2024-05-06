1.
a.-->
	we are said to design code for Library Management System
	we have two 	class Bank --->represents book 
			class Library--->to oversee bookmanagement
	therfore we need to write appropriate interfaces with proper explanation*/
	
	interface display{
		void setName(String name);//--->take argument as String type
		void setRegNum(String Regnum);//---->takes argument as String
		void setMobileNum(long mobnum);//---->take argument as long
	}
	interface BookDetails{
		int totalNumBooks=500; //these is final 
		void setBookName(String bookname);
		void setBookID(String bookid);
	}
	class Bank implements BookDetails{
		public void setBookName(String bookname){
		
		}
		public void setBookID(String bookid){
		
		}
	
	}
	class Library implements display{
		String LibName="";
		public void setName(String name){
		
		}
		public void setRegNum(String Regnum){
		
		}
		public void setMobileNum(long mobnum){
		
		}
		boolean isAvailable(Book obj){
		return false;
		}
		String isIssue(Book obj){
		return "";
		}
		public static void main(String args[]){
		
		}
		
	}

b.--->
Method1:
we can do is the code which is throwing error must be wriiten in try block and catch it using catch block
	
	eg--->
	try{
	//code which is throwing error
	}
	catch(InterruptedException ev){
	//statements
	}
//solution:
//Solution By using try Catch Block ,by Particular Given Exception 
//method 1
class ISE_2{
	public static void main(String args[]){
		ISE_2 Obj1=new ISE_2();
		System.out.println("sggs");
		try{
			Thread.sleep(1213);
		}
		catch(InterruptedException e){
			System.out.println("Error");
		}
		catch(Exception e){
			
		}
		
	}
}
method2:
These is checked exception so we can throw these Exception using throws clause in method which is giving exception
	eg.-->
		void display throws InterruptedException 
		

