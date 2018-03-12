/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n;
        System.out.println("Digite el numero");
        n = sc.nextBigInteger();
        System.out.println(fibonacci(n));
    }
    
    public static BigInteger fibonacci(BigInteger n){
        if(n.compareTo(BigInteger.ONE) <= 0){
            return n;
        }
        BigInteger fib = new BigInteger("1");
        BigInteger ant = new BigInteger("1");
        BigInteger tem;
        for(BigInteger i = (new BigInteger("2")); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)){
            tem = fib;
            fib = fib.add(ant);
            ant = tem;
        }
        return fib;
    }
    
}
