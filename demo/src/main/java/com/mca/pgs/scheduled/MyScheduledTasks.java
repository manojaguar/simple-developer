package com.mca.pgs.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduledTasks {

	@Scheduled(fixedDelay = 5000)
	public void myFixedDelayTask() {
		
		System.out.println("Executing myFixedDelayTask...");
	}

	@Scheduled(cron = "3 43 0 * * ?") 
	public void myCronTask() {
		System.out.println("Executing myCronTask...");
	}
}
