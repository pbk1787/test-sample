package com.example.sample;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculateTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculate calculator = new Calculate();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(5, result); //junit assertion
        assertThat(result).isEqualTo(5); //assertJ assertion

    }

    @Test
    public void 뺄셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;
        Calculate calculator = new Calculate();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(-1, result); //junit assertion
        assertThat(result).isEqualTo(-1); //assertJ assertion

    }

    @Test
    public void 곱셈_연산을_할_수_있다() {
        //given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;
        Calculate calculator = new Calculate();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(6, result); //junit assertion
        assertThat(result).isEqualTo(6); //assertJ assertion

    }

    @Test
    public void 나눗셈_연산을_할_수_있다() {
        //given
        long num1 = 6;
        String operator = "/";
        long num2 = 3;
        Calculate calculator = new Calculate();

        //when
        long result = calculator.calculate(num1, operator, num2);

        //then
        assertEquals(2, result); //junit assertion
        assertThat(result).isEqualTo(2); //assertJ assertion

    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        //given
        long num1 = 6;
        String operator = "x";
        long num2 = 3;
        Calculate calculator = new Calculate();

        //when
        //then
        assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });

    }

}