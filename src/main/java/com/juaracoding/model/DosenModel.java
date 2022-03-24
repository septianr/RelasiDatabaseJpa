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
@Table(name="dosen")
public class DosenModel {

	@Id
	@Column(length = 10, nullable = false)
	private String idDosen;
	@Column(length = 25, nullable = false)
	private String username;
	@Column(length = 25, nullable = false)
	private String password;
	@Column(length = 25, nullable = false)
	private String namaDosen;
}
