package io.lalahtalks.secrets.client.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.lalahtalks.paging.dto.PageDto;
import io.lalahtalks.paging.dto.PagingDto;
import io.lalahtalks.paging.dto.SortDto;

import java.util.List;

public final class SecretPageDto extends PageDto<SecretDto> {

    @JsonCreator
    public SecretPageDto(
            @JsonProperty("paging") PagingDto paging,
            @JsonProperty("elements") List<SecretDto> elements,
            @JsonProperty("sort") SortDto sort) {
        super(paging, elements, sort);
    }

    public SecretPageDto(PagingDto paging, List<SecretDto> elements) {
        this(paging, elements, SortDto.EMPTY);
    }

}
