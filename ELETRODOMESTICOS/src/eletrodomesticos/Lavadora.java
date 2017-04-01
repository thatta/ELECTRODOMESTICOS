/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletrodomesticos;

/**
 *
 * @author Juan Ojeda
 * @author Tatiana Almansa
 */
    public class Lavadora extends Electrodomestico{
    private double carga;
    
    /**
     * carga por defecto
     */
    public Lavadora() {
        super();
        this.carga = 5;
    }
    /**
     * constructor para precio base y peso
     * @param precioBase
     * @param peso 
     */
    public Lavadora(float precioBase, int peso) {
        super();
        this.precio_base=precioBase;
        this.peso=peso;
    }

   /**
    * constructor 
    * @param carga
    * @param precio_base
    * @param peso
    * @param color
    * @param consumo 
    */
    public Lavadora(double carga, float precio_base, int peso, Colores color, Consumo consumo) {
        super(precio_base, peso, color, consumo);
        this.carga = carga;
    }
       
    @Override
    public void darDatos(){
        super.darDatos();
        
        if (carga>30){
         precio_final=precio_final+50;}
        else{
         precio_final=precio_final;}
         System.out.println(" Precio final :"+precio_final);
         System.out.println(" Carga:"+this.carga);
    
    }
    
    /**
     * getter y setter de carga
     * @return 
     */
    public double getCarga() {
           return carga;
    }

    public void setCarga(double carga) {
          this.carga = carga;
    }

  
    
}
    
    
