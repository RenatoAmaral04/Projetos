package com.qwa.atividade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Hibernate; 

import com.qwa.atividade.entities.User;
import com.qwa.atividade.repositories.UserRepository;
import com.qwa.atividade.services.exceptions.DatabaseException;
import com.qwa.atividade.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true) 
    public List<User> findAll(){
        List<User> users = repository.findAll();
        for (User user : users) {
            Hibernate.initialize(user.getOrders()); 
        }
        return users;
    }

    @Transactional(readOnly = true)
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        User user = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
        if (user != null) {
            Hibernate.initialize(user.getOrders()); 
        }
        return user;
    }
    
    public User insert(User obj) {
    	
    	return repository.save(obj);
    }
    
    public void delete(Long id) {
    
    	if (!repository.existsById(id)) {
    		throw new ResourceNotFoundException(id);
    	}
    	try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
    }
    
    @Transactional
    public User update(Long id, User obj) {
    	
    	try {
    		User entity = repository.getReferenceById(id);
        	updateData(entity, obj);
        	return repository.save(entity);
    	}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
    	
    }

	private void updateData(User entity, User obj) {

		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}