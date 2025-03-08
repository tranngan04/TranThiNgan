package com.example.ph56146_tranthingan;

public class TinhTong {
    public int TinhTongSoChan(int[] arrNumber){
        if (arrNumber == null || arrNumber.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng");
        }

        int tong = 0;
        for (int i : arrNumber) {
            if (i % 2 == 0 && i % 6 != 0) {
                tong += i;
            }
        }
        return tong;
    }











}
