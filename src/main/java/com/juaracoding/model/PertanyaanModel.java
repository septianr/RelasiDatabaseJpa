package com.juaracoding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pertanyaan")
public class PertanyaanModel {

	@Id
	@Column(length = 10, nullable = false)
	private String idPertanyaan;
	@JoinColumn(name = "idSoal",referencedColumnName = "idSoal")
	private SoalModel idSoal;
	@Column(nullable = false)
	@Lob
	private String pertanyaan;
	@Column(nullable = false)
	@Lob
	private String jawaban1;
	@Column(nullable = false)
	@Lob
	private String jawaban2;
	@Column(nullable = false)
	@Lob
	private String jawaban3;
	@Column(nullable = false)
	@Lob
	private String jawaban4;
	@Column(nullable = false)
	@Lob
	private String jawabanBenar;
	@Column(length = 1)
	private int statusGambar;
}
