
package divyeshlibrary;

import java.util.Scanner;

/**
 * This code is about find out prime numbers.
 * 
 * @author DIVYESH      Last Modified: 19-09-2021
 */
public class PrimeNumber {
    
    // check if give number is prime or not.
    public static void isPrime(){
        int num;
        boolean _isPrime;
        System.out.println("\nEnter positive number that you want to check for prime.");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        
        if(num < 2) _isPrime = false;
        else {
            _isPrime = true;
            int a = (int) Math.sqrt(num);
            for(int i=2; i<=a; i++){
                if((num % i) == 0){
                    _isPrime = false;
                    break;
                } 
            }
        }
        if(_isPrime) System.out.println("\n" + num + " is a prime number");
        else System.out.println("\n" + num + " is not a prime number");
    }
    
    // Logic for prime numbers between given range.
    public static void primesInRange(){
        int start_Index;
        int end_Index;
        boolean _isPrime;
        
        for( ;; ){
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter start number of the range that must be positive.");
            start_Index = scan.nextInt();
            
            System.out.println("Enter end number of the range that must be positive.");
            end_Index = scan.nextInt();
            if(start_Index > end_Index){
                System.out.println("start_Index must be less than end_Index");
                continue;
            }
            else if(start_Index < 1){
                System.out.println("Both numbers should be strictly positive");
                continue;
            }
            else {
                break;
            }
        }
        
        System.out.print("\nPrime numbers between [ " + start_Index + " to " + end_Index + " ] are : ");
        
        for(int num=start_Index; num<=end_Index; num++){
            if(num < 2) _isPrime = false;
            else _isPrime = true;
            int n = (int) Math.sqrt(num);
            for(int i=2; i<=n; i++){
                if((num % i) == 0){
                    _isPrime = false;
                    break;
                }
            }
            if(_isPrime)System.out.print(num + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("*************************Welcome*************************");
        for(;;){
            try{
                System.out.println("\nEnter 1 to check given number is prime :");
                System.out.println("Enter 2 to find all prime numbers between given range :");
                System.out.println("Enter 0 to quit :");
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                if(a == 1) isPrime();
                else if(a == 2) primesInRange();
                else if(a == 0) break;
                continue;
            }
            catch(java.util.InputMismatchException e){
                System.out.println("\n-----Only Numbers are allowed-----");
                continue;
            }
        }     
    }
    
}
