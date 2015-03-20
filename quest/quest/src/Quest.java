/**
 * Created by Aasiz on 3/17/2015.
 */
public class Quest {

    public static void main(String[] args) throws Exception {
        try {//helloyellow
            System.out.println("TESTING:testIsBalanced");
            testIsBalanced();
            System.out.println("**********************");
            System.out.println("TESTING:testIsOddHeavy");
            testIsOddHeavy();
            System.out.println("**********************");
            System.out.println("TESTING:testIsNormal");
            testIsNormal();
            System.out.println("**********************");
            System.out.println("TESTING:testIsPascal");
            testIsPascal();
            System.out.println("**********************");
            System.out.println("TESTING:testIsMeeraArray");
            testIsMeeraArray();
            System.out.println("**********************");
            System.out.println("TESTING:testIsSuffArray");
            testIsSuffArray();

            //"wsc_823747"
        } catch ( final Exception e ) {
            e.printStackTrace();
        }
    }

    /*
    QUESTION 1.
    An array is called balanced if its even numbered elements (a[0], a[2], etc.) are even
    and its  odd numbered elements (a[1], a[3], etc.) are odd.  Write a function named isBalanced that
    accepts an array of integers and returns 1 if the array is balanced, otherwise it returns 0.
    Examples:  {2, 3, 6, 7} is balanced since a[0] and a[2] are even, a[1] and a[3] are odd.
    {6, 7, 2, 3, 12} is balanced since a[0], a[2] and a[4] are even, a[1] and a[3] are odd.
    {7, 15, 2, 3} is not balanced since a[0] is odd. {16, 6, 2, 3} is not balanced since a[1] is even.*/

    private static void testIsBalanced(){
        int[] pass = {0,1,2,3,4,5,6,7,8};
        int[] fail = {1,2,3,4,5,6,7,8};
        int[] pass2 = {0};
        int[] fail2 = {1};
        System.out.println("PASSED:"+(Solutions.isBalanced(pass)==1));
        System.out.println("PASSED:"+(Solutions.isBalanced(fail)==0));
        System.out.println("PASSED:"+(Solutions.isBalanced(fail2)==0));
        System.out.println("PASSED:"+(Solutions.isBalanced(pass2)==1));
    }


    /*
    QUESTION 2.
    An array is defined to be odd-heavy if it contains at least one odd element and every odd element is
    greater than every even element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9)
    are greater than all the even elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element
    10 is greater than the odd element 9.  Write a function called isOddHeavy that accepts an integer array and
    returns 1 if the array is odd-heavy; otherwise it returns 0.  Some other examples: {1} is odd-heavy, {2}
    is not odd-heavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6, 8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not
    odd-heavy. */

    private static void testIsOddHeavy(){
        int[] pass = {11, 4, 9, 2, 8} ;
        int[] fail = {11, 4, 9, 2, 3, 10} ;
        int[] fail2 = {2}  ;
        int[] fail3 = {-2, -4, -6, -8, -11}  ;
        int[] pass2 = {1}  ;
        int[] pass3 = {1, 1, 1, 1}  ;
        int[] pass4 = {2, 4, 6, 8, 11};

        System.out.println("PASSED:"+(Solutions.isOddHeavy(pass)==1));
        System.out.println("PASSED:"+(Solutions.isOddHeavy(pass2)==1));
        System.out.println("PASSED:"+(Solutions.isOddHeavy(pass3)==1));
        System.out.println("PASSED:"+(Solutions.isOddHeavy(pass4)==1));
        System.out.println("PASSED:"+(Solutions.isOddHeavy(fail)==0));
        System.out.println("PASSED:"+(Solutions.isOddHeavy(fail2)==0));
        System.out.println("PASSED:"+(Solutions.isOddHeavy(fail3)==0));

    }

