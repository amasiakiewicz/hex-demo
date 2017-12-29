package com.circlekeurope.trx.inputfile.file1.domain;

import com.circlekeurope.trx.inputfile.inputelement.domain.InputElementFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class File1Configuration {
    
    @Bean
    File1Facade file1Facade(final InputElementFacade inputElementFacade) {
        return new File1Facade(inputElementFacade);
    }
    
}
