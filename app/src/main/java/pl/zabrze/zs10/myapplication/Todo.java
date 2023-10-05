package pl.zabrze.zs10.myapplication;

import java.util.Calendar;
import java.util.Date;

public class Todo {
    private String nazwaTodo;
    private Date dataWykonania;

    public Todo(String nazwaTodo, Date dataWykonania) {
        this.nazwaTodo = nazwaTodo;
        this.dataWykonania = dataWykonania;
    }

    public String getNazwaTodo() {
        return nazwaTodo;
    }

    public void setNazwaTodo(String nazwaTodo) {
        this.nazwaTodo = nazwaTodo;
    }

    public Date getDataWykonania() {
        return dataWykonania;
    }

    public void setDataWykonania(Date dataWykonania) {
        this.dataWykonania = dataWykonania;
    }

    @Override
    public String toString() {
        return nazwaTodo+" "+dataWykonania;
    }
}
