package taller;

//@author Jose Colina

//creacion de la clase Cards
public class Cards {
    //declarando argumentos
    private int serial;
    protected String motor;
    public String marca;
    public int power;

    //constructor
    public Cards(int serial, String motor, String marca, int power) {
        this.serial = serial;
        this.motor = motor;
        this.marca = marca;
        this.power = power;
    }
    
    //metodos get y set de marca y power
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
}
