package Maths;

public class FindingDivisors {
    public static void main(String[] args) {
        int n=7;
        int x=2;
        int count=0;
        for (int i = 1; i <=n ; i++) {
            int countfactors=0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    countfactors++;
                }
            }
            if(countfactors==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
