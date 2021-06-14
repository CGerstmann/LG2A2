package exercicio4.supermercado;

import java.util.Date;

public class User
{

    //immutable states
    final int cpf; //unique key
    String fatherName;
    String motherName;
    Date birthDate;

    //mutable states
    String name;
    String sex;
    Adress adress;
    Boolean hasCard;
    int realizedPurchase;

    //constructor
    public User(int cpf, String name, String fatherName,String motherName, Date birthDate, String sex)
    {
        this.cpf = cpf;
        this.name = name;
        this.fatherName = "";
        this.motherName = "";
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public boolean changeAdress(Adress newAdress)
    {

        this.adress = newAdress;
        return true;
    }

    public int realizedPurchase()
    {
        this.realizedPurchase = this.realizedPurchase + 1;
        return this.realizedPurchase;
    }
}