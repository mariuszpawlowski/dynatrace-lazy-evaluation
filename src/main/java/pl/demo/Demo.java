package pl.demo;

import org.apache.commons.lang3.time.StopWatch;

public class Demo {
	
	
	public static void main(String... args){
		new Demo().run();
		
	}

	private void run() {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		System.out.println("ddd");
		
		stopWatch.stop();
		
		System.out.println(stopWatch.getNanoTime());
		
	}

}
