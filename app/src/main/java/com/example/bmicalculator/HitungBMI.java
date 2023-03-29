package com.example.bmicalculator;

public class HitungBMI {

    public String hitungBMI(double beratBadan, double tinggiBadan) {
        String statusBadan;
        double BMI = beratBadan/((tinggiBadan*tinggiBadan)/10000);
        if(BMI<18.5) {
            statusBadan = "BMI anda = " + BMI + "\nAnda kekurangan berat badan.";
        } else if(BMI>=18.5 && BMI<=24.9) {
            statusBadan = "BMI anda = " + BMI + "\nBerat badan anda normal.";
        } else if(BMI>=25 && BMI<=29.9) {
            statusBadan = "BMI anda = " + BMI + "\nAnda kelebihan berat badan.";
        } else {
            statusBadan = "BMI anda = " + BMI + "\nAnda kegemukan (obesitas).";
        }
        return statusBadan;
    }
}
