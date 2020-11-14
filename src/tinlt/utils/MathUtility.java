/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinlt.utils;

/**
 *
 * @author Ray Khum
 */
public class MathUtility {
    // class nay fake class của math cua JDK
    // math cua JDK co .abs() .sqrt() , .sin() .PI
    //chung toan la static, vi la thu vien dung chung
    public static final double PI = 3.1415;
    
    //hàm tính giai thừa : n! = 1*2*3*4*..*n;
    //0! = 1! = 1
    //minh khong tinh dc giai thua am 
    // 21! cuc lon, tran kieu long, chua khong noi
    // int: toi da 2ty 1 may
    //ham tinh gia thua trong gioi han dau vao tu 0..20
    public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if(n==0 || n==1){
            return 1;
        }
        // k sai else
        long result = 1;
        //doan nay n = 2-20
        for (int i = 2; i <= n; i++){
            result *=i;
        }
        return result;
    }
    
     public static void main(String[] args) {
        // test ham 
        long expected = 120; // t mong gọi 120 neu goi ham giai thừa
        long actual = MathUtility.getFactorial(5);
        System.out.println("5!: expected:"+expected+ "; Actual: "+actual);
        
        // expected 720 if tinh 6!
        System.out.println("6!: "+MathUtility.getFactorial(6));
        
        // expected 1 if tinh 0!
        System.out.println("0!: "+MathUtility.getFactorial(0));
        
        //expected: IllegalArgumentException
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
        
    }
}
