package com.javainuse.model;

public class Bicikla {
	// 1
	private String guma_stanje;		// moguce vrednosti "napumpana" ili "mekana"  
	private String ventil_stanje;	// moguce vrednosti "dobar" ili "los"
	private String guma_akcija1;		
	private String guma_akcija2;		

	// 2
	private String bandas_stanje;	// moguce vrednosti "centriran" ili "kriv"
	private String zica_stanje;		// moguce vrednosti "cela" ili "pokidana"
	private String bandas_akcija1;	
	private String bandas_akcija2;	
	
	// 3 i 4
	private String amortizer_stanje;	// moguce vrednosti "ispravan" ili "neispravan"
	private String amortizer_tip;		// moguce vrednosti "vazdusan" ili "oprugast"
	private String suspenzija_stanje;	// moguce vrednosti "prepumpana" ili "premekana" ili "umereno napumpana"
	private String opruge_stanje;		// moguce vrednosti "jake" ili "mekane"
	private String amortizer_akcija1;	
	private String amortizer_akcija2;	
	private String amortizer_akcija3;	
	private String amortizer_akcija4;	
	
	// 5
	private String lanac_stanje;				// moguce vrednosti "dobar" ili "los"
	private String duzina_lanca_stanje;			// moguce vrednosti "neistegnut" ili "istegnut"
	private String prednji_zupcanici_stanje;	// moguce vrednosti "nepotroseni" ili "potroseni"
	private String zadnji_zupcanici_stanje;		// moguce vrednosti "nepotroseni" ili "potroseni"
	private String freewheel_stanje;			// moguce vrednosti "dobar" ili "los"
	private String freehub_stanje;				// moguce vrednosti "dobar" ili "los"
	private String lanac_akcija1;
	private String lanac_akcija2;
	private String lanac_akcija3;
	private String lanac_akcija4;
	private String lanac_akcija5;

	// 6
	private String srednji_pogon_stanje;	// moguce vrednosti "nema luft" ili "luft"
	private String solje_sr_pog_stanje;		// moguce vrednosti "zavijene" ili "odvijene"
	private String lezajevi_sr_pog_stanje;	// moguce vrednosti "dobri" ili "losi"
	private String srednji_pogon_akcija1;
	private String srednji_pogon_akcija2;
	
	// 7
	private String kurbla_stanje;			// moguce vrednosti "zategnuta" ili "labava"
	private String sraf_osovine_stanje;		// moguce vrednosti "zavijen"	ili "odvijen"
	private String navoj_osovine_stanje;	// moguce vrednosti "dobar" ili "los"
	private String kurbla_akcija1;
	private String kurbla_akcija2;

	// 8
	private String pedala_stanje;	// moguce vrednosti "nema luft" ili "luft" ili "krcka"
	private String pedala_akcija;
	
	// 9 i 10
	private String kocnica_stanje;		// moguce vrednosti "koci" ili "ne koci"
	private String kociona_povrs_tip;	// moguce vrednosti "obruc" ili "disk"
	private String paknovi_stanje;		// moguce vrednosti "dobri" ili "potroseni"
	private String plocice_stanje;		// moguce vrednosti "dobre" ili "potrosene"
	private String disk_stanje;			// moguce vrednosti "dobar" ili "los"
	private String disk_tip;			// moguce vrednosti "mehanicki" ili "hidraulicni"
	private String kocnica_akcija1;
	private String kocnica_akcija2;
	private String kocnica_akcija3;
	private String kocnica_akcija4;
	private String kocnica_akcija5;
	private String kocnica_akcija6;
	private String kocnica_akcija7;

	// 11
	private String prednji_menjac_stanje;					// moguce vrednosti "prebacuje" ili "ne prebacuje"
	private String visina_prednjeg_menjaca_stanje;			// moguce vrednosti "previse podignut" ili "previse spusten" ili "taman"
	private String paralela_sa_lancanicima_stanje;			// moguce vrednosti "jeste" ili "nije"
	private String sajla_prednjeg_menjaca_stanje;			// moguce vrednosti "dobra" ili "losa"
	private String index_rucice_prednjeg_menjaca_stanje;	// moguce vrednosti "dobar" ili "propao"
	private String prednji_menjac_akcija1;
	private String prednji_menjac_akcija2;
	private String prednji_menjac_akcija3;
	private String prednji_menjac_akcija4;
	private String prednji_menjac_akcija5;

