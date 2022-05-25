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
public class MahasiswaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mahasiswaId;
	private String mahasiswaName;
	private int mahasiswaUsia;
	private int mahasiswaSpp;

	public MahasiswaModel(String mahasiswaName, int mahasiswaUsia, int mahasiswaSpp) {
		this.mahasiswaName = mahasiswaName;
		this.mahasiswaUsia = mahasiswaUsia;
		this.mahasiswaSpp = mahasiswaSpp;
	}
	
	
	
}
