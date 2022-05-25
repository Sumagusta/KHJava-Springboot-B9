package com.kodehive.javawithapi9.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.javawithapi9.model.MahasiswaModel;
import com.kodehive.javawithapi9.repository.MahasiswaDAO;
import com.kodehive.javawithapi9.service.MahasiswaServiceDAO;


public class MahasiswaServiceDAOImpl implements MahasiswaServiceDAO {

	@Override
	public int save(MahasiswaModel m) {
		// TODO Auto-generated method stub
		return 0;
	} // service = bussiness logic
//
//	@Autowired
//	MahasiswaDAO mahasiswaRepository;
//	
//	@Override
//	public int save(MahasiswaModel m) {
//		return mahasiswaRepository.save(m);
//	}

}
