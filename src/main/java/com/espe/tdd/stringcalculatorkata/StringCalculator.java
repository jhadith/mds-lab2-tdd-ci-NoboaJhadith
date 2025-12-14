
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
        if (Integer.parseInt(p) < 0) {
    throw new IllegalArgumentException("Negativo no permitido: " + p);
}
    }
    return suma;
    }
}
