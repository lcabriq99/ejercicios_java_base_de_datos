
public class Libro {
	
	private String ISBN;
	private String titulo;
	private String autor;
	private String editorial;
	private String sinopsis;
	private int pagina;
	private String idioma;
	private int anyoPublicacion;
	private int precio;
	private boolean novedad;
	private String categoria;


	public Libro(String iSBN, String titulo, String autor, String editorial, String sinopsis, int pagina, String idioma,
	  int anyoPublicacion, int precio, boolean novedad, String categoria) {
	 super();
	 ISBN = iSBN;
	 this.titulo = titulo;
	 this.autor = autor;
	 this.editorial = editorial;
	 this.sinopsis = sinopsis;
	 this.pagina = pagina;
	 this.idioma = idioma;
	 this.anyoPublicacion = anyoPublicacion;
	 this.precio = precio;
	 this.novedad = novedad;
	 this.categoria = categoria;
	}




	@Override
	public String toString() {
	 return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
	   + ", sinopsis=" + sinopsis + ", pagina=" + pagina + ", idioma=" + idioma + ", anyoPublicacion="
	   + anyoPublicacion + ", precio=" + precio + ", novedad=" + novedad + "categoria" + categoria +"]";
	}




	public String getISBN() {
	 return ISBN;
	}


	public void setISBN(String iSBN) {
	 ISBN = iSBN;
	}


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


	public String getEditorial() {
	 return editorial;
	}


	public void setEditorial(String editorial) {
	 this.editorial = editorial;
	}


	public String getSinopsis() {
	 return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
	 this.sinopsis = sinopsis;
	}


	public int getPagina() {
	 return pagina;
	}


	public void setPagina(int pagina) {
	 this.pagina = pagina;
	}


	public String getIdioma() {
	 return idioma;
	}


	public void setIdioma(String idioma) {
	 this.idioma = idioma;
	}


	public int getAnyoPublicacion() {
	 return anyoPublicacion;
	}


	public void setAnyoPublicacion(int anyoPublicacion) {
	 this.anyoPublicacion = anyoPublicacion;
	}


	public int getPrecio() {
	 return precio;
	}


	public void setPrecio(int precio) {
	 this.precio = precio;
	}


	public boolean getNovedad() {
	 return novedad;
	}


	public void setNovedad(boolean novedad) {
	 this.novedad = novedad;
	}




	public String getCategoria() {
		return categoria;
	}




	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	

}
