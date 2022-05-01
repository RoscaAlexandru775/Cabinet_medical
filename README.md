	Programare cabinet medical
1)pacient:(simplu)
	nume
	prenume
	gen
	data_nastere
	cnp
	nr_telefon
	grupa_sanguina
	email
	adresa

2)pacient_abonat:(pacient cu abonament)
	data_inceput_abonament
	data_sfarsit_abonament	
	tip_abonament	
	procent_discount
	
3)medic:
	nume
	prenume
	gen
	data_nastere
	cnp
	nr_telefon
	email
	adresa
	specializare

4)programare:
	nume,prenume pacient
	nume,premume medic
	adresa_clinica
	data_inceput
	data_sfarsit
	cabinet
	
5)programare_pacient:	
	pret
	

6)programare_medic:
	descriere_problema_pacient
	
7)cabinet:
	numar
	etaj
	sectie
8)factura:
	metoda_de_plata
	nume_pacient
	nume_doctor
	data_emitere
	serviciu
	pret
	tva
	total_de_plata


Metode:
1)adaugare pacient(list) 
2)modificare date pacient 
3)adaugare medic 
4)modificare date medic 
5)creare programare 
6)adaugare cabinet(sortedset) 
7)plata abonament pacient 
8)afisare programari medic 
9)afisare programari pacient 
10)creare factura 
11)afisare cabinet 

clasa main se afla in pachetul pacienti
