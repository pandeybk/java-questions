public class IsPerfectsqaure{
	public static void main(String arfs[])
	{	
		System.out.println(isPrefectSquare(16));
		System.out.println(Math.sqrt(17));
		System.out.println(Math.sqrt(-4));
		System.out.println(isPrefectSquare(15));
		System.out.println(isPrefectSquare(13));
		System.out.println(isPrefectSquare(-4));
		System.out.println(isPrefectSquare(144));
		System.out.println("Perfect square of 2 is " + nextPerfectSquare(2));
		System.out.println("Perfect square of 6 is " + nextPerfectSquare(6));
		System.out.println("Perfect square of 36 is " + nextPerfectSquare(36));
		System.out.println("Perfect square of 0 is " + nextPerfectSquare(0));
		System.out.println("Perfect square of -5 is " + nextPerfectSquare(-5));
	}
	
	static boolean isPrefectSquare(int n){		
		for(int i = 0; i<=n; i++)
			{
				if(n == i*i){		
				return true;
				}
			}
		return false;
	}

	static int nextPerfectSquare(int n){
		if(n <0)
		return 0;

		double number = Math.floor(Math.sqrt(n));
		return (int)((number+1)*(number+1));
	}

	static int nextPerfectSquare2(int n) {
		for (int i = 0; i<=n; i++)
		{
			if(n == i*i)
				{
				return (i+1)*(i+1);
				}
		}
		return 0;
	}
}
