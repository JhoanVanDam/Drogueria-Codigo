/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Jhoan
 */
public class ClaseFactura {
    
    private String Valor;
    private String Tipo;
    private String Ncuenta;
    private String Ciudad;
    private String fecha;
    private String Nfactura;
    ConexionDB db = new ConexionDB();
    Rut rut = new Rut();
   
    
    public ClaseFactura(String Valor, String Tipo, String Ncuenta) throws SQLException {
        
        db.conexion();
        
        this.Valor = Valor;
        this.Tipo = Tipo; //Consignacion = 1 & Retiro =2;
        this.Ncuenta = Ncuenta;
        this.Ciudad = this.Ubicacion();
        this.fecha = new Date().toString();
        this.Nfactura = this.Factura();
        
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getNfactura() {
        return Nfactura;
    }
    
    public void setNfactura(String Nfactura) {
        this.Nfactura = Nfactura;
    }
    
    public ClaseFactura() {
        
    }
    
    public String getValor() {
        return Valor;
    }
    
    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    public String getTipo() {
        return Tipo;
    }
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public String getNcuenta() {
        return Ncuenta;
    }
    
    public void setNcuenta(String Ncuenta) {
        this.Ncuenta = Ncuenta;
    }
    
    public String getCiudad() {
        return Ciudad;
    }
    
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    private String Ubicacion() throws SQLException {
        int numero = (int) (Math.random() * 1000);
        System.out.println(numero);
        String Consulta = ("SELECT ciud_descripcion FROM Ciudad where ciud_id =" + numero + ";");
        
        try {
            
            ResultSet RESPUESTA = db.consultar(Consulta);
            String Ciudad = RESPUESTA.getString("ciud_descripcion");
            return "Corresponsal N°" + numero + " " + Ciudad;
        } catch (Exception e) {
            System.out.println("No se encontro la ciudad" + e);
            return null;
        }
    }
    
    private String Factura() {
        int random = (int) (Math.random() * 1000000);
        return ("N.Factura:" + random);
    }
    
}
