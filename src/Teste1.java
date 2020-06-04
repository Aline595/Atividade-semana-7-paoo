

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Teste1 {

	public static void main(String[] args) {
		Livro l1 = new Livro ("Concrete Mathematics","Knuth");
		Livro l2 = new Livro ("Introduction to Algorithms", "Cormen");
		List <Livro> livros = new ArrayList <>();
		livros.add(l1);
		livros.add(l2);
		
		livros.forEach(l -> System.out.println (l.isNovo()));
		
		livros.forEach(l -> l.abrir());
		
		livros.forEach(l -> System.out.println (l.isNovo()));
		
		livros.forEach(l -> System.out.println(l.toString()));
	
	}
	class ExibeAutor implements Consumer <Livro>{
		@Override
		public void accept(Livro l) {
			System.out.println(l.getAutor());
			System.out.println(l.toString());
		}
	}
}

