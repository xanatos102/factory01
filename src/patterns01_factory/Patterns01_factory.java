/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns01_factory;

// can use packagename.*; to import all files from the package e.g. account.*;
import accounts.PlatinumAccount;
import accounts.SilverAccount;
import accounts.GoldAccount;
import accounts.BronzeAccount;
import factory.AccountFactory;
import factory.AccountI;

/**
 *
 * @author 1504307
 */
public class Patterns01_factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testSingleClass();
        //testBronze();
        //testSilver();
        //testGold();
        //testPlatinum();
        testAccount();
    }
    
    public static int testPlatinum(){
        
        System.out.print("Platinum Account: ");
        PlatinumAccount ac1 = new PlatinumAccount();
        ac1.rewardPoints(123.00);
        System.out.println(ac1.getRewardPoints());
        return 0;
    }
    
    public static int testGold(){
        
        System.out.print("Gold Account: ");
        GoldAccount ac1 = new GoldAccount();
        ac1.rewardPoints(123.00);
        System.out.println(ac1.getRewardPoints());
        return 0;
    }
    
    public static int testSilver(){
        
        System.out.print("Silver Account: ");
        SilverAccount ac1 = new SilverAccount();
        ac1.rewardPoints(123.00);
        System.out.println(ac1.getRewardPoints());
        return 0;
    }
    
    public static int testBronze(){
        
        System.out.print("Bronze Account: ");
        BronzeAccount ac1 = new BronzeAccount();
        ac1.rewardPoints(123.00);
        System.out.println(ac1.getRewardPoints());
        return 0;
    }
    
    public static int testSingleClass(){
        
        System.out.println("-- Account Type Test--");
        System.out.print("Silver Account: ");
        Account ac1 = new Account("silver");
        ac1.rewardPoints(123.00);
        System.out.println(ac1.getRewardPoints());
        
        System.out.print("Gold Account: ");
        Account ac2 = new Account("gold");
        ac2.rewardPoints(123.00);
        System.out.println(ac2.getRewardPoints());
        
        System.out.print("Platinum Account: ");
        Account ac3 = new Account("platinum");
        ac3.rewardPoints(123.00);
        System.out.println(ac3.getRewardPoints());
        
        return 0;
    }
    
    public static void testAccount(){
    
    try {
    
    AccountI silver = AccountFactory.createAccount("Silver");
    System.out.println(silver.addRewardPoints(123.00));
    
    AccountI thegolden = AccountFactory.createAccount("GOLD");
    System.out.println(thegolden.addRewardPoints(123.00));
    
    AccountI anotherPlatinum = AccountFactory.createAccount("pLATINUM");
    System.out.println(anotherPlatinum.addRewardPoints(123.00));
    
    // makes the program crash if the exception is not handled
    // AccountI bogusAccount = AccountFactory.createAccount("")
    System.out.println("\n------- add some reward points -------\n");
    
    silver.addRewardPoints(234.56);
    System.out.println("silver: reward points added");
    thegolden.addRewardPoints(234.56);
    System.out.println("thegolden: reward points added");
    anotherPlatinum.addRewardPoints(234.56);
    System.out.println("anotherPlatinum: reward points added");
    
    System.out.println("\n------- use the getter method (see Account)");
    
    System.out.println("[use getter method] silver (rewardPoints):" + silver.getRewardPoints());
    System.out.println("[use getter method] thegolden (rewardPoints):" + thegolden.getRewardPoints());
    System.out.println("[use getter method] anotherPlatinum (rewardPoints):" + anotherPlatinum.getRewardPoints());
    
    }catch (IllegalArgumentException e){
            System.err.println("IndexOutOfBoundsException: "
                    + e.getMessage());
            }
    
    System.out.println("\n------- end of program -------\n");
    
    }
    
}
