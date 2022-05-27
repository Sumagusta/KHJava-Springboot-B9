package com.kodehive.javawithapi9.model.submissionmodel;

import com.kodehive.javawithapi9.model.Mahasiswa;

import lombok.Data;

@Data
public class MahasiswaModel{
	private String mahasiswa_name;
	private String jurusan_name;
	private int usia;
	private int spp;
}
