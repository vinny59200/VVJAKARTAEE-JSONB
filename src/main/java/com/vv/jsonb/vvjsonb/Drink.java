/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vv.jsonb.vvjsonb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Vinny
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Drink {
    private String name;
    private Double price;
    
}
