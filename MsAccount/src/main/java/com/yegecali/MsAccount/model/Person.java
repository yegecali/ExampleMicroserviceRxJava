package com.yegecali.MsAccount.model;

import com.yegecali.MsAccount.type.TypeDocument;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private TypeDocument typeDocument;
    private String numberDocument;
    private String name;
}
