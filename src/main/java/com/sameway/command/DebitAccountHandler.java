package com.sameway.command;


import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.CommandMessage;
import org.axonframework.unitofwork.UnitOfWork;

/**
 * Created by triump on 2019/5/16.
 */

public class DebitAccountHandler implements CommandHandler {


    @Override
    public Object handle(CommandMessage commandMessage,
                         UnitOfWork unitOfWork) throws Throwable {
        DebitAccount debitAccountCommand =
                (DebitAccount) commandMessage.getPayload();

        String account = debitAccountCommand.getAccount();
        Double amount = debitAccountCommand.getAmount();
        System.out.println("I can handle the debitAccount command: "
                + "Account to debit: " + account
                + " Amount to debit with: "+ amount);

        return null;
    }

}
