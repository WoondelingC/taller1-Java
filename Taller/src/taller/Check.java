
package taller;

//@author jose Colina

//creacion de clase Check
public class Check {
    //argumentos
    protected String nameBeneficiary;
    public int amount;
    public String type;
    private int accountNumber;
    
    //constructor
    public Check(String nameBeneficiary, int amount, String type, int accountNumber) {
        this.nameBeneficiary = nameBeneficiary;
        this.amount = amount;
        this.type = type;
        this.accountNumber = accountNumber;
    }
    //metodos get y set
    public String getNameBeneficiary() {
        return nameBeneficiary;
    }

    public void setNameBeneficiary(String nameBeneficiary) {
        this.nameBeneficiary = nameBeneficiary;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
