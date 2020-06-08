package po82.nazar.oop.model.test;

import org.junit.Test;
import po82.nazar.oop.model.*;
import po82.nazar.oop.model.Exceptions.InvalidAccountNumberException;

import java.util.Iterator;

import static org.junit.Assert.*;

public class EntityTest {

    Client account;


    public EntityTest() throws InvalidAccountNumberException {
        Account[] debitAccounts = new Account[2];
        debitAccounts[0] = new DebitAccount("47819205847362798817", 1321);
        debitAccounts[1] = new DebitAccount("47817205847362798817", 121);
        account = new Entity("Nazarenko", debitAccounts);
    }

    public void returnAccount(){
        Account[] accounts = account.getAccounts();
        for(Account account: accounts){
            System.out.println("Number: " + account.getNumber() + " Balance: " + account.getBalance());
        }
    }

    @Test
    public void getTitle() {
        System.out.println(account.getTitle());
    }

    @Test
    public void setTitle() {
    }

    @Test
    public void add() throws InvalidAccountNumberException {
        returnAccount();
        account.add(new DebitAccount("4322", 3));
        System.out.println("------");
        returnAccount();
    }

    @Test
    public void testAdd() throws InvalidAccountNumberException {
        returnAccount();
        account.add(new DebitAccount("4322", 1),2);
        System.out.println("------");
        returnAccount();
    }

    @Test
    public void get() {
        returnAccount();
        System.out.println(account.get(2).getNumber());
    }

    @Test
    public void testGet() throws InvalidAccountNumberException {
        returnAccount();
        System.out.println(account.get("321").getBalance());
    }

    @Test
    public void hasAccountWithNumber() throws InvalidAccountNumberException {
        System.out.println(account.hasAccountWithNumber("321"));
        System.out.println(account.hasAccountWithNumber("34321"));

    }

    @Test
    public void set() throws InvalidAccountNumberException {
        returnAccount();
        account.set(new DebitAccount("321", 324), 2);
        returnAccount();
    }

    @Test
    public void remove() {
        returnAccount();
        account.remove(1);
        returnAccount();
    }

    @Test
    public void testRemove() throws InvalidAccountNumberException {
        returnAccount();
        account.remove("3342");
        returnAccount();
    }

    @Test
    public void indexOf() {
        returnAccount();
        System.out.println(account.indexOf("3342"));
        System.out.println(account.indexOf("321"));
    }

    @Test
    public void size() {
    }

    @Test
    public void getAccounts() {
        returnAccount();
    }

    @Test
    public void getSortedAccountsByBalance() {
        Account[] accounts = account.getSortedAccountsByBalance();
        for(Account account: accounts){
            System.out.println("Number: " + account.getNumber() + " Balance: " + account.getBalance());
        }
    }

    @Test
    public void getTotalBalance() {
        System.out.println(account.getTotalBalance());
    }

    @Test
    public void getCreditScores() {
    }

    @Test
    public void addCreditScore() {
    }

    @Test
    public void getCreditAccounts() {
    }

    @Test
    public void iterator() {
        Iterator<Account> iterator = account.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}