package teste1;

public class passCovid extends cadPass{
	
	
	//atributos da classfilha passCovid
	
	private int ordemAtend;
	
	
	
	// Construtor da classfilha passCovid
	
	public passCovid (String nome,int idade,boolean sintomasCovid,String infoSintoma,int num,int ordemAtend) 
		{
			super(nome,idade,sintomasCovid,infoSintoma,num);
			this.ordemAtend = ordemAtend;
		}

	
	
	// gets e sett da class filha passCovid

	public int getOrdemAtend() {
		return ordemAtend;
	}


	public void setOrdemAtend(int ordemAtend) {
		this.ordemAtend = ordemAtend;
	}



	// metodo poliformismo da class mãe passCovid

	@Override
	public void inicioCadastro() {
		System.out.println("Você está na triagem de covid!\n");
		System.out.println("Você tem sintomas de covid?\n");
	}

	@Override
	public void Covid() {
		if(super.getSintomasCovid()==true)
		{
			
			System.out.println("Sim!\nVocê será chamado para triagem especial de Covid!\n");
		}
		
		else
		{
			System.out.println("Não!\nVocê será chamado para triagem geral!");
		}	
		
	}


	@Override
	public void infoPass() {
		
		System.out.println("********* Cadatro de Paciente - Triagem ***********\n");
		System.out.println("Nome:"+super.getNome()+"\n");
		System.out.println("Idade:"+super.getIdade()+"\n");
		System.out.println("Sintomas Covide:"+super.getSintomasCovid()+"\n");
		System.out.println("Sintoma da paciente:"+super.getInfoSintoma()+"\n");
		System.out.println("Seu numero de atendimetno é: "+this.ordemAtend+"\n");
	}
	
	@Override
	public void listaClass() {
		
		System.out.println("Classificação de acordo com os sintomas do paciente:\n");
		System.out.println("*****  Sintomas  ***********************************\n"+"\nGripe e Tosse - 1 = Baixa Emergência.\nFebre e dor de cabeça - 2 = Média Emergência\nFalta de ar - 3 = Alta emergência.\n");
		System.out.println("****************************************************");
		
	}

	@Override
	public void classMedica() {
		 switch(super.getNum()) {
		 
		 case 1: 
			 System.out.println("Sua classificação é Verde = Baixa emergência.\n");
		 break;
		 
		 case 2: 
			 System.out.println("Sua classificação é Amarela = Média emergência.\n");
		 break;
		 
		 case 3: 
			 System.out.println("Sua classificação é Vermelha = Alta emergência.\n");
		 break;
		 }
		 
		}
		
	
}
