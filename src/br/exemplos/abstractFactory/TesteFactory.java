package br.exemplos.abstractFactory;

public class TesteFactory {
	
	private static Carro montarCarro(String tipo) {
		CarroFactory cf = null;
		switch(tipo){
			case "luxo":
				cf = new CarroLuxoFactory();
				break;
			case "popular":
				cf = new CarroPopularFactory();
		}
		
		Carro carro = new Carro();
		carro.setRoda(cf.montarRoda());
		carro.setSom(cf.montarSom());
		
		return carro;
	}
                                
	public static void main(String[] args) {
		Carro c1 = montarCarro("luxo");
		Carro c2 = montarCarro("popular");
		System.out.println("END");
	}

}
