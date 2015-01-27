public class Pelicula extends Rodaje implements Camara{
    
    public void setGrabar(boolean grabar){
        this.grabar = grabar;
    }
    public boolean getGrabar() {
		return grabar;
	}
	public void setTitulo(String titulo){
	    this.titulo = titulo;
	}
	public String getTitulo(){
	    return titulo;
	}
} 