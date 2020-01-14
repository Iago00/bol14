/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol14;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class ConversorTemperaturas {

    Scanner sc = new Scanner(System.in);
    private float temperaturaCelsius = 80;

    public float centFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < temperaturaCelsius) {
            throw new TemperaturaErradaExcepcion("A temperatura non pode ser maior que " + temperaturaCelsius + "ºC");
        }
        float Fharenheit = (float) (9 / 5 * centigrados + 32.4);
        System.out.println(Fharenheit);
        return Fharenheit;
    }

    public void centReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < temperaturaCelsius) {
            throw new TemperaturaErradaExcepcion("A temperatura non pode ser maior que " + temperaturaCelsius + "ºC");
        }
        float Reamur = (float) (4 / 5 * centigrados);
        System.out.println(Reamur);
    }
}
