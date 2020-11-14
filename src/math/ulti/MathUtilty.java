/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.ulti;

/**
 *
 * @author VY
 */
public class MathUtilty {

    //class nay fake calss math truyen thong
    //math cua jdk co .abs() .sqrt() .sin() .PI
    //chung toan la static , vi la thu vien dung chung
    public static final double PI = 3.1415;

    // ham tinh giai tua n!
    //0!=1!=1
    // minh khong tinh duoc giai thua am
    //21! cuc lon, tran kieu long, chua k noi
    //int toi da 2 ty may
    // ham giai thua minh viet se trong gioi han đầu vào từ 0->20
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n mút be between 0 -> 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
