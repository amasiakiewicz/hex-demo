package com.circlekeurope.trx.inputfile.file2;

import com.circlekeurope.trx.inputfile.inputelement.domain.InputElementFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class File2Configuration {
    
    @Bean
    File2Facade file2Facade(final InputElementFacade inputElementFacade) {
        return new File2Facade(inputElementFacade);
    }
    
}
