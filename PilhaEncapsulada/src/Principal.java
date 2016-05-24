
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("Jose");
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		//Desempilhando
		System.out.println("___________________");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
	}

}
