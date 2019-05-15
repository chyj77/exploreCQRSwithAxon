package com.sameway.command;

import lombok.Data;

/**
 * Created by triump on 2019/5/15.
 */
@Data
public class DebitAccount {

    private final String account;
    private final Double amount;

    public DebitAccount(String account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public Double getAmount() {
        return amount;
    }
}
