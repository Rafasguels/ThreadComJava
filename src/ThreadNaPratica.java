import javax.swing.JOptionPane;

public class ThreadNaPratica {

	public static void main(String[] args) throws InterruptedException  {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
			
			
		
		/*------------------------------------------------------------------------------------------*/	
		
		/*envio de nota fiscal*/
		Thread threadNFCE =  new Thread(thread2);
		threadNFCE.start();	

		/*Fim de codigo em paralelo*/
		/*Codigo do sistema do usuario continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CODIGO DE TESTE DE THREAD");
		/*fluxo do sistema*/
		JOptionPane.showConfirmDialog(null, "Sistema continua execultando para o usuario");
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/*envio de nota fiscal*/
			new Thread() {
				
				public void run() { /*Execultando o que nos queremos*/
					
				};
				
			}.start();/*Startar, liga a THread que fica processando paralelamente por tras do codigo*/
		}
		
	};
	
	
	private static Runnable  thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			/*codigo de rotina */
			
			/*Codigo de rotina quie eu quero execultar em paralelo*/
			for (int pos = 0 ; pos < 10; pos++) {
				
				
				/*execultado atividade pedida*/
				System.out.println("Teste de milisegundo usando Thread, para nota fiscal");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	/*Da um tempo testes*/	
			
			}
			
		}
		
	};

}
