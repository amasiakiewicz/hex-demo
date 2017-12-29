package com.circlekeurope.trx.inputfile.file2;

import com.circlekeurope.trx.inputfile.inputelement.domain.InputElementFacade;
import com.circlekeurope.trx.inputfile.inputelement.domain.dto.InputElementDto;
import com.circlekeurope.trx.inputfile.inputelement.domain.query.InputElementQueryDto;
import lombok.RequiredArgsConstructor;

import java.io.InputStream;
import java.util.List;

import static com.circlekeurope.trx.inputfile.inputelement.domain.dto.FileType.FILE2;
import static lombok.AccessLevel.PACKAGE;

@RequiredArgsConstructor(access = PACKAGE)
public class File2Facade {
    private final InputElementFacade inputElementFacade;

    public void saveFile(final InputStream inputStream, final String fileName) {
        final File2 file2 = importFile(inputStream, fileName);

        final List<InputElementDto> inputElementDtos = file2.toInputElements();
        inputElementFacade.saveElements(inputElementDtos);
    }

    public List<InputElementQueryDto> findFileByName(final String fileName) {
        return inputElementFacade.findInputElementsByFileNameAndType(fileName, FILE2);
    }

    private File2 importFile(final InputStream inputStream, final String fileName) {
        return new File2(4, 2);
    }

}
