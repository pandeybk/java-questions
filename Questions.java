import java.util.Arrays;

public class Questions {

	public static void main(String args[])
		{
			/* Function n-up count*/
			System.out.println("Function nUpCount start");
			System.out.println("For upcount 5");
			System.out.println("------------------------------------------");
			System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
			System.out.println("For upcount 6");
			System.out.println("------------------------------------------");
			System.out.println(nUpCount(new int[]{6,3,1}, 6));
			System.out.println("For upcount 20");
			System.out.println("------------------------------------------");
			System.out.println(nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20));
			System.out.println("Function nUpCount end");
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");

			/* Function prime number count */
			System.out.println("Total number prime number between inclusive 10 and 30 is: "+ countPrime(10,30));
			System.out.println("Total number prime number between inclusive 11 and 29 is: "+ countPrime(11,29));
			System.out.println("Total number prime number between inclusive 20 and 22 is: "+ countPrime(20,22));
			System.out.println("Total number prime number between inclusive 1 and 1 is: "+ countPrime(1,1));
			System.out.println("Total number prime number between inclusive 5 and 5 is: "+ countPrime(5,5));
			System.out.println("Total number prime number between inclusive 6 and 2 is: "+ countPrime(6,2));
			System.out.println("Total number prime number between inclusive -10 and 6 is: "+ countPrime(-10,6));
			System.out.println("Total number prime number between inclusive 2 and 2 is: "+ countPrime(2,2));

			/*Function isMadhavArray*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			System.out.println("array 1 ========>>>>>>>>>> returns 1");
			isMadhavArray(new int[]{2, 1, 1});
			System.out.println("array 2 ========>>>>>>>>>> returns 1");
			isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
			System.out.println("array 3 ========>>>>>>>>>> returns 0");
			isMadhavArray(new int[]{2, 1, 1, 4, -1, -1, 6, -1, -1, -3});
			System.out.println("array 4 ========>>>>>>>>>> returns 1");
			isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
			System.out.println("array 5 ========>>>>>>>>>> returns 0");
			isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
			System.out.println("array 6 ========>>>>>>>>>> returns 0");
			isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
			System.out.println("array 7 ========>>>>>>>>>> returns 1");
			isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
			System.out.println("array 8 ========>>>>>>>>>> returns 0");
			isMadhavArray(new int[]{3, 1, 2, 3, 0});

			/*Function isInertial*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			System.out.println("========== returns 1 ===========");
			isInertial(new int[]{11, 4, 20, 9, 2, 8});
			System.out.println("========== returns 0 ===========");
			isInertial(new int[]{1});
			System.out.println("========== returns 0 ===========");
			isInertial(new int[]{2});
			System.out.println("========== returns 0 ===========");
			isInertial(new int[]{1, 2, 3, 4});
			System.out.println("========== returns 1 ===========");
			isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
			System.out.println("========== returns 1 ===========");
			isInertial(new int[]{2, 12, 4, 6, 8, 11});
			System.out.println("========== returns 1 ===========");
			isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
			System.out.println("========== returns 0 ===========");
			isInertial(new int[]{-2, -4, -6, -8, -11});
			System.out.println("========== returns 0 ===========");
			isInertial(new int[]{2, 3, 5, 7});
			System.out.println("========== returns 0 ===========");
			isInertial(new int[]{2, 4, 6, 8, 10});

			/*Function countSquaresPairs */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			System.out.println("{9, 0, 2, -5, 7} number of square pair is: " +countSquaresPairs(new int[]{9, 0, 2, -5, 7}));
			System.out.println("{11, 5, 4, 20} number of square pair is: " +countSquaresPairs(new int[]{11, 5, 4, 20}));
			System.out.println("{9} number of square pair is: " +countSquaresPairs(new int[]{9}));

