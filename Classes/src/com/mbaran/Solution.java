package com.mbaran;

/*
Zaimplementuj metodę print
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(konwertujCelsjuszaNaFahrenheita(41));
    }

    public static double konwertujCelsjuszaNaFahrenheita(int celsjusz) {
        return (celsjusz/(5/9)+32);
    }
}