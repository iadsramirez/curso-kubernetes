package org.bcr.springcloud.msvcusuarios.services;

import org.bcr.springcloud.msvcusuarios.models.entity.ControlCierreSistema;
import org.bcr.springcloud.msvcusuarios.repositories.ControlCierreSistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ControlCierreSistemaImpl implements ControlCierreSistemaService{

    @Autowired
    private ControlCierreSistemaRepository repository;

    @Override
    @Transactional
    public ControlCierreSistema guardar(ControlCierreSistema cierre) {
        return repository.save(cierre);
    }
}
