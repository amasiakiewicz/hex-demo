package com.circlekeurope.trx.inputfile.inputelement.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class InputElementConfiguration {

    @Bean
    InputElementFacade inputElementFacade(final InputElementRepository inputElementRepository) {
        final InputElementConverter inputElementConverter = new InputElementConverter();
        return new InputElementFacade(inputElementRepository, inputElementConverter); 
    }
    
}
