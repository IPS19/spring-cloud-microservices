package com.github.IPS19.deposit.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DepositRequestDto {

    private Long accountId;

    private Long billId;

    private BigDecimal amount;
}