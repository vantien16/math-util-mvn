/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thangcay.mathutil.main;

import static com.thangcay.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Testcase #1 
        int n = 0;
        long expected = 1;//Muốn hàm trả về n!=0! phải trả về 1
        long actual = getFactorial(n);//Ý nói rằngh àm chạy ra mấy, invoke, call

        // so sánh giữa expec và actual
        System.out.println(n + "! -> expected: " + expected + "| actual= " + actual);

        
        //TEST CASE #2:
        n=1;
        expected =1;
        actual=getFactorial(n);
                System.out.println(n + "! -> expected: " + expected + "| actual= " + actual);
                
        //TEST CASE #3:
        n=5;
        expected =120;
        actual=getFactorial(n);
                System.out.println(n + "! -> expected: " + expected + "| actual= " + actual);

    }
    //Minh la dev, minh phai test code cua minh ngon truoc da
    //Muuon test code (Dev) hay test app(QC/tester) thi can phai chuan bi testcase- tinh huong kiem thu- ban` ve bo data
    // 1 test case co cau truc nhu sau:

    //Testcase co cau truc nhu sau:
    //Id | Description| Step/Procedures | Expected Result   | Status(Passed, Failed)
    //DEV em muon kiem thu coi chinh em viet getFactorial dung hay sai thi em phai thiet ke cac testcase
    
    //Test Case #1: Verify getFactorial (with n=0)
    //Steps-Procedures: Cac buoc run app de test
    //  1. Given n-0
    //  2. Executte/ Call/ Invoke function geFactorial(0)
    //Expected Resuld: the function must return 1 (stading for 0!=1)
    //Status: PASSED , or FAILED, ai biet, cho run app/ ham moi biet
    //Run ham, run app, dua test data vao, duoc goi la test run
    
    //Testcase #2: Verify getFactorial(with n-1)
    /*Steps/Procedures:
        1. Give n-1
        2. Call/invoke get Factorial (n=1)
    
    Expected result:
        the method must return 1 in case of 1!
    Status : PASSED | FAILED
    */
    
    //Testcase #3: Verify getFactorial(with n-5)
    /*Steps/Procedures:
        1. Give n-1
        2. Call/invoke get Factorial (n=5)
    
    Expected result:
        the method must return 120 in case of 5!
    Status : PASSED | FAILED
    */
}
