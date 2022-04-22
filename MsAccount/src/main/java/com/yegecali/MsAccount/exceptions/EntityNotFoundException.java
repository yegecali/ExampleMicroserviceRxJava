package com.yegecali.MsAccount.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String parametro, String valorparametro) {
        super(String.format("El recurso con el parametro %s = %s", parametro, valorparametro));
    }
}
