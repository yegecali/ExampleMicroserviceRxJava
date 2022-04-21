package com.yegecali.MsAccount.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
@ToString
public abstract class BaseEntity {
    @Id
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
