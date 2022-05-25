package com.kodehive.javawithapi9.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="T_MAHASISWA")
public class MahasiswaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mahasiswaId;
	private String mahasiwaName;
	private int mahasiswaUsia;
	private int mahasiswaSpp;

	public MahasiswaModel(String mahasiwaName, int mahasiswaUsia, int mahasiswaSpp) {
		this.mahasiwaName = mahasiwaName;
		this.mahasiswaUsia = mahasiswaUsia;
		this.mahasiswaSpp = mahasiswaSpp;
	}
	
	
	
}
