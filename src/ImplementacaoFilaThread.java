import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
				new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
		
		
		
	}
	
	
	@Override
	public void run() {
		Iterator interacao = pilha_fila.iterator();
		
		synchronized (interacao) {
			
			
			while (interacao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next();
				
				/*processar 10mil otas fiscais*/
				/*Gerar uma lista enorma de PDF*/
				/*lista de email*/
				
				interacao.remove();
				
				
				try {
					Thread.sleep(100); /*Tempo para a carga de memoria*/
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		try {
			Thread.sleep(1000); /*Processou toda a lista, da um tempo para a limpesa da memoria*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}	



