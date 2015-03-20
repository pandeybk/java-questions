/**
 * Created by Aasiz on 3/17/2015.
 */
public class Solutions {

    public static int isBalanced(int[ ] a){
        int length = a.length;
        int balanced = 1;
        for(int i=0;i<length;i++){

            if(i%2==0){
                if(a[i]%2!=0){
                    balanced = 0;
                }
            }else{
                if(a[i]%2==0){
                    balanced = 0;
                }
            }
        }
        //System.out.println("Returning:" + balanced);
        return balanced;
    }

    public static int isOddHeavy(int[ ] a){
        int isOddHeavy = 1;
        int oddCount=0;
        for (int anA : a) {
            if (anA % 2 != 0) {
                oddCount++;
                //System.out.println("COMP:"+a[i]);
                for (int anA1 : a) {
                    //System.out.println("WITH:"+a[j]);
                    if (anA1 % 2 == 0 && anA1 > anA) {
                        isOddHeavy = 0;
                    }
                }
            }
        }
        if(oddCount==0){ isOddHeavy = 0;}
        return isOddHeavy;
    }

    public static int isNormal(int n){
        int isNormal = 1;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                if(i%2!=0 && i!=n && i!=1){
                    isNormal=0;
                }
            }

        }
        return isNormal;
    }


    public static int isPascal(int n){
        int isPascal = 1;
        int j=0;
        int sum = 0;
        while(sum<n){
            sum=sum+j;
            j++;
        }
        if(sum!=n) isPascal = 0;


        return isPascal;
    }


    public static int isMeeraArray(int[ ] a){
        for (int anA : a) {
            //System.out.println("A"+ anA);
            if(anA==1){
                for (int b : a) {
                    //System.out.println(b);
                    if(isPrime( b)){
                        return 1;
                    }
                }

            }
        }
        return 0;

    }




    public static int isSuff(int[ ] a){
        for (int anA : a) {
            //System.out.println("A"+ anA);
            boolean passed = false;
            for (int aB : a) {
                if(anA==aB+1 || anA == aB-1){
                    passed = true;
                }
            }
            if(!passed){
                return 0;
            }
        }
        return 1;

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
