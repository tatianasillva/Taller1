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

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
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