    /*
    QUESTION 3.
    A normal number is defined to be one that has no odd factors, except for 1 and possibly itself. Write a method named
    isNormal that returns 1 if its integer argument is normal, otherwise it returns 0. The function signature is
    int isNormal(int n)
    Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor.
    10 is not a normal number since 5 is an odd factor.
    */
    private static void testIsNormal(){
        for (int i = 0; i <11 ; i++) {
            System.out.println("TESTING FOR"+i+": "+(Solutions.isNormal(i)));
            if(i==6 || i==9|| i==10){
                System.out.println("PASSED:"+(Solutions.isNormal(i)==0));
            }else{
                System.out.println("PASSED:"+(Solutions.isNormal(i)==1));
            }
        }
    }

    /*QUESTION 1. A Pascal number is a number that is the sum of the integers from 1 to j for some j.
    For example 6 is a Pascal number because 6 = 1 + 2 + 3. Here j is 3. Another Pascal number is 15
    because 15 = 1 + 2 + 3 + 4 + 5. An example of a number that is not a Pascal number is 7 because it
    falls between the Pascal numbers 6 and 10. Write a function named isPascal that returns 1 if its
    integer argument is a Pascal number, otherwise it returns 0.*/
    private static void testIsPascal(){
        for (int i = 0; i <16 ; i++) {
            System.out.println("TESTING FOR"+i+": "+(Solutions.isPascal(i)));
            if(i==0|| i==1|| i==3 || i==6 || i==10 || i==15){
                System.out.println("PASSED:"+(Solutions.isPascal(i)==1));
            }else{
                System.out.println("PASSED:"+(Solutions.isPascal(i)==0));
            }
        }
    }


    /*
    2. A Meera array is an array that contains the value 1 if and only if it contains a prime number. The array {7, 6, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 1.  The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does not contain a 1. The array {6, 10, 1} is not a Meera array because it contains a 1 but does not contain a prime number.
     It is okay if a Meera array contains more than one value 1 and more than one prime, so the array {3, 7, 1, 8, 1} is a Meera array (3 and 7 are the primes).
     Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.
    */
    private static void testIsMeeraArray(){
        int[] yes = {7, 6, 10, 1}  ;
        int[] no = {7, 6, 10}  ;
        int[] no2 = {6, 10, 1}   ;
        int[] yes2 = {3, 7, 1, 8, 1}   ;

        System.out.println("PASSED:"+(Solutions.isMeeraArray(yes)==1));
        System.out.println("PASSED:"+(Solutions.isMeeraArray(no)==0));
        System.out.println("PASSED:"+(Solutions.isMeeraArray(no2)==0));
        System.out.println("PASSED:"+(Solutions.isMeeraArray(yes2)==1));

    }


    /*
  3. A Suff array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array.
 For example, {2, 10, 9, 3} is a Suff array because
2 = 3-1
10 = 9+1
3 = 2 + 1
9 = 10 -1
 Other Suff arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
 The array {3, 4, 5, 7} is not a Suff array because of the value 7 which requires that the array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
 Write a function named isSuff that returns 1 if its array argument is a Suff array. Otherwise it returns a 0.

*/
    private static void testIsSuffArray(){
        int[] yes = {2, 10, 9, 3}   ;
        int[] yes2 = {2, 2, 3, 3, 3}   ;
        int[] yes3 = {1, 1, 1, 2, 1, 1}    ;
        int[] yes4 = {0, -1, 1}    ;
        int[] no = {3, 4, 5, 7}   ;
        int[] yes5 = {1,2,4,5}   ;
        int[] no2 = {1,2,4,5,99}   ;

        System.out.println("PASSED:"+(Solutions.isSuff(yes)==1));
        System.out.println("PASSED:"+(Solutions.isSuff(yes2)==1));
        System.out.println("PASSED:"+(Solutions.isSuff(yes3)==1));
        System.out.println("PASSED:"+(Solutions.isSuff(yes4)==1));
        System.out.println("PASSED:"+(Solutions.isSuff(yes5)==1));
        System.out.println("PASSED:"+(Solutions.isSuff(no)==0));
        System.out.println("PASSED:"+(Solutions.isSuff(no2)==0));


    }




}
