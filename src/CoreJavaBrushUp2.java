import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,122};
		
		for (int i=0; i < arr2.length; i++)
		{
			if (arr2[i]%2==0) 
			{
				System.out.println(arr2[i]);
				break; //to check any multiple of 2 are available
			}
			else 
			{
				System.out.println(arr2[i]+" is not a multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("****************");
		
		for (String val :a)
		{
			System.out.println(val);
		}
		
		//System.out.println(a.contains("Selenium"));
		
		String[] name = {"Rahul", "Shetty", "Academy", "Selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Selenium"));

	}

}
