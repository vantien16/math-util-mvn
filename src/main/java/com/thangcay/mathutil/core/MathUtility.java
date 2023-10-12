/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thangcay.mathutil.core;

//class này sẽ chứa 1 loạt các hàm static dùng đẻ làm thư viện cho các nơi khcá/ class xài
public class MathUtility {

    public static final double PI = 3.14;
    //public const double Pi=3.14; //C# khong can static vi co const thi ~ final

    //hàm tính n! = 1.2.3..n
    //0! = 1!=1-quy ước
    //ko tính được giao thừa số âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    // Vâyk 21! ko chứa được trong long, tràn kiểu dữ liệu
    //quy ước <0! và <20! ném ngoại lẹ, không tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid value. N must be 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; // ket thuc som neu co the
        }
        long result = 1;// bien tich luy//accumulation
        //song sot den for, chac chan n ==2//20
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
