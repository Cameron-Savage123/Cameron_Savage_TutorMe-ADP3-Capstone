package za.ac.cput.Factory;

import za.ac.cput.domain.Payment;

import java.time.LocalDateTime;

public class PaymentFactory {
public static Payment createPayment(String paymentID,double amount,LocalDateTime date,String paymentMethod,String status,String transactionID) {
   //will add helper stuff when helper class is added


return new Payment.PaymentBuilder()
        .setPaymentID(paymentID)
        .setAmount(amount)
        .setPaymentDate(date)
        .setPaymentMethod(paymentMethod)
        .setStatus(status)
        .setTransactionID(transactionID)
        .build();


}
}
