package teste1;

public class atendimento {

	public static void main(String[] args) {
		
		passCovid amanda = new passCovid("Amanda Silva",32, true, "gripe e tosse", 1, 155);
		
		amanda.inicioCadastro();
		amanda.Covid();
		amanda.infoPass();
		amanda.listaClass();
		amanda.classMedica();
		
		System.out.println("__________________________________________________________________");
		
		passOutros carlos = new passOutros("Carlos Bezerra", 54, false, "Dor aguda, pressão alta e diabetes",3,true);
		
		carlos.inicioCadastro();
		carlos.Covid();
		carlos.infoPass();
		carlos.listaClass();
		carlos.classMedica();
		
		
		System.out.println("__________________________________________________________________");
		
		
		passCovid maria = new passCovid("Maria Beatriz",19, true, "falta de ar", 3, 30);
		
		maria.inicioCadastro();
		maria.Covid();
		maria.infoPass();
		maria.listaClass();
		maria.classMedica();
		
		
		 	}
	
	
	
	
	 
	
	
}
