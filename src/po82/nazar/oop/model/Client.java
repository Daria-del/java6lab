package po82.nazar.oop.model;

import po82.nazar.oop.model.Exceptions.InvalidAccountNumberException;

public interface Client extends Iterable<Account>, Comparable<Client> {
    public String getTitle();
    public void setTitle(String title);
    public boolean add(Account account) throws InvalidAccountNumberException;
    public boolean add(Account account,int index);
    public Account get(int index);
    public Account get(String number) throws InvalidAccountNumberException;
    public boolean hasAccountWithNumber(String number) throws InvalidAccountNumberException;
    public Account set(Account account,int index) throws InvalidAccountNumberException;
    public Account remove(int index);
    public Account remove(String number) throws InvalidAccountNumberException;
    public int size();
    public Account[] getAccounts();
    public Account[] getSortedAccountsByBalance();
    public double getTotalBalance();
    public int indexOf(String number);
    public int getCreditScores();
    public void addCreditScore(int creditScores);
    default ClientStatus getStatus(int CreditScoreBound){
        return ClientStatus.fromId(CreditScoreBound);
    };
    public Account[] getCreditAccounts();
    public boolean remove(Account account);
    public int indexOf(Account account);
    public double debtTotal();
}
