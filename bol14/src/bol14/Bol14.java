/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol14;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas obx1 = new ConversorTemperaturas();
        try {
            obx1.centFharenheit(20);
        } catch (TemperaturaErradaExcepcion e) {
            System.out.println("Erro " + e.getMessage());
        }
        try {
            obx1.centReamur(80);
        } catch (TemperaturaErradaExcepcion e1) {
            System.out.println("Erro " + e1.getMessage());
        }

    }

}
