class Solution {
    public boolean isPrime(int n){
        for(int i = 2; i*i<=n;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); 
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }

        return count;
    }
}