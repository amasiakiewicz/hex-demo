package com.circlekeurope.trx.inputfile.inputelement.domain;

import com.circlekeurope.trx.inputfile.inputelement.domain.dto.FileType;
import com.circlekeurope.trx.inputfile.inputelement.domain.dto.InputElementDto;
import com.circlekeurope.trx.inputfile.inputelement.domain.query.InputElementQueryDto;
import com.google.common.collect.ImmutableList;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static lombok.AccessLevel.PACKAGE;

@Transactional
@RequiredArgsConstructor(access = PACKAGE)
public class InputElementFacade {

    private final InputElementRepository inputElementRepository;
    private final InputElementConverter inputElementConverter;

    public void saveElements(final List<InputElementDto> inputElementDtos) {
        final List<InputElement> inputElements = inputElementConverter.createInputElements(inputElementDtos);
        inputElementRepository.save(inputElements);
    }

    public List<InputElementQueryDto> findInputElementsByFileNameAndType(final String fileName, final FileType fileType) {
        return ImmutableList.of(
                new InputElementQueryDto(fileName, fileType,1, 2)
        );
    }
}
