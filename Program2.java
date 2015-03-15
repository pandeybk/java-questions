public class Program2 {
	public static void main(String args[])
		{
			System.out.println(f(new int[] {1}));
			System.out.println(f(new int[] {1,2}));
			System.out.println(f(new int[] {1,2,3}));
			System.out.println(f(new int[] {1,2,3,4}));
			System.out.println(f(new int[] {3,3,4,4}));
			System.out.println(f(new int[] {3,2,4,4}));
			System.out.println(f(new int[] {3,2,3,4}));
			System.out.println(f(new int[] {4,1,2,3}));
			System.out.println(f(new int[] {1,1}));
			System.out.println(f(new int[] {}));
		}

	static int f(int[] a)
		{
			int sumodd = 0;
			int sumeven = 0;
			for(int i = 0; i < a.length ; i++)
				{
				if(a[i]%2 == 0)
					sumeven += a[i];
				else
					sumodd += a[i];
				}
			return sumodd - sumeven;					
		}
}
