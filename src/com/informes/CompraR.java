/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.informes;

/**
 *
 * @author Ariel
 */
public class CompraR {
    private int id;
    private String funcionario;
    private String proveedor;
    private String fecha;
    private String articulo;
    private int cantidad;
    private long importe;

    public CompraR(int id, String funcionario, String proveedor, String fecha, String articulo, int cantidad, long importe) {
        this.id = id;
        this.funcionario = funcionario;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getImporte() {
        return importe;
    }

    public void setImporte(long importe) {
        this.importe = importe;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    
}
