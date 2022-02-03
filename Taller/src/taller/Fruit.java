
package taller;

//@author Jose Colina

//creando la clase Fruit
public class Fruit {
    //declarando sus argumentos
    public String name;
    private float averageWeight;
    public String[] colors = {"Roja", "Verde"};
    
    //creo constructor para dar valores
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
    }
    
    //agregando los metodos Get y Set del ArrayList colors
    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }
    
}

