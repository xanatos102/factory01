/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author 1504307
 */
abstract class BaseAccount {
    
    protected double balance;
    protected int rewardPoints;
    
    public BaseAccount(){
        
        this.balance = 0.0;
        this.rewardPoints = 0;
    }
    
    public int getRewardPoints(){
        
        return rewardPoints;
    }
}


