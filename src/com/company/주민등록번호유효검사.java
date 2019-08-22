package com.company;

import java.util.Scanner;

public class 주민등록번호유효검사 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요^^");
        String ID = scan.next();
        //입력받은 주민등록번호
        int inputID[] = new int[13];
        //유효검사 계산 수
        final int validIDcheck[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        //주민등록번호와 유효검사 계산 수의 각 자리값의 합
        int IDsumVALID[] = new int[12];
        //IDsumVALID의 각 값들의 합
        int IDsumVALIDfinal = 0;
        //입력받은 주민등록번호를 배열에 저장
        for(int i = 0; i < ID.length(); i++) {
            inputID[i] = Character.getNumericValue(ID.charAt(i));
        }
        //주민등록번호와 유효검사 계산 수의 각 자리값을 더함
        for(int i = 0; i < IDsumVALID.length; i++){
            IDsumVALID[i] = inputID[i] * validIDcheck[i];
        }
        //각 자리값들을 더함
        for(int i = 0; i < IDsumVALID.length; i++){
            IDsumVALIDfinal += IDsumVALID[i];
        }
        //체크 계산 (11을 더해줌)
        if (11 - (IDsumVALIDfinal % 11) == inputID[12]){
            System.out.println("유효한 주민등록번호입니다:)");
        }
        else{
            System.out.println("유효하지 않은 주민등록번호입니다:(");
        }
    }
}
