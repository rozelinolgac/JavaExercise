package MethodsExercise;

public class UsAlma {

    static int Power(int a,int b) {
        int result =1;
        for (int i=1;i<=b;i++) {
            result*=a;

        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(Power(2,3));

    }
}
