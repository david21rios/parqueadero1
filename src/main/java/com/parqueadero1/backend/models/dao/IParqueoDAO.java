package com.parqueadero1.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.parqueadero1.backend.models.entity.Parqueo;

public interface IParqueoDAO extends CrudRepository<Parqueo, Long> {
	
	public Parqueo findByPlaca (String placa);
	//public Optional<Parqueo> findById (Long id);
	

}
