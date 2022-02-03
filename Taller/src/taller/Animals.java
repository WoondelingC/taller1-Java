
package taller;

//@author Jose Colina

//Creacion de class Animals
public class Animals {
    //declarando argumentos
   public String name;
   public String species;
   public String race;
   
   //constructor
   public Animals(String name, String species, String race) {
        this.name = name;
        this.species = species;
        this.race = race;
    }
    //metodos get y set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
