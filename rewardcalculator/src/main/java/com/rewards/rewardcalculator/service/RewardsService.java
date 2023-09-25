package com.rewards.rewardcalculator.service;

import com.rewards.rewardcalculator.model.Rewards;



public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
