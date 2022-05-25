package com.kodehive.javawithapi9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.javawithapi9.model.MahasiswaModel;
import com.kodehive.javawithapi9.repository.MahasiswaDAO;
import com.kodehive.javawithapi9.service.MahasiswaServiceDAO;

@Component
@RestController
public class MahasiswaController {	

	@Autowired
	MahasiswaDAO mahasiswaDao;
	
	@Autowired
	MahasiswaServiceDAO mahasiswaServiceDao;
	
	@PostMapping("/postMahasiswa")
	public String save(@RequestBody MahasiswaModel m)
	{
		return mahasiswaServiceDao.save(m)+" data berhasil disimpan";
	}
	
	@GetMapping("/getAllMahasiswa")
	public List<MahasiswaModel> findAll(){
		return mahasiswaServiceDao.findAll();
	}
	
	// findById
}
