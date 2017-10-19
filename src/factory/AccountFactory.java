/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author 1504307
 */
public class AccountFactory {
    
    //public AccountFactory(){
    //}
    public static AccountI createAccount(String actype){
        
        if (actype.equalsIgnoreCase("Silver")){
            return new SilverAccount();
        }else if (actype.equalsIgnoreCase("Gold")){
            return new GoldAccount();
        }else if (actype.equalsIgnoreCase("Platinum")){
            return new PlatinumAccount();
        }
        // if the String actype does NOT contain
        // a valid account type name:
        // nothing gets "returned" -> "missing return statement"
        // throw an exception back to the caller
        // see also: http://docs.oracle.com/javase/tutorial/essentials
        throw new IllegalArgumentException("Cannot create a ' " + actype + " ' account!");
        }
    
    }

