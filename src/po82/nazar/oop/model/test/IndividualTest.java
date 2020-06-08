package po82.nazar.oop.model.test;

import org.junit.Test;
import po82.nazar.oop.model.*;
import po82.nazar.oop.model.Exceptions.InvalidAccountNumberException;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Iterator;

public class IndividualTest {

    Client account;

    public IndividualTest() throws InvalidAccountNumberException {
        Account[] debitAccounts = new Account[3];
        debitAccounts[0] = new DebitAccount("47289918763789872613", 1321);
        debitAccounts[1] = new DebitAccount("47289318763789872613", 121);
        debitAccounts[2] = new CreditAccount("47389918763789872613", 41212, 1);
        account = new Individual("Nazarenko", debitAccounts);
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
        account.setTitle("Mihailov");
        getTitle();
    }

    @Test
    public void add() throws InvalidAccountNumberException {
        returnAccount();

        account.add(new DebitAccount("47289918763789872616", 31));
        account.add(new DebitAccount("47289918763789873616", 350));
        account.add(new DebitAccount("47289918763444872616", 3100));
        account.add(new DebitAccount("47289918764565872616", 721));
        returnAccount();

    }

    @Test
    public void testAdd() throws InvalidAccountNumberException {
        returnAccount();
        System.out.println("-----------");
        account.add(new DebitAccount("47289918763789872615", 31), 1);
        returnAccount();
        System.out.println("-----------");
        account.add(new DebitAccount("47284918763789872613", 31), 2);
        returnAccount();
    }

    @Test
    public void get() {

    }

    @Test
    public void testGet() {
    }

    @Test
    public void hasAccountWithNumber() {
    }

    @Test
    public void set() {
    }

    @Test
    public void remove() {
        returnAccount();
        account.remove(1);
        System.out.println("-----");
        returnAccount();
    }

    @Test
    public void testRemove() throws InvalidAccountNumberException {
        returnAccount();
        account.remove("321");
        System.out.println("-----");
        returnAccount();
    }

    @Test
    public void indexOf() {
        returnAccount();
        System.out.println(account.indexOf("3342"));
    }

    @Test
    public void size() {
    }

    @Test
    public void getAccounts() {
    }

    @Test
    public void getSortedAccountsByBalance() {
        returnAccount();
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
        System.out.println(account.getCreditScores());
    }

    @Test
    public void addCreditScore() {
        account.addCreditScore(3);
        System.out.println(account.getCreditScores());
        System.out.println(account.getStatus(0));
    }

    @Test
    public void getCreditAccounts() {
        Account[] returnAccount = account.getCreditAccounts();

        for(Account credit: returnAccount){
            System.out.println(credit.getNumber());
        }
    }

    @Test
    public void compareTo() {
        account.compareTo(account);
    }

    @Test
    public void iterator() {
        Iterator<Account> iterator = account.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
