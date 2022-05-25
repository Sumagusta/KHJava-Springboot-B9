package com.kodehive.javawithapi9.service;

import java.util.List;

import com.kodehive.javawithapi9.model.MahasiswaModel;

public interface MahasiswaServiceDAO {
	
	public int save(MahasiswaModel m);
	
	public List<MahasiswaModel> findAll();

	public MahasiswaModel findById(int id);
	
}
