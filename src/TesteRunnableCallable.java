

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TesteRunnableCallable {
	public static void main(String[] args) {
		new Thread (new Runnable () {
			@Override
			public void run() {
				System.out.println("estou numa nova thread: " + Thread.currentThread().getName());
				
			}
		}).start();
		System.out.println("Estou na thread principal: " + Thread.currentThread().getName());
		
		new Thread (() -> {
			System.out.println("estou numa nova thread, usando lambda: " + Thread.currentThread().getName());
		}).start(); 
		
		ExecutorService pool = Executors.newSingleThreadExecutor();	
		
		Callable <String> callableSemLambda = new Callable <String> () {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "callable, sem lambda";
			}
		};
		
		try {
			String futuro = pool.submit(callableSemLambda).get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(pool.submit(() -> {return "Agora com lambda";}).get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