	// 12
	private String zadnji_menjac_stanje;				// moguce vrednosti "prebacuje" ili "ne prebacuje"
	private String kuka_zadnjeg_menjaca_stanje;			// moguce vrednosti "prava" ili "kriva"
	private String index_rucice_zadnjeg_menjaca_stanje;	// moguce vrednosti "dobar" ili "propao"
	private String rolnice_zadnjeg_menjaca_stanje;		// moguce vrednosti "dobre" ili "potrosene"
	private String sajla_zadnjeg_menjaca_stanje;		// moguce vrednosti "dobra" ili "losa"
	private String zadnji_menjac_akcija1;
	private String zadnji_menjac_akcija2;
	private String zadnji_menjac_akcija3;
	private String zadnji_menjac_akcija4;
	private String zadnji_menjac_akcija5;

	// 13
	private String kaseta_stanje;	// moguce vrednosti "radi" ili "vrti u prazno"
	private String kaseta_akcija;
	
	// 14
	private String sticna_stanje;	// moguce vrednosti "propada" ili "ne propada"
	private String sticna_akcija;
	
	// 15
	private String sediste_stanje;	// moguce vrednosti "tvrdo" ili "meko" ili "taman"
	private String sediste_akcija;
	
	// 16
	private String lula_volana_stanje;	// moguce vrednosti "zategnuta" ili "olabavljena"
	private String lula_volana_akcija;
	
	// 17 
	private String volan_stanje;	// moguce vrednosti "zategnut" ili "olabavljen"
	private String volan_akcija;
	
	// 18
	private String tocak_stanje;	// moguce vrednosti "nema luft" ili "luft"
	private String tocak_akcija;

	// 19
	private String viljuska_stanje;	// moguce vrednosti "nema luft" ili "luft"
	private String viljuska_akcija;

	/* DO 19(SA NJIM) DEFINISEM RAD GUI-A - POKRIVENA 42 PRAVILA */
	
	// 20
	private String ram_rdja_stanje;	// moguce vrednosti "nema" ili "ima" 
	private String ram_rdja_akcija;

	// 21
	private String lanac_skripi_stanje;	// moguce vrednosti "da" ili "ne"
	private String lanac_skripi_akcija;
	
	// 22
	private String full_suspension_ram_stanje;	// moguce vrednosti "jeste" ili "nije"
	private String zglobovi_stanje;				// moguce vrednosti "nema luft" ili "luft" ili "lose radi"
	private String full_suspension_ram_akcija;

	// 23
	private String ram_ulje_stanje;	// moguce vrednosti "nema" ili "ima" 
	private String ram_ulje_akcija;
	
	// 24
	private String ram_udaren_stanje;	// moguce vrednosti "nije" ili "jeste"
	private String ram_kriv_stanje;		// moguce vrednosti "nije" ili "jeste"
	private String ram_pukao_stanje;	// moguce vrednosti "nije" ili "jeste"
	private String ram_udaren_akcija;

	// 25
	private String duzina_bicikla_stanje;	// moguce vrednosti "odgovara" ili "ne odgovara"
	private String duzina_bicikla_akcija;
	
	// 26
	private String krut_bicikl_stanje;	// moguce vrednosti "nije" ili "jeste"
	private String krut_bicikl_akcija;
	
	// 27
	private String vibracije_pri_voznji_stanje;	// moguce vrednosti "nema" ili "ima"
	private String vibracije_pri_voznji_akcija;

	//	28
	private String dropper_post_stanje;				// moguce vrednosti "ispravan" ili "neispravan"	
	private String sajla_dropper_post_stanje;		// moguce vrednosti "nije popustila" ili "popustila"
	private String dropper_post_akcija;

	// 29
	private String zakljucavanje_vile_stanje;	// moguce vrednosti "ispravno" ili "neispravno"
	private String sajla_zak_vile_stanje;		// moguce vrednosti "nije popustila" ili "popustila"
	private String stubovi_vile_stanje;			// moguce vrednosti "imaju ogrebotine" ili "nemaju ogrebotine"
	private String zakljucavanje_vile_akcija;
	
