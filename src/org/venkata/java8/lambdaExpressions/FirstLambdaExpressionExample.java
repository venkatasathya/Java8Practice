package org.venkata.java8.lambdaExpressions;


@FunctionalInterface  //It is optional
interface Drawable{
    public void draw();
}


    public class FirstLambdaExpressionExample {
        public static void main(String[] args) {
            int width=10;

            //with lambda
            Drawable d2=()->{
                System.out.println("Drawing "+width);
                System.out.println("Tested");
            };
            d2.draw();
        }
    }

