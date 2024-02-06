package com.example.sample;

import java.util.Scanner;

public class CalculationRequestReader {

    public CalculationRequest read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers and an operator (e.g 1 + 2):");
        String result = scanner.nextLine();
        return new CalculationRequest(result.split(" "));
    }

}
