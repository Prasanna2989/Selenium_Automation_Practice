public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,3,5,7,8,11, 120};
		//System.out.println(numbers[0]);
		//System.out.println(numbers[numbers.length-1]);
		int noOfEle = 0;

		for (int i=numbers.length-1; i>= 0 ; i--)
		{
			System.out.println(numbers[i]);
		}
		
		for (int j=0; j< numbers.length ; j++)
		{
			noOfEle = noOfEle+1;
		}
		System.out.println("number of elements = "+ noOfEle);
	}

}
