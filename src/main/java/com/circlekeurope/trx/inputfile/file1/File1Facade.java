package com.circlekeurope.trx.inputfile.file1.domain;

import com.circlekeurope.trx.inputfile.inputelement.domain.InputElementFacade;
import com.circlekeurope.trx.inputfile.inputelement.domain.dto.InputElementDto;
import com.circlekeurope.trx.inputfile.inputelement.domain.query.InputElementQueryDto;
import lombok.RequiredArgsConstructor;

import java.io.InputStream;
import java.util.List;

import static com.circlekeurope.trx.inputfile.inputelement.domain.dto.FileType.FILE1;
import static lombok.AccessLevel.PACKAGE;

@RequiredArgsConstructor(access = PACKAGE)
public class File1Facade {
    private final InputElementFacade inputElementFacade;

    public void saveFile(final InputStream inputStream, final String fileName) {
        final File1 file1 = importFile(inputStream, fileName);

        final List<InputElementDto> inputElementDtos = file1.toInputElements();
        inputElementFacade.saveElements(inputElementDtos);
    }

    public List<InputElementQueryDto> findFileByName(final String fileName) {
        return inputElementFacade.findInputElementsByFileNameAndType(fileName, FILE1);
    }

    private File1 importFile(final InputStream inputStream, final String fileName) {
        return new File1(5, 6, 7, 8);
    }

}
