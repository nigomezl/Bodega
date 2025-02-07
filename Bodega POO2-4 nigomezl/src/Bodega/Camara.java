
package Bodega;

import java.util.*;

public class Camara {
    String Dispositivo;
    String Empresa;
    int Resolucion;
    int FPS;
    int Precio;
    int Dimension;
    int Cantidad;
    
    Camara(String D, String E, int R, int F, int T, int P, int C){
        Dispositivo = D;
        Empresa = E;
        Resolucion = R;
        FPS = F;
        Precio = P;
        Dimension = T;
        Cantidad = C;
    }
    public static void main(String[] args) {
        Camara GPro = new Camara("Gpro", "HP", 20, 60, 1000, 20, 20);
        System.out.println(GPro);
    }
    
    public String getDispositivo() {
        return Dispositivo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public int getResolucion() {
        return Resolucion;
    }

    public int getFPS() {
        return FPS;
    }

    public int getDimension() {
        return Dimension;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setDispositivo(String Dispositivo) {
        this.Dispositivo = Dispositivo;
    }

    public void setDimension(int Dimension) {
        this.Dimension = Dimension;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public void setFPS(int FPS) {
        this.FPS = FPS;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }
}
