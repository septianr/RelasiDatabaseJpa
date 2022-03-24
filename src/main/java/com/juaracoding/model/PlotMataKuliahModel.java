package com.juaracoding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="plot_mata_kuliah")
public class PlotMataKuliahModel {

	@Id
	@Column(name = "id_plot_MK", length = 10, nullable = false)
	private String idPlotMK;
	@JoinColumn(name="idMataKuliah", referencedColumnName = "idMataKuliah", nullable = false)
	private MataKuliahModel idMataKuliah;
	@JoinColumn(name="idDosen", referencedColumnName = "idDosen", nullable = false)
	private DosenModel idDosen;
	@JoinColumn(name="NIM", referencedColumnName = "nim", nullable = false)
	private MahasiswaModel nim;
}
