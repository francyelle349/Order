package PedidoComposicao;

import java.time.LocalDate;
import java.time.LocalDate;

public class Client {
    private String nameOfTheCLient;
    private String email;
    private LocalDate birthDate;

    public Client(){

    }

    public Client(String nameOfTheCLient, String email, LocalDate birthDate){
        this.nameOfTheCLient = nameOfTheCLient;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
   
    public String getNameOfTheCLient() {
        return nameOfTheCLient;
    }
    public void setNameOfTheCLient(String nameOfTheCLient) {
        this.nameOfTheCLient = nameOfTheCLient;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    @Override
public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Name of the client:"+getNameOfTheCLient());
    sb.append("("+ getBirthDate()+ ")"+ " ");
    sb.append("-"+getEmail()+ "\n");

    return sb.toString();
}
}

