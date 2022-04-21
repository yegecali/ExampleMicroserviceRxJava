package com.yegecali.MsAccount.dto;

import com.yegecali.MsAccount.type.TypeDocument;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private TypeDocument typeDocument;
    private String numberDocument;
    private String name;
}
