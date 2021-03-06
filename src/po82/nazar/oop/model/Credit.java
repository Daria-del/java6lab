package po82.nazar.oop.model;

import java.time.LocalDate;

public interface Credit {
    double getAPR();
    void setAPR(double APR);
    double nextPaymentValue();
    LocalDate nextPaymentDate();
}
