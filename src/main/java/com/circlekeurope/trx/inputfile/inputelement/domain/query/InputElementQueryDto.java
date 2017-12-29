package com.circlekeurope.trx.inputfile.inputelement.domain.query;

import com.circlekeurope.trx.inputfile.inputelement.domain.dto.FileType;
import lombok.Value;

@Value
public class InputElementQueryDto {
    private final String fileName;
    private final FileType fileType;
    private final int fieldA;
    private final int fieldB;
}
