package com.amadornes.techquake.api.power;

public interface IEnergyProducer extends IElectric {

    public int getMaxProduced();

    public int produce();

}
