/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
import java.util.ArrayList;
import java.util.List;

public class RewardManager {
    private List<Reward> availableRewards;

    public RewardManager() {
        this.availableRewards = new ArrayList<>();
    }

    public void tambahReward(Reward reward) {
        availableRewards.add(reward);
        System.out.println("Reward " + reward.getNama() + " ditambahkan ke dalam daftar.");
    }

    public void tampilkanAvailableRewards() {
        System.out.println("Available Rewards:");
        for (Reward reward : availableRewards) {
            reward.tampilkanDetailReward();
        }
    }

    @Override
    public String toString() {
        return "RewardManager{" +
                "availableRewards=" + availableRewards +
                '}';
    }
}

