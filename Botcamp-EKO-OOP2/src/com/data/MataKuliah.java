package com.data;

public class MataKuliah extends Jurusan {

	private String nama;
	private String kode_mk;

	public String getNama() {
		return getNamaJurusan()+" - "+nama;
	}

	public void setNama(String nama) {
		this.nama =nama;
	}

	public String getKode_mk() {
		return kode_mk;
	}

	public void setKode_mk(String kode_mk) {
		this.kode_mk = kode_mk;
	}
}
