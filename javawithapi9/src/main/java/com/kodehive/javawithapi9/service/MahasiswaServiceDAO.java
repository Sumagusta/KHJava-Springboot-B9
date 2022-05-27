package com.kodehive.javawithapi9.service;

import java.util.List;

import com.kodehive.javawithapi9.model.Mahasiswa;
import com.kodehive.javawithapi9.model.submissionmodel.MahasiswaModel;

public interface MahasiswaServiceDAO {
	
	public int save(Mahasiswa m);
	
	public List<Mahasiswa> findAll();

	public Mahasiswa findById(int id);
	
	public List<MahasiswaModel> cariMahasiswa(); // pencarian mahasiswa ditampilkan bersama dengan jurusannya 	
}
