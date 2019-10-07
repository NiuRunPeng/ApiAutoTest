package com.course.testng;

import java.util.Scanner;

public class BasicAnnotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        StringBuilder stringBuilder = new StringBuilder();
        try {
            float x = scanner.nextFloat();
            stringBuilder.append(x);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("请输入正确的数字");
        }
        String s = stringBuilder.toString();
        String stringLeftNum = s.split("\\.")[0];
        String stringRightNum = s.split("\\.")[1];
        int leftNum = Integer.parseInt(stringLeftNum);
        int rightNum = Integer.parseInt(stringRightNum);
        int leftSum = 0;
        int rightSum = 0;
        while (leftNum != 0) {
            leftSum += leftNum % 10;
            leftNum = leftNum / 10;
        }
        while (rightNum != 0) {
            rightSum += rightNum % 10;
            rightNum = rightNum / 10;
        }
        int sum = leftSum + rightSum;
        System.out.println("sum:" + sum);
        scanner.close();
    }
}
