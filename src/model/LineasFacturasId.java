package model;
// Generated Nov 21, 2023 1:50:06 PM by Hibernate Tools 4.3.1



/**
 * LineasFacturasId generated by hbm2java
 */
public class LineasFacturasId  implements java.io.Serializable {


     private String referart;
     private String numfac;

    public LineasFacturasId() {
    }

    public LineasFacturasId(String referart, String numfac) {
       this.referart = referart;
       this.numfac = numfac;
    }
   
    public String getReferart() {
        return this.referart;
    }
    
    public void setReferart(String referart) {
        this.referart = referart;
    }
    public String getNumfac() {
        return this.numfac;
    }
    
    public void setNumfac(String numfac) {
        this.numfac = numfac;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LineasFacturasId) ) return false;
		 LineasFacturasId castOther = ( LineasFacturasId ) other; 
         
		 return ( (this.getReferart()==castOther.getReferart()) || ( this.getReferart()!=null && castOther.getReferart()!=null && this.getReferart().equals(castOther.getReferart()) ) )
 && ( (this.getNumfac()==castOther.getNumfac()) || ( this.getNumfac()!=null && castOther.getNumfac()!=null && this.getNumfac().equals(castOther.getNumfac()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getReferart() == null ? 0 : this.getReferart().hashCode() );
         result = 37 * result + ( getNumfac() == null ? 0 : this.getNumfac().hashCode() );
         return result;
   }   


}

