package micalculadora;
public class Principal {
    
    
    public static void main (String[]args){
     
        CalculadoraTrigonometrica miTrigo = new CalculadoraTrigonometrica();
        
        
        
        Scaner miEscaner;
                
        miEscaner=new Scaner(System.in);

int entrada;


entrada=miEscaner.nextint();
miTrigo.sety(entrada);

miTrigo.sumar();

System.out.printin(miTrigo.getR());

        
    

    }