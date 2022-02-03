/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

//importacion de Date para generar fecha
import java.util.Date;

//@author Jose Colina

//Creacion de clases Person
public class Person {
    //argumentos de la clase
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth = new Date();
    public float height;

    //constructor
    public Person(String name, String lastName1, String lastName2, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.height = height;
    }
     
   //metodos get y set de name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
