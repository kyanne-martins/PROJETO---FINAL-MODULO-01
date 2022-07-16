package teste1;

public class passOutros extends cadPass{
	
	//atributos da classfilha passOutos
	
	private boolean prioridade;
	
	// Construtor da classfilha passOutos
	
		public passOutros (String nome,int idade,boolean sintomasCovid,String infoSintoma,int num,boolean prioridade) 
			{
				super(nome,idade,sintomasCovid,infoSintoma,num);
				this.prioridade = prioridade;
			}
		
	// gets e sett da class filha passOutros

		public boolean getPrioridade() {
			return prioridade;
		}

		public void setPrioridade(boolean prioridade) {
			this.prioridade = prioridade;
		}
		
		// metodo poliformismo da class mãe passCovid

		@Override
		public void inicioCadastro() {
			System.out.println("Você está no cadastramento Geral\n");
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
			System.out.println("Paciente prioritário chamada com urgência: "+this.prioridade+"\n");
			
		}

		@Override
		public void listaClass() {
			
			System.out.println("Classificação de acordo com os sintomas do paciente:\n");
			System.out.println("*****  Sintomas  ***********************************\n"+"\nDorleve - 1 = Baixa Emergência.\nDor média e pressão alta - 2 = Média Emergência\nDor aguda, pressão alta e diabetes - 3 = Alta emergência.\n");
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
