import java.util.ArrayList;

public class Currency{
	public static void main(String[] args)
	
	{
		ArrayList<String> arr = new ArrayList<String> ();
		arr.add("POUNDS");
		arr.add("DOLLARS");
		arr.add("EUROS");
		
		for(int i=0;i<arr.size();i++) 
		{
			if(arr.contains("POUNDS"))
			{
				arr.get(i);
				System.out.println(arr);
			}
			else
			{
				System.out.println("POUNDS NOT FOUND");
			}
		}
	}
}
