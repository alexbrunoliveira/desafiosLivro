package com.exampke;

import java.util.Scanner;

/* calcule a distância de queda de
um rato, cujo o sim leve 7,2 segundos                para alcança-lo.*/

public class Sound {

  public static void main(String[] args) {
    double dist;
    double eco;
    double time;

    Scanner sc = new Scanner(System.in);

    dist = 7.2 * 1100;
    System.out.println("The light is " + dist + " free way");

    System.out.println(
        "The program will measure the object's distance compared to a fictitious wall.");

    System.out.println("How long did it take for you");

    time = sc.nextDouble();

    eco = time * time / 2;

    System.out.println("The target distance is : " + eco);
  }
}
