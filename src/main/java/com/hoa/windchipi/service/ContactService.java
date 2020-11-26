package com.hoa.windchipi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoa.windchipi.entity.Contact;
import com.hoa.windchipi.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
}