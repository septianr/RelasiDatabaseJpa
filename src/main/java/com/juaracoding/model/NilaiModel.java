package com.juaracoding.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nilai")
public class NilaiModel {

	@Id
	@Column(length = 10)
	private String idSoal;
	@Column(length = 3)
	private int nilai;
}
