package com.kodehive.javawithapi9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.javawithapi9.model.Mahasiswa;
import com.kodehive.javawithapi9.model.submissionmodel.MahasiswaModel;
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
	public String save(@RequestBody Mahasiswa m)
	{
		return mahasiswaServiceDao.save(m)+" data berhasil disimpan";
	}
	
	@GetMapping("/getAllMahasiswa")
	public List<Mahasiswa> findAll(){
		return mahasiswaServiceDao.findAll();
	}
	
	// findById
	@GetMapping("/getMahasiswaById/{id}")
	public Mahasiswa findById(@PathVariable int id) {
		return mahasiswaServiceDao.findById(id);
	}
	
	@GetMapping("/getMahasiswaJurusan")
	public List<MahasiswaModel> cariMahasiswa()
	{
		System.out.println("get mahasiswa dan jurusan");
		return mahasiswaServiceDao.cariMahasiswa();
	}
}
