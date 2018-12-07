
public class SmenaKKM {
String date;
String Prodavets;
int namberSmena;
int namberKassa;
double zet;
double nal;
double bezNal;
double rashod;
double otklonenie;
boolean udalen; //не участвует в расчете.....нужно сделать права на изменение

String timeBeforeWork;//время прибытия на работу....количество минут опоздания ...и сумма штрафа
String ProdavetsSmenshhik;

public double otclonenieRaschet() {
	otklonenie = zet - (nal + bezNal) - rashod;
	return otklonenie;
	}

}
