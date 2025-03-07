class Solution {
    public int[] closestPrimes(int left, int right) {

        List <Integer> primes =new ArrayList<>();

        for(int i=left;i<=right;i++)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }


        }
        return primes.size()<2 ? new  int[]{-1,-1}: new int[]{primes.get(0),primes.get(1)};
        
    }
    public static boolean isPrime(int n){
        if (n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
    }
}