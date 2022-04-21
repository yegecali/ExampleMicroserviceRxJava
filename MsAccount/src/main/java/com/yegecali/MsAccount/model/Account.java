package com.yegecali.MsAccount.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity{
    private String numberAccount;
    private Double balance;
    private String numberDocumentPerson;
}
