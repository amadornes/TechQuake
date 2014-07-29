package com.amadornes.techquake.api.power;

public interface IEnergyBuffer extends IElectric {

    public int getMaxStored();

    public int getStored();

    public void setStored(int amount);

    public int drain(int amount);

    public int fill(int amount);

}
