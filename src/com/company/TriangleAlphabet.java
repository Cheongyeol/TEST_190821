package com.company;

public class TriangleAlphabet {
    public static void main(String[] args) {

        char chr; //출력 알파벳
        char COUNT = 'A'; // 출력 판단용
        boolean reverse = false;// 출력 증감용

        //세로 출력 반복문(줄 바꿈)
        while (COUNT >= 'A'){

            //가로 출력 반복문
            for(chr = 'A'; chr <= COUNT; chr++){
                System.out.print(chr);
            }
            System.out.println();
            if(COUNT == 'Z'){
                reverse = true;
            }
            if (reverse == false){
                COUNT++;
            }
            else{
                COUNT--;
            }
        }
    }
}
