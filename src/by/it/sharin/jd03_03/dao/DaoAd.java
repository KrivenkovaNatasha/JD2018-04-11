package by.it.sharin.jd03_03.dao;

import by.it.sharin.jd03_03.beans.Ad;

public class DaoAd extends UniversalDAO<Ad> {
    public DaoAd() {
        super(new Ad(), "ads");
    }
}
