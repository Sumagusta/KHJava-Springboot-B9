package com.kodehive.javawithapi9.repository;

import java.util.List;

import com.kodehive.javawithapi9.model.Mahasiswa;
import com.kodehive.javawithapi9.model.submissionmodel.MahasiswaModel;

public interface MahasiswaDAO {

	public int save(Mahasiswa m);

	public List<Mahasiswa> findAll();
	
	public Mahasiswa findById(int id);
	
	public List<MahasiswaModel> cariMahasiswa();
}
