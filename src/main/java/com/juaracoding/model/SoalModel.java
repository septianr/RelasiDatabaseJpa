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
@Table(name = "soal")
public class SoalModel {

	@Id
	@Column(length = 10, nullable = false)
	private String idSoal;
	@JoinColumn(name="id_plot_MK", referencedColumnName = "idPlotMK", nullable = false)
	private PlotMataKuliahModel idPlotMK;
	@Column(length = 25,nullable = false)
	private String namaSoal;
	@Column(length=1, nullable = false)
	private int status;
}
