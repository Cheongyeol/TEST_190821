package com.company;

public class ReverseTriangle {
    public static void main(String[] args){
        //줄 바꿈 카운트(공백 출력용)
        int rawCount = 0;

        //세로 출력 반복문(줄 바꿈)
        for(char RAW = 'Z'; RAW >= 'A'; RAW--){

            //공백 출력 반복문
            for(int i = 0; i < rawCount; i++){
                System.out.print(' ');
            }

            //알파벳 출력
            for(char Capital = 'A'; Capital <= RAW; Capital++){
                System.out.print(Capital);
            }

            System.out.println();

            rawCount++;//줄 바꿈 카운트 증가
        }
    }
}
