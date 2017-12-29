package com.circlekeurope.trx.inputfile.inputelement.domain;

import com.circlekeurope.trx.infrastructure.BaseEntity;
import com.circlekeurope.trx.inputfile.inputelement.domain.dto.FileType;
import com.circlekeurope.trx.posting.domain.dto.PostingInputElementDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.Access;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import static javax.persistence.AccessType.FIELD;
import static javax.persistence.EnumType.STRING;
import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Access(FIELD)
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor(access = PACKAGE)
@ToString
class InputElement { 

    @Id
    private Long id;
    
    private String fileName;
    
    private FileType fileType;
    
    private int fieldA;
    
    private int fieldB;
}
