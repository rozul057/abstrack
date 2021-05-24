/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrack;


class operasipembagian extends operasibilangan{
    
     @Override
    protected void setA(double a){
        this.a = a;
    }
    
     @Override
    protected void setB(double b){
        this.b = b;
    }
    
     @Override
    protected void setC(){
        this.c = c;

    }
    
    @Override
    protected double getA(){
        return a;
    }
    
     @Override
    protected double getB(){
        return b;
    }
    
     @Override
    protected double getC(){
        return c = a/b;
    }
    
     @Override
    protected void tampil(){
        System.out.println(" -- pembagian -- ");
        System.out.println("A = "+ this.getA());
        System.out.println("B = "+ this.getB());
        System.out.println("A / B = "+this.getC());
    } 
    
    
}
