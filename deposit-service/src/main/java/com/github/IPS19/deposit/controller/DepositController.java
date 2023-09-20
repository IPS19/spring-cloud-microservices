package com.github.IPS19.deposit.controller;

import com.github.IPS19.deposit.controller.dto.DepositRequestDto;
import com.github.IPS19.deposit.controller.dto.DepositResponseDto;
import com.github.IPS19.deposit.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {

    private final DepositService depositService;

    @Autowired
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @PostMapping("/deposits")
    public DepositResponseDto deposit(@RequestBody DepositRequestDto requestDto) {
        return depositService.deposit(requestDto.getAccountId(), requestDto.getBillId(), requestDto.getAmount());
    }
}