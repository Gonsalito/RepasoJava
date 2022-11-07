package hojaejercicios2;

import java.util.Arrays;

public class Multimedia {
	
	
	/*Atributos*/
	String titulo;
	String autor;
	double duracion;
	String formato [] = {"wav", "mp3", "wma","avi", "mov", "mp4", "wmv", "swf"};
	
	
	/*Constructores*/
	public Multimedia(String titulo, String autor, double duracion, String[] formato) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
		this.formato = formato;
	}


	/*Metodos*/
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String[] getFormato() {
		return formato;
	}


	public void setFormato(String[] formato) {
		this.formato = formato;
	}


	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + "minutos" + ", formato="
				+ Arrays.toString(formato) + "]";
	}
	
	
	
	
	
	
}
