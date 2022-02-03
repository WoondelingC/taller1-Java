package taller;

//@author Jose Colina

public class Taller {

    public static void main(String[] args) {
        //creacion de objeto de la clase Cards
        Cards card1 = new Cards(12384782, "V8", "Ford", 2000);
        System.out.println(card1.marca);
        
        //creacion de objeto de la clase Check
        Check check1 = new Check("Jose Colina", 2000, "Cheque de Gerencia", 120394827);
        System.out.println(check1.nameBeneficiary);
        
        //creacion de objeto de la clase Animals
        Animals animals1 = new Animals("Luna", "Perro", "cokker");
        System.out.println(animals1.race);
        
        //creacion de objeto de la clase Person
        Person person1 = new Person("Jose", "Colina", "Martinez", 65);
        System.out.println(person1.height);
        
        //creacion de un objeto de la clase Fruit
        Fruit fruit1 = new Fruit("Manzana", 2);
        System.out.println(fruit1.colors[0]);
        
        // creacion de objeto de la clase BankAccount
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.activated);
    }
    
}