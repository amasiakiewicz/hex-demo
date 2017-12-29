package com.circlekeurope.trx.inputfile.file2;

import com.circlekeurope.trx.inputfile.inputelement.domain.dto.InputElementDto;
import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PACKAGE;

@AllArgsConstructor(access = PACKAGE)
class File2 {
    private final int fieldA2;
    private final int fieldB2;

    List<InputElementDto> toInputElements() {
        return ImmutableList.of(
                new InputElementDto(fieldA2, fieldB2)
        );
    }
    
}
