package controller;

import java.time.LocalDate;

public class Sotrudnik {
	private String name; // Имя
	private String middleName; // Отчество
	private String surname; // Фамилия
	private String dolgnost; // Должность
	private LocalDate  dateOn; // Дата устройства на работу
	private LocalDate dateOff; // Дата увольнения

	
	public Sotrudnik(String surname,String name,String middleName,String dolgnost,LocalDate dateOn )
	{
		this.surname=surname;
		this.name=name;
		this.middleName=middleName;
		this.dolgnost=dolgnost;
		this.dateOn=dateOn;
	}
	
	
	// get-получаем результат из поля
	public String getName() {
		return name;
	}

	// set-задаем данные полю
	public void setName(String name) {
		/*
		 * -Проверка типа данных -Поле не должно быть пустым
		 * 
		 */
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		/*
		 * -Проверка типа данных -Поле не должно быть пустым
		 * 
		 */
		this.surname = surname;
	}

	public String getDolgnost() {
		return dolgnost;
	}

	public void setDolgnost(String dolgnost) {
		/*-Поле не должно быть пустым
		 * 
		 * */
		this.dolgnost = dolgnost;
	}

	public LocalDate getDataOn() {
		return dateOn;
	}

	public void setDataOn(LocalDate dataOn) {
		// объязательное поле (тип дата)
		this.dateOn = dataOn;
	}

	public LocalDate getDataOff() {
		return dateOff;
	}

	public void setDataOff(LocalDate dataOff) {
		// - может быть пустым (тип дата)
		this.dateOff = dataOff;
	}

}
