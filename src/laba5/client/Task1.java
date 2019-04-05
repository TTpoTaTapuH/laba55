package laba5.client;

import laba5.compute.Task;

import java.io.Serializable;

public class Task1 implements Task<String>, Serializable {
        private static final long serialVersionUID = 227L;
        private final int[] digits;

        public Task1(int[] digits) {
            this.digits = digits;
        }
        public String execute() {
            return computePi(digits);
        }
        public static String computePi(int[] digits) {
            int list1 = 0, list2 = 0;
            for(int i=0; i<digits.length; i++){
                if(digits[i]%2 == 0 || digits[i]<0){
                    list1+=digits[i];
                }
                if(digits[i]%2 == 1 || digits[i]<0){
                    list2+=digits[i];
                }
            }
            String answer = "Сумма чётных и отрицательных чисел равно: "+list1+"\nСумма нечетных и отрицательных чисел равно: "+list2;
            return answer;
        }
    }
