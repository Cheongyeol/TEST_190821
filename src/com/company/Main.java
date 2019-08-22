package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        for(char RAW = 'A'; RAW <= 'Z'; RAW++){ // 세로 출력 반복문(줄 바꿈)

            //알파벳 초기화
            char Capital = 'A';

            //가로 출력 반복문(알파벳을 카운트범위만큼 순서대로 출력)
            for(int COUNT = 'A'; COUNT <= RAW; COUNT++){
                System.out.print(Capital);
                Capital++;
            }
            System.out.println();
        }
    }
}
