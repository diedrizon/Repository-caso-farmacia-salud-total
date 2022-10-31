
package Modelo;

import java.sql.Date;

/** @author diedr*/

public class Class_ventas {
    private int n_factura;  
      private float monto_vt;
      private float cant_vt;
      private Date fh_vt;

    public Class_ventas(float monto_vt, float cant_vt, Date fh_vt) {
        this.monto_vt = monto_vt;
        this.cant_vt = cant_vt;
        this.fh_vt = fh_vt;
    }
    
    public Class_ventas(int n_factura, float monto_vt, float cant_vt, Date fh_vt) {
        this.n_factura = n_factura;
        this.monto_vt = monto_vt;
        this.cant_vt = cant_vt;
        this.fh_vt = fh_vt;
    }

    public int getN_factura() {
        return n_factura;
    }

    public void setN_factura(int n_factura) {
        this.n_factura = n_factura;
    }

    public float getMonto_vt() {
        return monto_vt;
    }

    public void setMonto_vt(float monto_vt) {
        this.monto_vt = monto_vt;
    }

    public float getCant_vt() {
        return cant_vt;
    }

    public void setCant_vt(float cant_vt) {
        this.cant_vt = cant_vt;
    }

    public Date getFh_vt() {
        return fh_vt;
    }

    public void setFh_vt(Date fh_vt) {
        this.fh_vt = fh_vt;
    }
      
    
    
}
