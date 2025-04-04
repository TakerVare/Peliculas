package Model.Dto;

public class Pelicula {

    private String titulo, trailer, sinopsis, fechaEstreno, url;
    private int duracion, nVotos, sPuntuacion, id;
    private Double precio;

    public Pelicula(String titulo, String trailer, String sinopsis, String fechaEstreno,
                    String url, int duracion, int nVotos, int sPuntuacion, int id, Double precio) {
        this.titulo = titulo;
        this.trailer = trailer;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.url = url;
        this.duracion = duracion;
        this.nVotos = nVotos;
        this.sPuntuacion = sPuntuacion;
        this.id = id;
        this.precio = precio;
    }

}
