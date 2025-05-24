package charoccurancestring;

public class FindCharOccuranceInString {

	public static void main(String[] args) {
		System.out.println(FindCharOccuranceInString( "Hello World" ,'l'));

	}	
public static int FindCharOccuranceInString(String str , char ch)
{
	char arr[] = str.toCharArray();
	int count = 0;
	for(char c : arr)
	{
		if(c == ch)
		{
			count++;
		}
	}
	return count;
}
}
