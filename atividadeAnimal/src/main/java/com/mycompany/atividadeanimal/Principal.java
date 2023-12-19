/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividadeanimal;

import Animal.Cachorro;
import Animal.Cavalo;
import Animal.Preguica;
import Animal.Veterinario;

/**
 *
 * @author sabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        Veterinario veterinario = new Veterinario();
        
        cachorro.emiteSom();
        cavalo.emiteSom();
        preguica.emiteSom();
        veterinario.examinar(preguica);
    }
}
