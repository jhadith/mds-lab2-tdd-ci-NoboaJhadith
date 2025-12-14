/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.tdd.stringcalculatorkata;

public class StringCalculator {
    
  public int add(String numbers) {
     if (numbers.isEmpty()) return 0;

    String delimitador = ",|\n";

    if (numbers.startsWith("//")) {
        delimitador = numbers.substring(2, 3);
        numbers = numbers.substring(4);
    }

    String[] partes = numbers.split(delimitador);
    int suma = 0;

    for (String p : partes) {
        suma += Integer.parseInt(p);
    }
    return suma;
    }
}
