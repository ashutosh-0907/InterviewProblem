// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int number  = 1010;
        int temp = number;
        int res = 0;
        int base  = 1;
        while(temp > 0){
            int ld = temp % 10;
            temp = temp / 10;
            res+= ld * base;
            base = base * 2;
        }
        System.out.print(res);
    }
}