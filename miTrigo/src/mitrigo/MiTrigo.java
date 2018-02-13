/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitrigo;

public class MiTrigo {

   public class Calculadora {

   protected int x;

       
    private int y;
    private int r;
    protected int operando1;
    private int operando2;
    private int s;

        public int getS() {
            return s;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setOperando1(int operando1) {
            this.operando1 = operando1;
        }

        public void setOperando2(int operando2) {
            this.operando2 = operando2;
        }

        public int getR() {
            return r;
        }
       
       
    
    void sumar(){
    r=x+y;
    }
    
    void restar(){
    if(x<y){
        int a;
        a=x;
        x=y;
        y=a;
    }
    
    if (x<0){
        x=-x;
        y=-y;
    }
    
    r=x-y;
    }    
         
     }
    
    } 
   
