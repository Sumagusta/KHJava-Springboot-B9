package com.kodehive.javawithapi9.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kodehive.javawithapi9.model.Mahasiswa;
import com.kodehive.javawithapi9.model.submissionmodel.MahasiswaModel;
import com.kodehive.javawithapi9.repository.MahasiswaDAO;

@Repository
public class MahasiswaDAOImpl implements MahasiswaDAO {

	// dependencies injection
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(Mahasiswa m) {
		return jdbc.update("insert into mahasiswa(name, jurusan_id, usia, spp)"
				+ "values"
				+ "(?,?,?,?)", new Object[] {m.getName(), m.getJurusan_id(), m.getUsia(), m.getSpp()});
	}

	@Override
	public List<Mahasiswa> findAll() {
		return jdbc.query("select * from mahasiswa_model", new BeanPropertyRowMapper<Mahasiswa>(Mahasiswa.class));
	}

	@Override
	public Mahasiswa findById(int id) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject("select * from mahasiswa_model where mahasiswa_id = ?", new BeanPropertyRowMapper<Mahasiswa>(Mahasiswa.class), id);
	}

	@Override
	public List<MahasiswaModel> cariMahasiswa() {
		
		return jdbc.query("select m.name as mahasiswa_name, m.spp, m.usia, j.name as jurusan_name from mahasiswa m join jurusan j\r\n"
				+ "on j.id = m.jurusan_id;", new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

}