	public String getGuma_akcija1() {
		return guma_akcija1;
	}
	public void setGuma_akcija1(String guma_akcija1) {
		this.guma_akcija1 = guma_akcija1;
	}
	public String getGuma_akcija2() {
		return guma_akcija2;
	}
	public void setGuma_akcija2(String guma_akcija2) {
		this.guma_akcija2 = guma_akcija2;
	}
	public String getBandas_akcija1() {
		return bandas_akcija1;
	}
	public void setBandas_akcija1(String bandas_akcija1) {
		this.bandas_akcija1 = bandas_akcija1;
	}
	public String getBandas_akcija2() {
		return bandas_akcija2;
	}
	public void setBandas_akcija2(String bandas_akcija2) {
		this.bandas_akcija2 = bandas_akcija2;
	}
	public String getAmortizer_akcija1() {
		return amortizer_akcija1;
	}
	public void setAmortizer_akcija1(String amortizer_akcija1) {
		this.amortizer_akcija1 = amortizer_akcija1;
	}
	public String getAmortizer_akcija2() {
		return amortizer_akcija2;
	}
	public void setAmortizer_akcija2(String amortizer_akcija2) {
		this.amortizer_akcija2 = amortizer_akcija2;
	}
	public String getAmortizer_akcija3() {
		return amortizer_akcija3;
	}
	public void setAmortizer_akcija3(String amortizer_akcija3) {
		this.amortizer_akcija3 = amortizer_akcija3;
	}
	public String getAmortizer_akcija4() {
		return amortizer_akcija4;
	}
	public void setAmortizer_akcija4(String amortizer_akcija4) {
		this.amortizer_akcija4 = amortizer_akcija4;
	}
	public String getLanac_akcija1() {
		return lanac_akcija1;
	}
	public void setLanac_akcija1(String lanac_akcija1) {
		this.lanac_akcija1 = lanac_akcija1;
	}
	public String getLanac_akcija2() {
		return lanac_akcija2;
	}
	public void setLanac_akcija2(String lanac_akcija2) {
		this.lanac_akcija2 = lanac_akcija2;
	}
	public String getLanac_akcija3() {
		return lanac_akcija3;
	}
	public void setLanac_akcija3(String lanac_akcija3) {
		this.lanac_akcija3 = lanac_akcija3;
	}
	public String getLanac_akcija4() {
		return lanac_akcija4;
	}
	public void setLanac_akcija4(String lanac_akcija4) {
		this.lanac_akcija4 = lanac_akcija4;
	}
	public String getLanac_akcija5() {
		return lanac_akcija5;
	}
	public void setLanac_akcija5(String lanac_akcija5) {
		this.lanac_akcija5 = lanac_akcija5;
	}
	public String getSrednji_pogon_akcija1() {
		return srednji_pogon_akcija1;
	}
	public void setSrednji_pogon_akcija1(String srednji_pogon_akcija1) {
		this.srednji_pogon_akcija1 = srednji_pogon_akcija1;
	}
	public String getSrednji_pogon_akcija2() {
		return srednji_pogon_akcija2;
	}
	public void setSrednji_pogon_akcija2(String srednji_pogon_akcija2) {
		this.srednji_pogon_akcija2 = srednji_pogon_akcija2;
	}
	public String getSraf_osovine_stanje() {
		return sraf_osovine_stanje;
	}
	public void setSraf_osovine_stanje(String sraf_osovine_stanje) {
		this.sraf_osovine_stanje = sraf_osovine_stanje;
	}
	public String getKurbla_akcija1() {
		return kurbla_akcija1;
	}
	public void setKurbla_akcija1(String kurbla_akcija1) {
		this.kurbla_akcija1 = kurbla_akcija1;
	}
	public String getKurbla_akcija2() {
		return kurbla_akcija2;
	}
	public void setKurbla_akcija2(String kurbla_akcija2) {
		this.kurbla_akcija2 = kurbla_akcija2;
	}
	public String getPedala_akcija() {
		return pedala_akcija;
	}
	public void setPedala_akcija(String pedala_akcija) {
		this.pedala_akcija = pedala_akcija;
	}
	public String getKocnica_akcija1() {
		return kocnica_akcija1;
	}
	public void setKocnica_akcija1(String kocnica_akcija1) {
		this.kocnica_akcija1 = kocnica_akcija1;
	}
	public String getKocnica_akcija2() {
		return kocnica_akcija2;
	}
	public void setKocnica_akcija2(String kocnica_akcija2) {
		this.kocnica_akcija2 = kocnica_akcija2;
	}
	public String getKocnica_akcija3() {
		return kocnica_akcija3;
	}
	public void setKocnica_akcija3(String kocnica_akcija3) {
		this.kocnica_akcija3 = kocnica_akcija3;
	}
	public String getKocnica_akcija4() {
		return kocnica_akcija4;
	}
	public void setKocnica_akcija4(String kocnica_akcija4) {
		this.kocnica_akcija4 = kocnica_akcija4;
	}
	public String getKocnica_akcija5() {
		return kocnica_akcija5;
	}
	public void setKocnica_akcija5(String kocnica_akcija5) {
		this.kocnica_akcija5 = kocnica_akcija5;
	}
	public String getKocnica_akcija6() {
		return kocnica_akcija6;
	}
	public void setKocnica_akcija6(String kocnica_akcija6) {
		this.kocnica_akcija6 = kocnica_akcija6;
	}
	public String getKocnica_akcija7() {
		return kocnica_akcija7;
	}
	public void setKocnica_akcija7(String kocnica_akcija7) {
		this.kocnica_akcija7 = kocnica_akcija7;
	}
	public String getPrednji_menjac_akcija1() {
		return prednji_menjac_akcija1;
	}
	public void setPrednji_menjac_akcija1(String prednji_menjac_akcija1) {
		this.prednji_menjac_akcija1 = prednji_menjac_akcija1;
	}
	public String getPrednji_menjac_akcija2() {
		return prednji_menjac_akcija2;
	}
	public void setPrednji_menjac_akcija2(String prednji_menjac_akcija2) {
		this.prednji_menjac_akcija2 = prednji_menjac_akcija2;
	}
	public String getPrednji_menjac_akcija3() {
		return prednji_menjac_akcija3;
	}
	public void setPrednji_menjac_akcija3(String prednji_menjac_akcija3) {
		this.prednji_menjac_akcija3 = prednji_menjac_akcija3;
	}
	public String getPrednji_menjac_akcija4() {
		return prednji_menjac_akcija4;
	}
	public void setPrednji_menjac_akcija4(String prednji_menjac_akcija4) {
		this.prednji_menjac_akcija4 = prednji_menjac_akcija4;
	}
	public String getPrednji_menjac_akcija5() {
		return prednji_menjac_akcija5;
	}
	public void setPrednji_menjac_akcija5(String prednji_menjac_akcija5) {
		this.prednji_menjac_akcija5 = prednji_menjac_akcija5;
	}
	public String getZadnji_menjac_akcija1() {
		return zadnji_menjac_akcija1;
	}
	public void setZadnji_menjac_akcija1(String zadnji_menjac_akcija1) {
		this.zadnji_menjac_akcija1 = zadnji_menjac_akcija1;
	}
	public String getZadnji_menjac_akcija2() {
		return zadnji_menjac_akcija2;
	}
	public void setZadnji_menjac_akcija2(String zadnji_menjac_akcija2) {
		this.zadnji_menjac_akcija2 = zadnji_menjac_akcija2;
	}
	public String getZadnji_menjac_akcija3() {
		return zadnji_menjac_akcija3;
	}
	public void setZadnji_menjac_akcija3(String zadnji_menjac_akcija3) {
		this.zadnji_menjac_akcija3 = zadnji_menjac_akcija3;
	}
	public String getZadnji_menjac_akcija4() {
		return zadnji_menjac_akcija4;
	}
	public void setZadnji_menjac_akcija4(String zadnji_menjac_akcija4) {
		this.zadnji_menjac_akcija4 = zadnji_menjac_akcija4;
	}
	public String getZadnji_menjac_akcija5() {
		return zadnji_menjac_akcija5;
	}
	public void setZadnji_menjac_akcija5(String zadnji_menjac_akcija5) {
		this.zadnji_menjac_akcija5 = zadnji_menjac_akcija5;
	}
	public String getKaseta_akcija() {
		return kaseta_akcija;
	}
	public void setKaseta_akcija(String kaseta_akcija) {
		this.kaseta_akcija = kaseta_akcija;
	}
	public String getSticna_akcija() {
		return sticna_akcija;
	}
	public void setSticna_akcija(String sticna_akcija) {
		this.sticna_akcija = sticna_akcija;
	}
	public String getSediste_akcija() {
		return sediste_akcija;
	}
	public void setSediste_akcija(String sediste_akcija) {
		this.sediste_akcija = sediste_akcija;
	}
	public String getLula_volana_akcija() {
		return lula_volana_akcija;
	}
	public void setLula_volana_akcija(String lula_volana_akcija) {
		this.lula_volana_akcija = lula_volana_akcija;
	}
	public String getVolan_akcija() {
		return volan_akcija;
	}
	public void setVolan_akcija(String volan_akcija) {
		this.volan_akcija = volan_akcija;
	}
	public String getTocak_akcija() {
		return tocak_akcija;
	}
	public void setTocak_akcija(String tocak_akcija) {
		this.tocak_akcija = tocak_akcija;
	}
	public String getViljuska_akcija() {
		return viljuska_akcija;
	}
	public void setViljuska_akcija(String viljuska_akcija) {
		this.viljuska_akcija = viljuska_akcija;
	}
	public String getRam_rdja_akcija() {
		return ram_rdja_akcija;
	}
	public void setRam_rdja_akcija(String ram_rdja_akcija) {
		this.ram_rdja_akcija = ram_rdja_akcija;
	}
	public String getLanac_skripi_akcija() {
		return lanac_skripi_akcija;
	}
	public void setLanac_skripi_akcija(String lanac_skripi_akcija) {
		this.lanac_skripi_akcija = lanac_skripi_akcija;
	}
	public String getFull_suspension_ram_akcija() {
		return full_suspension_ram_akcija;
	}
	public void setFull_suspension_ram_akcija(String full_suspension_ram_akcija) {
		this.full_suspension_ram_akcija = full_suspension_ram_akcija;
	}
	public String getRam_ulje_akcija() {
		return ram_ulje_akcija;
	}
	public void setRam_ulje_akcija(String ram_ulje_akcija) {
		this.ram_ulje_akcija = ram_ulje_akcija;
	}
	public String getRam_udaren_akcija() {
		return ram_udaren_akcija;
	}
	public void setRam_udaren_akcija(String ram_udaren_akcija) {
		this.ram_udaren_akcija = ram_udaren_akcija;
	}
	public String getDuzina_bicikla_akcija() {
		return duzina_bicikla_akcija;
	}
	public void setDuzina_bicikla_akcija(String duzina_bicikla_akcija) {
		this.duzina_bicikla_akcija = duzina_bicikla_akcija;
	}
	public String getKrut_bicikl_akcija() {
		return krut_bicikl_akcija;
	}
	public void setKrut_bicikl_akcija(String krut_bicikl_akcija) {
		this.krut_bicikl_akcija = krut_bicikl_akcija;
	}
	public String getVibracije_pri_voznji_akcija() {
		return vibracije_pri_voznji_akcija;
	}
	public void setVibracije_pri_voznji_akcija(String vibracije_pri_voznji_akcija) {
		this.vibracije_pri_voznji_akcija = vibracije_pri_voznji_akcija;
	}
	public String getDropper_post_akcija() {
		return dropper_post_akcija;
	}
	public void setDropper_post_akcija(String dropper_post_akcija) {
		this.dropper_post_akcija = dropper_post_akcija;
	}
	public String getZakljucavanje_vile_akcija() {
		return zakljucavanje_vile_akcija;
	}
	public void setZakljucavanje_vile_akcija(String zakljucavanje_vile_akcija) {
		this.zakljucavanje_vile_akcija = zakljucavanje_vile_akcija;
	}
	public String getGuma_stanje() {
		return guma_stanje;
	}
	public void setGuma_stanje(String guma_stanje) {
		this.guma_stanje = guma_stanje;
	}
	public String getIndex_rucice_prednjeg_menjaca_stanje() {
		return index_rucice_prednjeg_menjaca_stanje;
	}
	public void setIndex_rucice_prednjeg_menjaca_stanje(String index_rucice_prednjeg_menjaca_stanje) {
		this.index_rucice_prednjeg_menjaca_stanje = index_rucice_prednjeg_menjaca_stanje;
	}
	public String getIndex_rucice_zadnjeg_menjaca_stanje() {
		return index_rucice_zadnjeg_menjaca_stanje;
	}
	public void setIndex_rucice_zadnjeg_menjaca_stanje(String index_rucice_zadnjeg_menjaca_stanje) {
		this.index_rucice_zadnjeg_menjaca_stanje = index_rucice_zadnjeg_menjaca_stanje;
	}
	public String getFull_suspension_ram_stanje() {
		return full_suspension_ram_stanje;
	}
	public void setFull_suspension_ram_stanje(String full_suspension_ram_stanje) {
		this.full_suspension_ram_stanje = full_suspension_ram_stanje;
	}
	public String getVentil_stanje() {
		return ventil_stanje;
	}
	public void setVentil_stanje(String ventil_stanje) {
		this.ventil_stanje = ventil_stanje;
	}
	public String getBandas_stanje() {
		return bandas_stanje;
	}
	public void setBandas_stanje(String bandas_stanje) {
		this.bandas_stanje = bandas_stanje;
	}
	public String getZica_stanje() {
		return zica_stanje;
	}
	public void setZica_stanje(String zica_stanje) {
		this.zica_stanje = zica_stanje;
	}
	public String getAmortizer_stanje() {
		return amortizer_stanje;
	}
	public void setAmortizer_stanje(String amortizer_stanje) {
		this.amortizer_stanje = amortizer_stanje;
	}
	public String getAmortizer_tip() {
		return amortizer_tip;
	}
	public void setAmortizer_tip(String amortizer_tip) {
		this.amortizer_tip = amortizer_tip;
	}
	public String getSuspenzija_stanje() {
		return suspenzija_stanje;
	}
	public void setSuspenzija_stanje(String suspenzija_stanje) {
		this.suspenzija_stanje = suspenzija_stanje;
	}
	public String getOpruge_stanje() {
		return opruge_stanje;
	}
	public void setOpruge_stanje(String opruge_stanje) {
		this.opruge_stanje = opruge_stanje;
	}
	public String getLanac_stanje() {
		return lanac_stanje;
	}
	public void setLanac_stanje(String lanac_stanje) {
		this.lanac_stanje = lanac_stanje;
	}
	public String getDuzina_lanca_stanje() {
		return duzina_lanca_stanje;
	}
	public void setDuzina_lanca_stanje(String duzina_lanca_stanje) {
		this.duzina_lanca_stanje = duzina_lanca_stanje;
	}
	public String getPrednji_zupcanici_stanje() {
		return prednji_zupcanici_stanje;
	}
	public void setPrednji_zupcanici_stanje(String prednji_zupcanici_stanje) {
		this.prednji_zupcanici_stanje = prednji_zupcanici_stanje;
	}
	public String getZadnji_zupcanici_stanje() {
		return zadnji_zupcanici_stanje;
	}
	public void setZadnji_zupcanici_stanje(String zadnji_zupcanici_stanje) {
		this.zadnji_zupcanici_stanje = zadnji_zupcanici_stanje;
	}
	public String getFreewheel_stanje() {
		return freewheel_stanje;
	}
	public void setFreewheel_stanje(String freewheel_stanje) {
		this.freewheel_stanje = freewheel_stanje;
	}
	public String getFreehub_stanje() {
		return freehub_stanje;
	}
	public void setFreehub_stanje(String freehub_stanje) {
		this.freehub_stanje = freehub_stanje;
	}
	public String getSrednji_pogon_stanje() {
		return srednji_pogon_stanje;
	}
	public void setSrednji_pogon_stanje(String srednji_pogon_stanje) {
		this.srednji_pogon_stanje = srednji_pogon_stanje;
	}
	public String getSolje_sr_pog_stanje() {
		return solje_sr_pog_stanje;
	}
	public void setSolje_sr_pog_stanje(String solje_sr_pog_stanje) {
		this.solje_sr_pog_stanje = solje_sr_pog_stanje;
	}
	public String getLezajevi_sr_pog_stanje() {
		return lezajevi_sr_pog_stanje;
	}
	public void setLezajevi_sr_pog_stanje(String lezajevi_sr_pog_stanje) {
		this.lezajevi_sr_pog_stanje = lezajevi_sr_pog_stanje;
	}
	public String getKurbla_stanje() {
		return kurbla_stanje;
	}
	public void setKurbla_stanje(String kurbla_stanje) {
		this.kurbla_stanje = kurbla_stanje;
	}
	public String getNavoj_osovine_stanje() {
		return navoj_osovine_stanje;
	}
	public void setNavoj_osovine_stanje(String navoj_osovine_stanje) {
		this.navoj_osovine_stanje = navoj_osovine_stanje;
	}
	public String getPedala_stanje() {
		return pedala_stanje;
	}
	public void setPedala_stanje(String pedala_stanje) {
		this.pedala_stanje = pedala_stanje;
	}
	public String getKocnica_stanje() {
		return kocnica_stanje;
	}
	public void setKocnica_stanje(String kocnica_stanje) {
		this.kocnica_stanje = kocnica_stanje;
	}
	public String getKociona_povrs_tip() {
		return kociona_povrs_tip;
	}
	public void setKociona_povrs_tip(String kociona_povrs_tip) {
		this.kociona_povrs_tip = kociona_povrs_tip;
	}
	public String getPaknovi_stanje() {
		return paknovi_stanje;
	}
	public void setPaknovi_stanje(String paknovi_stanje) {
		this.paknovi_stanje = paknovi_stanje;
	}
	public String getPlocice_stanje() {
		return plocice_stanje;
	}
	public void setPlocice_stanje(String plocice_stanje) {
		this.plocice_stanje = plocice_stanje;
	}
	public String getDisk_stanje() {
		return disk_stanje;
	}
	public void setDisk_stanje(String disk_stanje) {
		this.disk_stanje = disk_stanje;
	}
	public String getDisk_tip() {
		return disk_tip;
	}
	public void setDisk_tip(String disk_tip) {
		this.disk_tip = disk_tip;
	}
	public String getPrednji_menjac_stanje() {
		return prednji_menjac_stanje;
	}
	public void setPrednji_menjac_stanje(String prednji_menjac_stanje) {
		this.prednji_menjac_stanje = prednji_menjac_stanje;
	}
	public String getVisina_prednjeg_menjaca_stanje() {
		return visina_prednjeg_menjaca_stanje;
	}
	public void setVisina_prednjeg_menjaca_stanje(String visina_prednjeg_menjaca_stanje) {
		this.visina_prednjeg_menjaca_stanje = visina_prednjeg_menjaca_stanje;
	}
	public String getParalela_sa_lancanicima_stanje() {
		return paralela_sa_lancanicima_stanje;
	}
	public void setParalela_sa_lancanicima_stanje(String paralela_sa_lancanicima_stanje) {
		this.paralela_sa_lancanicima_stanje = paralela_sa_lancanicima_stanje;
	}
	public String getSajla_prednjeg_menjaca_stanje() {
		return sajla_prednjeg_menjaca_stanje;
	}
	public void setSajla_prednjeg_menjaca_stanje(String sajla_prednjeg_menjaca_stanje) {
		this.sajla_prednjeg_menjaca_stanje = sajla_prednjeg_menjaca_stanje;
	}
	public String getZadnji_menjac_stanje() {
		return zadnji_menjac_stanje;
	}
	public void setZadnji_menjac_stanje(String zadnji_menjac_stanje) {
		this.zadnji_menjac_stanje = zadnji_menjac_stanje;
	}
	public String getKuka_zadnjeg_menjaca_stanje() {
		return kuka_zadnjeg_menjaca_stanje;
	}
	public void setKuka_zadnjeg_menjaca_stanje(String kuka_zadnjeg_menjaca_stanje) {
		this.kuka_zadnjeg_menjaca_stanje = kuka_zadnjeg_menjaca_stanje;
	}
	public String getRolnice_zadnjeg_menjaca_stanje() {
		return rolnice_zadnjeg_menjaca_stanje;
	}
	public void setRolnice_zadnjeg_menjaca_stanje(String rolnice_zadnjeg_menjaca_stanje) {
		this.rolnice_zadnjeg_menjaca_stanje = rolnice_zadnjeg_menjaca_stanje;
	}
	public String getSajla_zadnjeg_menjaca_stanje() {
		return sajla_zadnjeg_menjaca_stanje;
	}
	public void setSajla_zadnjeg_menjaca_stanje(String sajla_zadnjeg_menjaca_stanje) {
		this.sajla_zadnjeg_menjaca_stanje = sajla_zadnjeg_menjaca_stanje;
	}
	public String getKaseta_stanje() {
		return kaseta_stanje;
	}
	public void setKaseta_stanje(String kaseta_stanje) {
		this.kaseta_stanje = kaseta_stanje;
	}
	public String getSticna_stanje() {
		return sticna_stanje;
	}
	public void setSticna_stanje(String sticna_stanje) {
		this.sticna_stanje = sticna_stanje;
	}
	public String getSediste_stanje() {
		return sediste_stanje;
	}
	public void setSediste_stanje(String sediste_stanje) {
		this.sediste_stanje = sediste_stanje;
	}
	public String getLula_volana_stanje() {
		return lula_volana_stanje;
	}
	public void setLula_volana_stanje(String lula_volana_stanje) {
		this.lula_volana_stanje = lula_volana_stanje;
	}
	public String getVolan_stanje() {
		return volan_stanje;
	}
	public void setVolan_stanje(String volan_stanje) {
		this.volan_stanje = volan_stanje;
	}
	public String getTocak_stanje() {
		return tocak_stanje;
	}
	public void setTocak_stanje(String tocak_stanje) {
		this.tocak_stanje = tocak_stanje;
	}
	public String getViljuska_stanje() {
		return viljuska_stanje;
	}
	public void setViljuska_stanje(String viljuska_stanje) {
		this.viljuska_stanje = viljuska_stanje;
	}
	public String getRam_rdja_stanje() {
		return ram_rdja_stanje;
	}
	public void setRam_rdja_stanje(String ram_rdja_stanje) {
		this.ram_rdja_stanje = ram_rdja_stanje;
	}
	public String getLanac_skripi_stanje() {
		return lanac_skripi_stanje;
	}
	public void setLanac_skripi_stanje(String lanac_skripi_stanje) {
		this.lanac_skripi_stanje = lanac_skripi_stanje;
	}
	public String getZglobovi_stanje() {
		return zglobovi_stanje;
	}
	public void setZglobovi_stanje(String zglobovi_stanje) {
		this.zglobovi_stanje = zglobovi_stanje;
	}
	public String getRam_ulje_stanje() {
		return ram_ulje_stanje;
	}
	public void setRam_ulje_stanje(String ram_ulje_stanje) {
		this.ram_ulje_stanje = ram_ulje_stanje;
	}
	public String getRam_udaren_stanje() {
		return ram_udaren_stanje;
	}
	public void setRam_udaren_stanje(String ram_udaren_stanje) {
		this.ram_udaren_stanje = ram_udaren_stanje;
	}
	public String getRam_kriv_stanje() {
		return ram_kriv_stanje;
	}
	public void setRam_kriv_stanje(String ram_kriv_stanje) {
		this.ram_kriv_stanje = ram_kriv_stanje;
	}
	public String getRam_pukao_stanje() {
		return ram_pukao_stanje;
	}
	public void setRam_pukao_stanje(String ram_pukao_stanje) {
		this.ram_pukao_stanje = ram_pukao_stanje;
	}
	public String getDuzina_bicikla_stanje() {
		return duzina_bicikla_stanje;
	}
	public void setDuzina_bicikla_stanje(String duzina_bicikla_stanje) {
		this.duzina_bicikla_stanje = duzina_bicikla_stanje;
	}
	public String getKrut_bicikl_stanje() {
		return krut_bicikl_stanje;
	}
	public void setKrut_bicikl_stanje(String krut_bicikl_stanje) {
		this.krut_bicikl_stanje = krut_bicikl_stanje;
	}
	public String getVibracije_pri_voznji_stanje() {
		return vibracije_pri_voznji_stanje;
	}
	public void setVibracije_pri_voznji_stanje(String vibracije_pri_voznji_stanje) {
		this.vibracije_pri_voznji_stanje = vibracije_pri_voznji_stanje;
	}
	public String getDropper_post_stanje() {
		return dropper_post_stanje;
	}
	public void setDropper_post_stanje(String dropper_post_stanje) {
		this.dropper_post_stanje = dropper_post_stanje;
	}
	public String getSajla_dropper_post_stanje() {
		return sajla_dropper_post_stanje;
	}
	public void setSajla_dropper_post_stanje(String sajla_dropper_post_stanje) {
		this.sajla_dropper_post_stanje = sajla_dropper_post_stanje;
	}
	public String getZakljucavanje_vile_stanje() {
		return zakljucavanje_vile_stanje;
	}
	public void setZakljucavanje_vile_stanje(String zakljucavanje_vile_stanje) {
		this.zakljucavanje_vile_stanje = zakljucavanje_vile_stanje;
	}
	public String getSajla_zak_vile_stanje() {
		return sajla_zak_vile_stanje;
	}
	public void setSajla_zak_vile_stanje(String sajla_zak_vile_stanje) {
		this.sajla_zak_vile_stanje = sajla_zak_vile_stanje;
	}
	public String getStubovi_vile_stanje() {
		return stubovi_vile_stanje;
	}
	public void setStubovi_vile_stanje(String stubovi_vile_stanje) {
		this.stubovi_vile_stanje = stubovi_vile_stanje;
	}
}