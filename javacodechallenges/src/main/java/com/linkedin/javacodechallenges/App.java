package com.linkedin.javacodechallenges;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( isComplexPwd("Hello World3!" ));
    }

    private static boolean isComplexPwd(String input){
        int len = input.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        boolean answer = false;
        if(len<6){
            answer = false;
        }else{
            for (int i = 0; i < len; i++) {
                char current = input.charAt(i);
                if(Character.isDigit(current)){
                    numberCount++;
                }
                if (Character.isUpperCase(current)) {
                    upperCaseCount++;
                }
                if (Character.isLowerCase(current)) {
                    lowerCaseCount++;
                }
                
            }

            if(upperCaseCount>= 1 && lowerCaseCount >= 1 && numberCount>= 1){
                answer = true;
            }else{
                answer = false;
            }
            
        }
        return answer;
    }
}
