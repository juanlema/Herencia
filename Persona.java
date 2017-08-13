
public class Persona{
    
    //Declaración de los atributos
    
    String nombre;
    int edad;
    
    public Persona(){
}
// Metodo dormir:
public String dormir(){
    return "Zzzzz";
}

//Metodo comer:
public String comer(){
    return "delicioso";
}

//Setters y Getters.
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
}
