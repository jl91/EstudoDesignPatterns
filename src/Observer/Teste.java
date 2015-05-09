package Observer;

import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		
		for(int i = 0; i < 500; i++){
			subject.attach(new Observer1());
			
			if(i % 10 == 0){
				Random rand = new Random();
				int var1 = rand.nextInt(500);
				int var2 = rand.nextInt(500);
				int var3 = rand.nextInt(500);
				
				subject.setParams(var1, var2, var3);
			}
		}
		
		
	}
}
