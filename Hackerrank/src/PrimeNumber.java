		
public class PrimeNumber {
	public static void main(String[] args) {
        long first = 1;
        long last = 100;
        int count=0;
        for(long i=first;i<=last;i++){
            if(isMegaPrime(String.valueOf(i))){
                count++;
            }else{
            	System.out.println(i);
            }
        }
        System.out.println(count);
        
    }
    
    private static boolean isMegaPrime(String num){
        boolean isMegaPrime=false;
        boolean isNumPrime = false;
        boolean isDigitPrime = false;
        long n = Long.parseLong(num);
        if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0){
        	isNumPrime=true;
        }
        else if(n==2 || n == 3 || n==5 || n==7){
        	isNumPrime = true;
        }
        int primeCount = 0;
        for(int c=0;c<num.length();c++){
        	int ne = Character.getNumericValue(num.charAt(c));
        	if(ne%2!=0 && ne%3!=0){
        		primeCount++;
        	}
        	else if(n==2 || n==3){
        		primeCount++;
        	}
        }
        if(num.length()==primeCount){
        	isDigitPrime = true;
        }
        return isMegaPrime=isNumPrime && isDigitPrime;
    }
}
