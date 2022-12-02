/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.tresenraya01.modelo;

import lombok.Data;

@Data
public class ResultadoTO {
    public int idresultado, punto;
    public String nombrepartida, nombrejugador1, nombrejugador2, ganador, estado;
}
