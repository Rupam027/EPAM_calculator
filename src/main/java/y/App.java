package y;
import java.io.* ; 


public class App 
{
	
    public static void main(String[] args)throws IOException
    {
		
		
		while(true)
		{ 
		DataInputStream in=new DataInputStream(System.in);
		Calculator obj = new Calculator() ; 
		
		
		
		
		try{

		System.out.print("\nFirst  Number  ->  "); 
		double a = Double.parseDouble(in.readLine()); 
		
		System.out.print("\nSecond Number  ->  ");
		double b = Double.parseDouble(in.readLine()); 
		
		System.out.print("\nChoose Operation : (+ , - , * , /) : "); 
		char ch = in.readLine().charAt(0);
	
		
		switch(ch){ 
		
		case '+': 
		
		obj.add(a , b);
		break;
		
		case '-': 
		obj.sub(a , b) ;
        break;	
		
		case '*': 
		obj.multiply(a , b) ; 
		break;
		
		case '/': 
		obj.divide(a , b) ; 
		break;
		
		default: 
		System.out.println("\nINVALID OPERATION");
		
		
		} 
			
		
		}
		catch(NumberFormatException e){ 
		
		System.out.print("\nPlease Enter Numeric Value"); 
		
		}
        
	    System.out.print("\nEnter q to exit or press space to continue -> ") ; 		
		char ch=in.readLine().charAt(0);
		
		if(ch == 'q')
		break;
		
		
		}
		
		
		
		
		
    }
}
