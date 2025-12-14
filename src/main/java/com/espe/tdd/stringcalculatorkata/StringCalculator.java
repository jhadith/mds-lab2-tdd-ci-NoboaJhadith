/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.tdd.stringcalculatorkata;

public class StringCalculator {
    
  public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

    String[] partes = numbers.split("[,\n]");

    int suma = 0;

    for (String p : partes) {
        suma += Integer.parseInt(p);
    }
    return suma;
    }
}
