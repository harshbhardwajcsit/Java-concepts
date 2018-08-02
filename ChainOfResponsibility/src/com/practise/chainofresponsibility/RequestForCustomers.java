package com.practise.chainofresponsibility;

public class RequestForCustomers {

    public void RecieveRequestForCutomer(Cutomer cutomer){
        //apply chain of responsibility
        CustomerAddingService customerAddingService=new CustomerAddingService();
        AuthenticationService authenticationService=new AuthenticationService();
        EmailService emailService=new EmailService();

        customerAddingService.addCustomers(cutomer);
        authenticationService.authenticateCustomer(cutomer);
        emailService.sendEmail(cutomer);

    }

    public static void main(String args[]){

        RequestForCustomers requestForCustomers=new RequestForCustomers();
        Cutomer cutomer=new Cutomer();
        cutomer.setName("harsh");
        cutomer.setOccupation("Engineer");
        cutomer.setMail("xyz@gmail.com");
        requestForCustomers.RecieveRequestForCutomer(cutomer);

    }
}
