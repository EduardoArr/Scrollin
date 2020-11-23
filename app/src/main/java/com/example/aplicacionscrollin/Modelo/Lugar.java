package com.example.aplicacionscrollin.Modelo;


public class Lugar {

    private String nombre;
    private String direccion;
    private Geopunto geopunto;
    private String foto;
    private int telefono;
    private String url;
    private tipoLugar tipo;
    private  String comentario;
    private long fecha;
    private  float valoracion;

    private Geopunto posicion;

    public Lugar(){
        fecha = System.currentTimeMillis();

    }

    public Lugar(String nombre, String direccion, double longitud,
                 double latitud, int telefono, String url, String comentario,
                 float valoracion, tipoLugar tipo) {

        fecha = System.currentTimeMillis();
        posicion = new Geopunto(longitud, latitud);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public  Geopunto getGeopunto() {
        return geopunto;
    }

    public void setGeopunto(Geopunto geopunto) {
        this.geopunto = geopunto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
