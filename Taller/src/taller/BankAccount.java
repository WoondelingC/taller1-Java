
package taller;

//@author Jose Colina
//clase BankAccount
public class BankAccount {
    //declarando argumentos
    private int accountNumber;
    protected boolean activated;

    //metodos de la clase 
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}
