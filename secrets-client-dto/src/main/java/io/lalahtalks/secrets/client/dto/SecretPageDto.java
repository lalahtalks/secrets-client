package io.lalahtalks.secrets.client.dto;

import io.lalahtalks.paging.dto.PageDto;
import io.lalahtalks.paging.dto.PagingDto;
import io.lalahtalks.paging.dto.SortDto;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

public class SecretPageDto extends PageDto<SecretDto> {

    @Builder
    public SecretPageDto(@NonNull PagingDto paging, @NonNull @Singular List<SecretDto> elements, SortDto sort) {
        super(paging, elements, sort);
    }

}
