import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

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

			/*Function findGuthrieSequence*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			System.out.println("GuthrieSequence for 7");
			findGuthrieSequence(7);
			System.out.println("GuthrieSequence for 9");
			findGuthrieSequence(9);
			System.out.println("GuthrieSequence for 8");
			//findGuthrieSequence2(8);
			isGuthrieSequence(new int[]{7,2});
			//isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1});
			//isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 4, 20, 10, 5, 16, 8, 4, 2, 1});
			isGuthrieSequence(new int[]{8, 4, 2, 1});
			isGuthrieSequence(new int[]{8, 17, 4, 1});
			//isGuthrieSequence(new int[]{8, 4, 1});
			//isGuthrieSequence(new int[]{8, 4, 2});

			/*Function guthrieIndex */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			guthrieIndex(1);
			guthrieIndex(2);
			guthrieIndex(3);
			guthrieIndex(4);
			guthrieIndex(42);

			/*Function stantonMeasure */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			stantonMeasure(new int[]{1});
			stantonMeasure(new int[]{0});
			stantonMeasure(new int[]{3, 1, 1, 4});
			stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
			stantonMeasure(new int[]{});

			/*Function sumFactor */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			sumFactor(new int[]{3, 0, 2, -5, 0});
			sumFactor(new int[]{9, -3, -3, -1, -1});
			sumFactor(new int[]{1});
			sumFactor(new int[]{0, 0, 0});

			/*Function solve10*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			solve10();
			
			/*Function repsEqual*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			repsEqual(new int[]{1,2,3}, 123);
			repsEqual(new int[]{3, 2, 0, 5, 3}, 32053);
			repsEqual(new int[]{3, 2, 0, 5}, 32053);
			repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053);
			repsEqual(new int[]{2, 3, 0, 5, 3}, 32053);
			repsEqual(new int[]{9, 3, 1, 1, 2}, 32053);
			repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053);
			
			/*Function isCentered15 */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9});
			isCentered15(new int[]{3, 2, 10, 5, 6, 9});
			isCentered15(new int[]{2, 10, 4, 1, 6, 9});
			isCentered15(new int[]{3, 2, 10, 4, 1, 6});
			isCentered15(new int[]{1,1,8, 3, 1, 1});
			isCentered15(new int[]{9, 15, 6});
			isCentered15(new int[]{1, 1, 2, 2, 1, 1});
			isCentered15(new int[]{1, 1, 15 -1,-1});
			
			/*Function findFactorial*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			isPerfectNumber(15);
			isPerfectNumber(6);

			/*Function henry*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			henry(1,3);
			henry(3,4);
			
			/*Function isDivisible*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			isDivisible(new int[]{3, 3, 6, 36}, 3);
			isDivisible(new int[]{4}, 2);
			isDivisible(new int[]{3, 4, 3, 6, 36}, 3);
			isDivisible(new int[]{6, 12, 24, 36}, 12);
			isDivisible(new int[]{}, 3);

			/* Function isNUnique */
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			isNUnique(new int[]{7, 3, 3, 2, 4}, 6);
			isNUnique(new int[]{7, 3, 3, 2, 4}, 10);
			isNUnique(new int[]{7, 3, 3, 2, 4}, 11);
			isNUnique(new int[]{7, 3, 3, 2, 4}, 8);
			isNUnique(new int[]{7, 3, 3, 2, 4}, 4);
			isNUnique(new int[]{1}, 1);
			isNUnique(new int[]{2, 7, 3, 4}, 5);

			/*Function isSquare*/
			System.out.println("<<<<<<>>>>>>>>>>>>>>>><<<<<<<<<<<<<>>>>>>>><<<<<>>>>");
			isSquare(4);
			isSquare(25);
			isSquare(-4);
			isSquare(8);
			isSquare(0);
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

	static int isSquare(int a){
		int square=1;
		int number=1;

		if(a==0){
			System.out.println("Return 1");			
			return 1;
		}

		while(square!=a){
			square = number*number;
			if(square>a) break;
			number++;
		}

		if(square == a){
			System.out.println("Return 1");
			return 1;
		}

		System.out.println("Return 0");
		return 0;
	}

	static int findPorcupineNumber(int n){
		int prime1=0, prime2=0;
		n++;
		while(prime1%10 !=9 || prime2%10 !=9){
			while(isPrime2(n) == 0){
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

	static int[] findGuthrieSequence(int a){
		int[] guthriesequence = new int[100];
		int i = 1;
		System.out.println("Initial " + a);
		guthriesequence[0] = a;
		while(a!=1){
			if(a%2==0){
				a = a/2;
				if(a==1){
					guthriesequence[i]=a;
					System.out.println("Inside one " + a);
					break;
				}
				guthriesequence[i]=a;
				System.out.println("Inside even " + a);
			}
			if(a%2!=0){
				a = (a*3)+1;
				guthriesequence[i]=a;
				System.out.println("Inside odd " + a);
			}
			i++;
		}	
		System.out.println(Arrays.toString(guthriesequence));
		return guthriesequence;	
	}

	static Integer[] findGuthrieSequence2(int a){
		List<Integer> guthriesequencelist = new ArrayList<Integer>();
		//System.out.println("Initial " + a);
		guthriesequencelist.add(a);
		while(a!=1){
			if(a%2==0){
				a = a/2;
				if(a==1){
					guthriesequencelist.add(a);
					//System.out.println("Inside one " + a);
					break;
				}
				guthriesequencelist.add(a);
				//System.out.println("Inside even " + a);
			}
			if(a%2!=0){
				a = (a*3)+1;
				guthriesequencelist.add(a);
				//System.out.println("Inside odd " + a);
			}
		}
		Integer[] guthriesequencearray = guthriesequencelist.toArray(new Integer[guthriesequencelist.size()]);
		//System.out.println(Arrays.toString(guthriesequencearray));
		return guthriesequencearray;
	}

	static int isGuthrieSequence(int[] a){
		System.out.println("Print array length given " + a.length);
		System.out.println("Print array length calculated " + findGuthrieSequence2(a[0]).length);
		System.out.println(Arrays.toString(findGuthrieSequence2(a[0])));
		if(a.length != findGuthrieSequence2(a[0]).length && a[a.length-1] != 1){
			System.out.println("Return 0 from length comparison");
			return 0;
		}
		Integer[] guthriesequencearray = new Integer[a.length];
		guthriesequencearray = findGuthrieSequence2(a[0]);
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++){
			if(a[i] != guthriesequencearray[i]){
				System.out.println("Return 0 from elements comparisions");
				return 0;
			}
		}
		System.out.println("Return 1");
		return 1;
	}

	static int guthrieIndex(int n){
		int guthrieIndex = findGuthrieSequence2(n).length-1;
		System.out.println("guthrieIndex of: "+ n + " is " + guthrieIndex);
		return guthrieIndex;
	}

	static int stantonMeasure(int[] a){
		int countone = 0;
		int countstantonmeasure = 0;

		for(int i = 0; i<a.length ; i++){
			if(a[i] == 1){
				countone++;
			}		
		}

		for(int i = 0; i<a.length ; i++){
			if(a[i] == countone){
				countstantonmeasure++;
			}		
		}
		System.out.println("countstantonmeasure: " +countstantonmeasure);
		return countstantonmeasure;
	}

	static int sumFactor(int[] a){
		int countsumfactor = 0;
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}

		for(int i=0; i<a.length; i++){
			if(a[i] == sum){
				countsumfactor++;
			}
		}
		System.out.println("countsumfactor: " +countsumfactor);
		return countsumfactor;
	}	

	static int[] solve10(){

		int[] xandy = new int[2];
		int factorial10 = factorial(10);
		
		for(int i=10;i>0; i--){
			for(int j=10; j>0; j--){
				//System.out.println("Integer i: " + i );
				//System.out.println("Integer j: " + j );
				//System.out.println("Factorial sum of " + i + " and " + j + " is " + (factorial(i)+factorial(j)));
				if((factorial(i)+factorial(j)) != factorial10) continue;
				xandy[0] = i;
				xandy[1] = j;
				System.out.println("Value of x is: " + i + " and y is: " + j);
			}			
		}
		System.out.println(Arrays.toString(xandy));	
		return xandy;
	}

	static int factorial(int n){
		int factorial=1;
		for(int i=n; i>1; i--){
			factorial *=i;
		}
		return factorial;
	}

	static int repsEqual(int[] a, int n){
		List<Integer> numberlist = new ArrayList<Integer>();

		while(String.valueOf(n).length() != 1){
			numberlist.add(n%10);
			n=(int)Math.floor(n/10);
		}
		
		numberlist.add(n);

		if(a[0]==0){
			numberlist.add(0);
		}

		System.out.println(numberlist);
		int numberarraylength = numberlist.size();
		Integer[] numberarray = numberlist.toArray(new Integer[numberarraylength]);
		if(a.length != numberarraylength){
			System.out.println("Return 0 from length miss matched");
			return 0;
		}
		for(int i=0; i<a.length; i++){
			if(a[i]!=numberarray[a.length-1-i]){
				System.out.println("Return 0 from array miss matched");
				return 0;
				}
			
		}
		System.out.println("Return 1");
		return 1;
	}	

	static int isCentered15(int[] a){
		int sum = 0;
		for(int i=0; i<a.length; i++){
			//System.out.println("Elements of sum: " + a[i]);
			//System.out.println(((a.length-1)/2)+1);
			sum = a[i];
			if(sum==15 && a.length%2!=0){
				if(i== Math.floor(a.length/2)){
					System.out.println("Return 1 from odd check");
					return 1;
				}
			}
			for(int j=i+1; j<a.length; j++){
				//System.out.println("Elements of sum: " + a[j]);
				sum +=a[j];
				if(sum>15) break;
				if(sum==15){
					//System.out.println("Sum 15 found: " + sum);

					if(i==(a.length-(j+1))){
						/*
						System.out.println("i : " + i);			
						System.out.println("j : " + j);	
						System.out.println("Length : " + a.length);
						*/
						System.out.println("Return 1");
						return 1;
					}
					break;
				}
			}
			//System.out.println("-----------------------"); 
		}
		System.out.println("Return 0");
		return 0;
	}

	static int isPerfectNumber(int number){
		int factorNumber = 1;
		int sum = 0;
		while(factorNumber<number){
			if(number % factorNumber == 0){
				//System.out.println(factorNumber + " is a factor of " + number);
				sum+=factorNumber;
				}
			factorNumber++;			
			}

			if(sum==number){
				System.out.println("Perfect number found "+ number);
				//System.out.println("Return 1");
				return 1;
			}

		//System.out.println("Return 0");
		return 0;
	}	

	static int henry(int i, int j){
		int count=0;
		int number = 1;
		int perfectNumber1 = 0;
		int perfectNumber2 = 0;
		while(count!=j){
			if(isPerfectNumber(number) == 1){
				count++;
				if(count==i){
					perfectNumber1=number;
				}
				if(count==j){
					perfectNumber2=number;
				}
			}
			number++;
		}
		System.out.println("PerfectNumber1: " + perfectNumber1);
		System.out.println("PerfectNumber2: " + perfectNumber2);
		System.out.println("Sum of Perfect Number: " + (perfectNumber1+perfectNumber2));
		return (perfectNumber1+perfectNumber2);		
	}

	static int isDivisible(int[] a, int divisor){
		for(int i=0; i<a.length; i++){
			if(a[i]%divisor!=0){
				System.out.println("Return 0");
				return 0;
			}
		}
		System.out.println("Return 1");
		return 1;		
	}

	static int isNUnique(int[] a, int n){
		int sum=0, count=0;
		//System.out.println("n = " +n);
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length;j++){
				//System.out.println(a[i] + " addition " + a[j]);
				sum=a[i]+a[j];
				if(sum==n){
					count++;
				}
			}

		}
		if(count==1 && a[0]==n){
			System.out.println("Return 0 from count==1 && a[0]==n");
			return 0;
		}
		if(count==1){
			System.out.println("Return 1");
			return 1;
		}
		System.out.println("Return 0");
		return 0;
	}
}
