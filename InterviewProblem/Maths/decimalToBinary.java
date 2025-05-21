//   NAIVE METHOD TC = SC = O(logN)

class Main {
    public static void main(String[] args) {
        int n = 17;
        int remainder = 0;
        String res = "";
        while(n>0){
            remainder = n % 2;
            
            res = remainder + res;
            n = n / 2;
        }
        System.out.print(res);
    }
}

// Using Math.pow() Method

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 17;
        int remainder = 0;
        int cnt =0;
        int res =0;
        double power=0;
        while(n>0){
            remainder = n % 2;
            power = Math.pow(10,cnt);
            res += remainder * power;
            cnt++;
            
            n = n / 2;
        }
        System.out.println(remainder);
        System.out.println(power);
        System.out.println(cnt);
        System.out.println(res);
    }
}