/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jhoan
 */
public class MetodosDeDB {

    ConexionDB db = new ConexionDB();

    public MetodosDeDB() {
    }

    public Productos consultartodoporResultSet(String idpor) {

        db.conexion();
        String CASOconsultar = "";

        
        CASOconsultar = "select * from Productos where  prod_descripcion like " + "'" + idpor + "' or "+"prod_id"+" = '"+idpor+"';";
        System.out.println(CASOconsultar);
        try {
            ResultSet RESPUESTA = db.consultar(CASOconsultar);

            Productos prod = new Productos(
                    RESPUESTA.getString("prod_descripcion"),
                    RESPUESTA.getString("prod_id"),
                    (RESPUESTA.getString("prod_costo")),
                    (RESPUESTA.getString("prod_venta")),
                    (RESPUESTA.getString("prod_cantidad")),
                    (RESPUESTA.getString("ventas_desde")),
                    (RESPUESTA.getString("prod_fechavencimiento")),
                    (RESPUESTA.getString("prod_ubicacion")));

            System.out.println(RESPUESTA.getString("ventas_desde"));
            return prod;
        } catch (Exception e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar por" + e);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }
    public Productos consultartodoporResultSetVender( String idpor) {

        db.conexion();
        String CASOconsultar = "";
        CASOconsultar = "select * from Productos where prod_id = '"+idpor+ "' or prod_descripcion like '" + idpor+ "';";
        System.out.println(CASOconsultar);
        try {
            ResultSet RESPUESTA = db.consultar(CASOconsultar);

            Productos prod = new Productos(
                    RESPUESTA.getString("prod_descripcion"),
                    RESPUESTA.getString("prod_id"),
                    (RESPUESTA.getString("prod_costo")),
                    (RESPUESTA.getString("prod_venta")),
                    (RESPUESTA.getString("prod_cantidad")),
                    (RESPUESTA.getString("ventas_desde")),
                    (RESPUESTA.getString("prod_fechavencimiento")),
                    (RESPUESTA.getString("prod_ubicacion")));

            System.out.println(RESPUESTA.getString("ventas_desde"));
            return prod;
        } catch (Exception e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar por" + e);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public ArrayList<Productos> consultartodoslosdatos() {
        ArrayList<Productos> Arrprod;
        Arrprod = new ArrayList<>();
        db.conexion();

        try {
            ResultSet RESPUESTA = db.consultar("select * from Productos;");
            while (RESPUESTA.next()) {
                Productos prod = new Productos(
                        RESPUESTA.getString("prod_descripcion"),
                        RESPUESTA.getString("prod_id"),
                        (RESPUESTA.getString("prod_costo")),
                        (RESPUESTA.getString("prod_venta")),
                        (RESPUESTA.getString("prod_cantidad")),
                        (RESPUESTA.getString("ventas_desde")),
                        (RESPUESTA.getString("prod_fechavencimiento")),
                        (RESPUESTA.getString("prod_fechavencimiento")));
                Arrprod.add(prod);
            }

            return Arrprod;
        } catch (Exception e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar por" + e);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public String consultarpor(int consultar, int por, String idpor) {
        db.conexion();
        String CASOconsultar = "";
        String CASOpor = "";

        switch (consultar) {
            case 1:
                CASOconsultar = "prod_id";
                break;
            case 2:
                CASOconsultar = "prod_descripcion";
                break;
            case 3:
                CASOconsultar = "prod_costo";
                break;
            case 4:
                CASOconsultar = "prod_venta";
                break;
            case 5:
                CASOconsultar = "prod_cantidad";
                break;
            case 6:
                CASOconsultar = "ventas_desde";
                break;

        }
        switch (por) {
            case 1:
                CASOpor = "prod_id";
                break;
            case 2:
                CASOpor = "prod_descripcion";
                break;
            case 3:
                CASOpor = "prod_costo";
                break;
            case 4:
                CASOpor = "prod_venta";
                break;
            case 5:
                CASOpor = "prod_cantidad";
                break;
            case 6:
                CASOpor = "ventas_desde";
                break;

        }
        try {
            ResultSet RESPUESTA = db.consultar("select " + CASOconsultar + " from Productos where " + CASOpor + "='" + idpor + "';");
            return RESPUESTA.getString(CASOconsultar);
        } catch (SQLException e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar por" + e);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }
    public String ConsultarVender(String idpor) {
        db.conexion();
       

       
        try {
            ResultSet RESPUESTA = db.consultar("select prod_cantidad from Productos where prod_id = '" + idpor + "' or  prod_descripcion like '" + idpor + "';");
            System.out.println(("select prod_cantidad from Productos where prod_id = '" + idpor + "' or  prod_descripcion like '" + idpor + "';"));
            return RESPUESTA.getString("prod_cantidad");
        } catch (SQLException e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar por" + e);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public String insertar(String idpor) {

        db.conexion();

        try {
            db.insertar(idpor);
            return "Se insertó";
        } catch (Exception e) {

            System.out.println("Error en insertar metodos db" + e);
            return null;
        }

    }
    

    public String EditarPor(int Editar, String par1, int por, String par2) {

        db.conexion();
        String CASOconsultar = "";
        String CASOpor = "";

        switch (Editar) {
            case 1:
                CASOconsultar = "prod_id";
                break;
            case 2:
                CASOconsultar = "prod_descripcion";
                break;
            case 3:
                CASOconsultar = "prod_costo";
                break;
            case 4:
                CASOconsultar = "prod_venta";
                break;
            case 5:
                CASOconsultar = "prod_cantidad";
                break;
            case 6:
                CASOconsultar = "prod_fechavencimiento";
                break;
            case 7:
                CASOconsultar = "ventas_desde";
                break;
        }
        switch (por) {
            case 1:
                CASOpor = "prod_id";
                break;
            case 2:
                CASOpor = "prod_descripcion";
                break;
            case 3:
                CASOpor = "prod_costo";
                break;
            case 4:
                CASOpor = "prod_venta";
                break;
            case 5:
                CASOpor = "prod_cantidad";
                break;
            case 6:
                CASOpor = "prod_fechavencimiento";
                break;
            case 7:
                CASOconsultar = "ventas_desde";
                break;

        }
        try {
            db.Editar("UPDATE Productos set " + CASOconsultar + "= '" + par1 + "' where " + CASOpor + "='" + par2 + "';");
            System.out.println("UPDATE Productos set " + CASOconsultar + "= '" + par1 + "' where " + CASOpor + "='" + par2 + "';");

            return "Editada exitosa";
        } catch (Exception e) {
            System.out.println("Error no se pudo actualizar" + e);
            return null;
        }

    }

    public boolean ExisteoNO(String NombreProducto) {

        db.conexion();
        try {

            ResultSet DOCUMENTO = db.consultar("select prod_descripcion,prod_id from Productos;");
            while (DOCUMENTO.next()) {

                if (DOCUMENTO.getString("prod_descripcion").equalsIgnoreCase(NombreProducto)) {
                    System.out.println("ELPRODUCTO YA EXISTE");
                    return true;
                }
                if (DOCUMENTO.getString("prod_id").equals(NombreProducto)) {
                    System.out.println("ELPRODUCTO YA EXISTE");
                    return true;
                }

            }
            return false;
        } catch (SQLException ex) {

            return false;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public boolean ExisteoNOfactura(String NombreFactura) {

        db.conexion();
        String ConsultaDocumento = ("select fact_numero from Facturas;");

        try {

            ResultSet DOCUMENTO = db.consultar(ConsultaDocumento);
            while (DOCUMENTO.next()) {

                if (DOCUMENTO.getString("fact_numero").equals(NombreFactura)) {
                    System.out.println("LA FACTURA YA EXISTE");
                    return true;
                }

            }
            return false;
        } catch (SQLException ex) {

            return false;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public void Borrar(int Borrar, String id) {
        db.conexion();
        String CASOconsultar = "";
        try {

            switch (Borrar) {
                case 1:
                    CASOconsultar = "prod_id";
                    break;
                case 2:
                    CASOconsultar = "prod_descripcion";
                    break;
                case 3:
                    CASOconsultar = "prod_costo";
                    break;
                case 4:
                    CASOconsultar = "prod_venta";
                    break;
                case 5:
                    CASOconsultar = "prod_cantidad";
                    break;
                case 6:
                    CASOconsultar = "ventas_desde";
                    break;
            }

            this.db.Borrar("delete from Productos where " + CASOconsultar + "=" + "'" + id + "'" + ";");
            System.out.println("Se borró " + id);

        } catch (Exception e) {
            System.out.println("Error en borrar mddb" + e);

        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }
    }

    public void SubirFactura(String ubicacion, String fecha, String numero, String cantidad, String valor, String Descripcion) {
        this.db.conexion();
        try {
            this.db.insertar("insert into Facturas (fact_id,fact_ubicacion,fact_fecha,fact_numero,fact_cantidad,fact_valor,fact_descripcion) values"
                    + "(" + null + ",'" + ubicacion + "','" + fecha + "','" + numero + "','" + cantidad + "','" + valor + "','" + Descripcion + "');");
            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("Error no hizo conexion en subir factura" + e);
        } finally {
            try {
                this.db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public String consultarporFactura(int consultar, int por, String idpor) {
        db.conexion();
        String CASOconsultar = "";
        String CASOpor = "";

        switch (consultar) {
            case 1:
                CASOconsultar = "fact_id";
                break;
            case 2:
                CASOconsultar = "fact_ubicacion";
                break;
            case 3:
                CASOconsultar = "fact_fecha";
                break;
            case 4:
                CASOconsultar = "fact_numero";
                break;
            case 5:
                CASOconsultar = "fact_cantidad";
                break;
            case 6:
                CASOconsultar = "fact_valor";
                break;
            case 7:
                CASOconsultar = "fact_descripcion";
                break;

        }
        switch (por) {
            case 1:
                CASOpor = "fact_id";
                break;
            case 2:
                CASOpor = "fact_ubicacion";
                break;
            case 3:
                CASOpor = "fact_fecha";
                break;
            case 4:
                CASOpor = "fact_numero";
                break;
            case 5:
                CASOpor = "fact_cantidad";
                break;
            case 6:
                CASOpor = "fact_valor";
                break;
            case 7:
                CASOpor = "fact_descripcion";
                break;

        }
        try {
            ResultSet RESPUESTA = db.consultar("select " + CASOconsultar + " from Facturas where " + CASOpor + "='" + idpor + "';");
            return RESPUESTA.getString(CASOconsultar);
        } catch (SQLException e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar porfactura" + e);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }
    public String Dinero() throws SQLException{
        db.conexion();
        try {
            String Dinero=this.db.consultar("select drog_dinero from Drogueria where drog_id = 1;").getString("drog_dinero");
            return Dinero;
        } catch (Exception e) {
            System.out.println("Errro en metodsdb"+e);
            return null;
        }
        finally{
            try {
                db.cerrarconexion();
            } catch (Exception e) {
                System.out.println("Errorfinallydinero"+e);
            }
        }
    }
    public void editarDinero(Double dinero) throws SQLException{
        db.conexion();
        double din = dinero + Double.parseDouble(this.db.consultar("select drog_dinero from Drogueria where drog_id = 1;").getString("drog_dinero"));
        System.out.println("EL dinero din dimodin es"+din);
        try {
            this.db.Editar("update Drogueria set drog_dinero="+din+" where drog_id =1");
        } catch (Exception e) {
            System.out.println("Error en editardinero"+ e);
        
        }
        finally{
            try {
                db.cerrarconexion();
            } catch (Exception e) {
                System.out.println("ERROr"+e);
            }
        }
    }

}
