package com.kodehive.javawithapi9.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.javawithapi9.model.Mahasiswa;
import com.kodehive.javawithapi9.model.submissionmodel.MahasiswaModel;
import com.kodehive.javawithapi9.repository.MahasiswaDAO;
import com.kodehive.javawithapi9.service.MahasiswaServiceDAO;

@Service
public class MahasiswaServiceDAOImpl implements MahasiswaServiceDAO { // service = bussiness logic

	@Autowired
	MahasiswaDAO mahasiswaRepository;
	
	@Override
	public int save(Mahasiswa m) {
		return mahasiswaRepository.save(m);
	}

	@Override
	public List<Mahasiswa> findAll() {
		// TODO Auto-generated method stub
		
		return mahasiswaRepository.findAll();
	}

	@Override
	public Mahasiswa findById(int id) {
		// TODO Auto-generated method stub
		return mahasiswaRepository.findById(id);
	}

	@Override
	public List<MahasiswaModel> cariMahasiswa() {
		
		return mahasiswaRepository.cariMahasiswa();
	}

}
