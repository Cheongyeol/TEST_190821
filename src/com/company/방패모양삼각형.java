package com.company;

public class 방패모양삼각형 {
    public static void main(String[] args) {
        char chr = 'A'; //For 알파벳 출력
        char COUNT = 'A'; //For 알파벳 출력 길이 판단
        boolean reverse = false; //For 알파벳 출력 증감
        // 세로 출력 반복문 (줄 바꿈)
        while (COUNT >= 'A') {
            //좌측 알파벳 출력
            for (chr = 'A'; chr <= COUNT; chr++) {
                System.out.print(chr);
            }
            //공백 출력
            for (char BlankCount = COUNT; BlankCount < 'Z'; BlankCount++) {
                System.out.print(' ');
                System.out.print(' ');
            }
            //우측 알파벳 출력
            for (chr = COUNT; chr >= 'A'; chr--) {
                System.out.print(chr);
            }

            System.out.println();

            if(COUNT == 'Z'){
                reverse = true;
            }
            if(reverse == false){
                COUNT++;
            }
            else{
                COUNT--;
            }
        }
    }
}
