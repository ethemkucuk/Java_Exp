/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package örnek.pkg11.pkg2.fizz_buzz_oyunu;

/**
 *
 * @author Monster
 */
public class fizzBuzz {
    void FizzBuzz(){
    for(int x = 1 ; x<101 ; x++){
        if(x % 15 == 0){ System.out.println(" FizzBuzz ");}
        else if(x % 3 == 0){ System.out.print(" Fizz ");}
        else if(x % 5 == 0){ System.out.print(" Buzz ");}
        else { System.out.print(x+ ","); }
    }
    }
    
}
