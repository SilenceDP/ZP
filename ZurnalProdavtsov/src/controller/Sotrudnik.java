package controller;

public class Sotrudnik {
	private String name; // Имя
	private String middleName; // Отчество
	private String surname; // Фамилия
	private String dolgnost; // Должность
	private String dateOn; // Дата устройства на работу
	private String dateOff; // Дата увольнения

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

	public String getDataOn() {
		return dateOn;
	}

	public void setDataOn(String dataOn) {
		// объязательное поле (тип дата)
		this.dateOn = dataOn;
	}

	public String getDataOff() {
		return dateOff;
	}

	public void setDataOff(String dataOff) {
		// - может быть пустым (тип дата)
		this.dateOff = dataOff;
	}

}
