package com.example.kokeilu;

public class Laake
{
    int id;
    String name;
    String maara;

    public Laake(String name, String maara)
    {
      this.maara = maara;
    }
    public Laake(int id, String name, String maara)
    {
       this.id = id;
       this.name = name;
       this.maara = maara;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaara() {
        return maara;
    }

    public void setMaara(String maara) {
        this.maara = maara;
    }
}
