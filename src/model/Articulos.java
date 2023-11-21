package model;
// Generated Nov 21, 2023 1:50:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Articulos generated by hbm2java
 */
@SuppressWarnings({"rawtypes", "unused"})
public class Articulos  implements java.io.Serializable {


     private String referart;
     private Familias familias;
     private String nomart;
     private Short precio;
     private Set lineasFacturases = new HashSet(0);

    public Articulos() {
    }

	
    public Articulos(String referart, Familias familias) {
        this.referart = referart;
        this.familias = familias;
    }
    public Articulos(String referart, Familias familias, String nomart, Short precio, Set lineasFacturases) {
       this.referart = referart;
       this.familias = familias;
       this.nomart = nomart;
       this.precio = precio;
       this.lineasFacturases = lineasFacturases;
    }
   
    public String getReferart() {
        return this.referart;
    }
    
    public void setReferart(String referart) {
        this.referart = referart;
    }
    public Familias getFamilias() {
        return this.familias;
    }
    
    public void setFamilias(Familias familias) {
        this.familias = familias;
    }
    public String getNomart() {
        return this.nomart;
    }
    
    public void setNomart(String nomart) {
        this.nomart = nomart;
    }
    public Short getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Short precio) {
        this.precio = precio;
    }
    public Set getLineasFacturases() {
        return this.lineasFacturases;
    }
    
    public void setLineasFacturases(Set lineasFacturases) {
        this.lineasFacturases = lineasFacturases;
    }




}


