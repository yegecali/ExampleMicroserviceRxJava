package com.yegecali.MsOperation.client.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private String numberAccount;
    private Double balance;
    private String numberDocumentPerson;
}
