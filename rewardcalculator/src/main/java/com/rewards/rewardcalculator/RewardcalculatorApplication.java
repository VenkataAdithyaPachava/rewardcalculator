package com.rewards.rewardcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = {"com.rewards.rewardcalculator"})
public class RewardcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardcalculatorApplication.class, args);
	}

}
