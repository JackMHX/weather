package com.example.weather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProcinceCode(){
        return provinceCode;
    }
    public void setProcinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
