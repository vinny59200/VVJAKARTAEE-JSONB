/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.vv.jsonb.vvjsonb;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

/**
 *
 * @author Vinny
 */
public class VVJSONB {

    public static void main(String[] args) {

        System.out.println("JSONB demo");

        try ( Jsonb jbCola = JsonbBuilder.create()) {

            Drink cola = Drink.builder().name("Cola").price(4d).build();
            System.out.println("\n\nDrink to proceed:" + cola.toString());

            String jsonDrink = jbCola.toJson(cola);
            System.out.println("\n\nTo JSON: " + jsonDrink);

            Drink dCola = jbCola.fromJson(jsonDrink, Drink.class);
            System.out.println("\n\nFrom JSON: " + dCola + "\n\n\n");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
