package com.example.kokeilu;

public class Laake
{
    int id;
    String name;
    String vahvuus;
    String maara;

    public Laake(String name, String vahvuus, String maara)
    {
      this.vahvuus = vahvuus; this.maara = maara; this.name = name;
    }
    public Laake(int id, String name, String maara, String vahvuus)
    {
       this.id = id;
       this.name = name;
       this.vahvuus = vahvuus;
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

    public String getVahvuus() {
        return vahvuus;
    }

    public void setVahvuus(String vahvuus) {
        this.vahvuus = vahvuus;
    }

    public String getMaara() {
        return maara;
    }

    public void setMaara(String maara) {
        this.maara = maara;
    }
}
