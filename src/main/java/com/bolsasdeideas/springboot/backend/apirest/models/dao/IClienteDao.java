package com.bolsasdeideas.springboot.backend.apirest.models.dao;

import com.bolsasdeideas.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface IClienteDao  extends CrudRepository<Cliente,Long> {
}
