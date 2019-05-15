package com.sameway.command;

import lombok.Data;

/**
 * Created by triump on 2019/5/15.
 */
@Data
public class CreditAccount {


    private final String account;
    private final Double amount;

    public CreditAccount(String account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

}
