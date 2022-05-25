package com.kodehive.javawithapi9.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kodehive.javawithapi9.model.MahasiswaModel;
import com.kodehive.javawithapi9.repository.MahasiswaDAO;

@Repository
public class MahasiswaDAOImpl implements MahasiswaDAO {

	// dependencies injection
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(MahasiswaModel m) {
		return jdbc.update("insert into mahasiswa_model (mahasiswa_name, mahasiswa_usia, mahasiswa_spp)"
				+ "values"
				+ "(?,?,?)", new Object[] {m.getMahasiswaName(), m.getMahasiswaUsia(), m.getMahasiswaSpp()});
	}

	@Override
	public List<MahasiswaModel> findAll() {
		return jdbc.query("select * from mahasiswa_model", new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class));
	}

	@Override
	public MahasiswaModel findById(int id) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject("select * from mahasiswa_model where mahasiswa_id = ?", new BeanPropertyRowMapper<MahasiswaModel>(MahasiswaModel.class), id);
	}

}
