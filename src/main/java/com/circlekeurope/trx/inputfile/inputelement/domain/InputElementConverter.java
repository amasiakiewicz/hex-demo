package com.circlekeurope.trx.inputfile.inputelement.domain;

import com.circlekeurope.trx.inputfile.inputelement.domain.dto.InputElementDto;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static lombok.AccessLevel.PACKAGE;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@RequiredArgsConstructor(access = PACKAGE)
class InputElementConverter {

    List<InputElement> createInputElements(final List<InputElementDto> inputElementDtos) {
        return inputElementDtos
                .stream()
                .map(this::createSingleElement)
                .collect(toList());
    }

    private InputElement createSingleElement(final InputElementDto inputElementDto) {
        return new InputElement(randomAlphabetic(3), inputElementDto.getFieldA(), inputElementDto.getFieldB());
    }
}
