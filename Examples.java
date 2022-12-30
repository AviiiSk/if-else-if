
public class Examples {

public void days()
{
	int ab=20;
	int cd=30;
	int ef=50;
	
	if(ab==30) {
		System.out.println("ab is Equal to cd");
	}
		else if (ef==30) 
		{
			System.out.println("ef is Equal to cd");
		}
		else if(ab<=cd)
		{
			System.out.println("ab is Smallest Digit");
		}
	
		
}

	public static void main(String[] args)
	{
		int a=20;
		
		
	if (a>=18)
	{
		System.out.println(" Your are eligible to Driving");
	}
	else {
		System.out.println("Your are not Adult to Drive");
	}
	
	Examples obj=new Examples();
	
	obj.days();
	
	
	
	}
}
