

public class Livro {
	private String titulo, autor;
	private boolean novo;
	
	public void abrir () {
		this.novo = false;
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		novo = true;
	}
	
	public boolean isNovo() {
		return novo;
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
	
	public String toString() {
		return getClass().getName() + getTitulo() + getAutor();
	}
	


}
