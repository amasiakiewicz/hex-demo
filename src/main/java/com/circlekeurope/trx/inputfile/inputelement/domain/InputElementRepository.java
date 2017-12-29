package com.circlekeurope.trx.inputfile.inputelement.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
interface InputElementRepository extends JpaRepository<InputElement, UUID> {
    List<InputElement> findByFileName(String fileName);
    boolean existsByFileName(String fileName);
}
