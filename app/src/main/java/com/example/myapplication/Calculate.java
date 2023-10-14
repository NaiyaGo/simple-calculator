package com.example.myapplication;

import java.util.*;

public class Calculate {

    //stack是用Java的array list类自己实现的
    public static double summary(String s){
        Stack<Double> nums =new Stack<Double>();
        nums.push(0.0);
        Stack<Character>chars=new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                double num = ch - '0'; // 将字符转换为数字
                int j=0;
                while (i + 1 < s.length() && (Character.isDigit(s.charAt(i+1))||s.charAt(i+1)=='.')) {
                    if(s.charAt(i+1)!='.'){num = num * 10 + (s.charAt(i+1) - '0'); }
                    else if (s.charAt(i+1)=='.'&&s.charAt(i)!='.')j=i+1;// 处理多位数
                    i++;
                }
                if(j!=0)num=num/(Math.pow(10,i-j));
                nums.push(num); // 将数字压入操作数栈
            } else if (ch == '(') {
                chars.push(ch); // 将左括号直接压入运算符栈
            } else if (ch == ')') {
                // 处理右括号
                while (chars.peek() != '(') {
                    char operator = chars.pop();
                    double num2 = nums.pop();
                    double num1 = nums.pop();
                    double result = calculate(num1, num2, operator);
                    nums.push(result);
                }
                chars.pop(); // 弹出左括号
            } else if (isOperator(ch)) {
                // 处理运算符
                while ((!chars.isEmpty()) && priority(chars.peek())>=priority(ch)) {
                    /*
                    *  12+35*46-6*7
                    *  12,35,46
                    *  +,-
                    * */
                    char operator = chars.pop();
                    double num2 = nums.pop();
                    double num1 = nums.pop();
                    double result = calculate(num1, num2, operator);
                    nums.push(result);
                }
                if(!isOperator(s.charAt(i-1)))chars.push(ch); // 将新的运算符压入栈
            }
        }

// 处理剩余运算符
        while (!chars.isEmpty()) {
            char operator = chars.pop();
            double num2 = nums.pop();
            double num1 = nums.pop();
            double result = calculate(num1, num2, operator);
            nums.push(result);
        }
        return nums.peek(); // 最终的计算结果

    }
    public static int priority(char a){
        if((a=='*'||a=='/'))return 2;
        if(a=='+'||a=='-')return 1;
        return 0;
    }
    public static boolean isOperator(char c){
        if((c=='+')||(c=='-')||(c=='*')||(c=='/')) {
            return true;
        }
        return false;
    }
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
