package com.jdl.css.admin.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdl.css.admin.model.dao.AdminDao;


@Service
public class AdminService {
	
	@Autowired
	AdminDao dao;


}
