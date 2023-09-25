package com.rewards.rewardcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.rewards.*")
public class RewardcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardcalculatorApplication.class, args);
	}

}
