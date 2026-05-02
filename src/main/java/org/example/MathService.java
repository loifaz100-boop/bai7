package org.example;

/**
 * Lớp dịch vụ toán học đơn giản để kiểm tra Code Coverage.
 */
public class MathService {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
}