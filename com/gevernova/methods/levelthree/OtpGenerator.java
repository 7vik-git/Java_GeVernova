package com.gevernova.methods.levelthree;
import java.util.Arrays;
public class OtpGenerator {

    static int numberOfOtps = 10;
    static int[] otps = new int[numberOfOtps]; //to store OTP's

//    Check if Otp is Unique
    public static boolean checkUnique(int num){
        for(int i=0;i<10;i++){
            if(otps [i]==num) return false;
        }
        return true;
    }
// generate random OTP's
    public static void generateOtp(){
        int index = 0;
        while(index <10) {
            int otp = (int) (100000 + Math.random() * 900000);
            boolean isUnique = checkUnique(otp);
            if(isUnique){
                otps[index] = otp; //store OTP in array
                index++;
            }
        }
    }

    public static void main(String[] args) {
        generateOtp();
        System.out.println(Arrays.toString(otps));

    }
}