			/*Function findPorcupineNumber */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			findPorcupineNumber(8);
			findPorcupineNumber(14);
			findPorcupineNumber(19);
			findPorcupineNumber(20);
			findPorcupineNumber(139);		
			findPorcupineNumber(409);
		}
	

	static int nUpCount(int[] a, int n)
		{
			int upcount = 0;
			int partialSum = 0;
			int prevPartialSum = 0;
			for(int i=0; i<a.length; i++)
				{
				partialSum +=a[i];
				if(partialSum > n && prevPartialSum<=n)
					{
					System.out.println("Partial sum " + partialSum);
					System.out.println("Prev Partial sum " + prevPartialSum);
					upcount++;
					System.out.println("Upcount " + upcount);
					}
				prevPartialSum = partialSum;	
				}
			return upcount;
		}

	static int countPrime(int start, int end)
		{
			int count = 0;

			if(start>end)
				return 0;

			for(int i=start; i<=end; i++)
				{	
					if(isPrime(i))
						{
						count++;
						}
				}
			return count;	
					
		}

	static boolean isPrime(int value)
		{
			if(value <=1)
				return false;

			for(int i=2; i<=value/2; i++)
			{
				if(value%i == 0)
				{
					return false;
				}
			}

			return true;		
		}


	static int isPrime2(int value)
		{
			if(value <=1)
				return 0;

			for(int i=2; i<=value/2; i++)
			{
				if(value%i == 0)
				{
					return 0;
				}
			}

			return 1;		
		}


	static int isMadhavArray(int[]a)
		{
			int count1 = 1, count2=2, count3=3;
			int sum = 0;
			int flag = 0;

			System.out.println("Array length :" + a.length);

			for(int n=0; n<a.length; n++)
			{
				if(a.length== (n*(n+1)/2)){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.println("Return 0");
				return 0;
			}

			while(count2 <a.length){
				for(int j=count1; j<=count2; j++) {
					System.out.println("sum of elements " + a[j]);
					sum +=a[j];							
				}
				System.out.println(" =" + sum);
				count1 = count2+1;
				count2 += count3;
				System.out.println("Count 2 :" + count2);				
				count3++;
				if(sum == a[0]){
				sum = 0;
				} else {
				System.out.println("Return 0");
				return 0;
				}
			}		
			System.out.println("Return 1");		 	
			return 1;
		}

	static int isMadhavArrayFinal(int[] a){
		int count1=1, count2=2, count3=3;
		int sum=0;
		int flag = 0;		

		for(int n=0; n<a.length; n++)
		{
			if(a.length== (n*(n+1)/2)){
				flag = 1;
				break;
			}
		}

		if(flag == 0){
			return 0;
		}

		while(count2<a.length){
			for(int i = count1; i<=count2; i++){
				sum += a[i];				
			}
			count1=count2+1;
			count2=count2+count3;
			count3++;
			if(a[0]!=sum)
				return 0;
			sum=0;
		}
		return 1;
	}

	static int isInertial(int[] a)
		{
			int isodd = 0;
			int maxeven = a[0], minodd = 0;

			for(int i = 0; i<a.length; i++)
				{
					if(a[i]%2 != 0){
						isodd=1;
						minodd = a[i];
						System.out.println("Hello odd: " + minodd);
						break;
					}
				}

			if(isodd == 0){
				System.out.println("Return 0 from isodd, isEven");
				return 0;
				}

			for(int i = 0; i<a.length; i++){
					if(a[i]>maxeven){
						maxeven = a[i];
						System.out.println("Finding maxeven: " + maxeven);
					}
					
					if(a[i]%2 != 0 && a[i]<minodd){
						minodd = a[i];
						System.out.println("Hello minodd: " + minodd);
					}
				}

			if(maxeven%2 !=0){
				System.out.println("Return 0 from maxeven check");
				return 0;
				}

			for(int i = 0; i<a.length; i++){
				if(a[i]%2 ==0 && a[i]!=maxeven){
				if(a[i]>minodd){
					System.out.println("Return 0 from even>odd");
					return 0;
					}
				}
			}

		System.out.println("Return 1");
		return 1;
		}

	static int countSquaresPairs(int[] a){
		int count = 0;
		for(int i = 0; i<a.length; i++){
			if(a[i] <=0) continue;
			for(int j=0; j<a.length; j++){
				if(a[j] <=0 || a[j]<=a[i]) continue;
				if(isPerfectSquare(a[i]+a[j]) == 1){
					System.out.println("Sum number: "+a[i]);
					System.out.println("Sum number: "+a[j]);
					System.out.println("Equals: "+(a[i]+a[j]));
					count++;
				}
			}
		}
		return count;
	}

	static int isPerfectSquare(int a){
		double sqrt = (int)Math.sqrt(a);
		if(a == sqrt*sqrt){
			return 1;		
		}
		return 0;
	}

	static int findPorcupineNumber(int n){
		int prime1=0, prime2=0;
		n++;
		while(prime1%10 !=9 || prime2%10 !=9){
			while(isPrime2(n) == 0 || n%10 != 9){
				n++;
			}
			prime1 = n;
			n++;

			while(isPrime2(n) == 0){
				n++;
			}	
			prime2 = n;	
		}
		System.out.println("Porcupine number found: " + prime1);
		System.out.println("Because it's following prime number is: " + n);
		return prime1;
	}
}
