package com.hana.ex;

import java.io.InputStreamReader;

public class Ex6 {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            System.out.println(inputStreamReader.read());
        } catch (Exception e) {

        }
    }
}
