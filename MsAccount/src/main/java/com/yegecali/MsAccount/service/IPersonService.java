package com.yegecali.MsAccount.service;

import com.yegecali.MsAccount.dto.PersonDto;
import io.reactivex.Single;
import org.springframework.stereotype.Service;

@Service
public interface IPersonService extends BaseService<PersonDto, String>{
    Single<PersonDto> getByNumberDocument(String numberDocument);
}
