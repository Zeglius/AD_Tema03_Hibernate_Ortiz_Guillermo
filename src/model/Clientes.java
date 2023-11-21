package model;
// Generated Nov 21, 2023 1:50:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private String codcli;
     private String nomcli;
     private String apecli;
     private String dni;
     private Set facturases = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(String codcli) {
        this.codcli = codcli;
    }
    public Clientes(String codcli, String nomcli, String apecli, String dni, Set facturases) {
       this.codcli = codcli;
       this.nomcli = nomcli;
       this.apecli = apecli;
       this.dni = dni;
       this.facturases = facturases;
    }
   
    public String getCodcli() {
        return this.codcli;
    }
    
    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }
    public String getNomcli() {
        return this.nomcli;
    }
    
    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }
    public String getApecli() {
        return this.apecli;
    }
    
    public void setApecli(String apecli) {
        this.apecli = apecli;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Set getFacturases() {
        return this.facturases;
    }
    
    public void setFacturases(Set facturases) {
        this.facturases = facturases;
    }




}


