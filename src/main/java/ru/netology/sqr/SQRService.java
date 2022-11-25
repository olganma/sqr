package ru.netology.sqr;

public class SQRService {
    public int countSqr(long lowLimit, long upLimit) {

        int qtySqr = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLimit & i * i <= upLimit) {
                qtySqr++;
            }
        }

        return qtySqr;
    }
}


