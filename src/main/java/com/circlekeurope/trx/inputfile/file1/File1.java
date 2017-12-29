package com.circlekeurope.trx.inputfile.file1.domain;

import com.circlekeurope.trx.inputfile.inputelement.domain.dto.InputElementDto;
import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PACKAGE;

@AllArgsConstructor(access = PACKAGE)
class File1 {
    private final int fieldA1;
    private final int fieldB1;
    private final int fieldC1;
    private final int fieldD1;

    List<InputElementDto> toInputElements() {
        return ImmutableList.of(
                new InputElementDto(fieldA1, fieldB1)
        );
    }


}
