package org.manojbaishya.indiagrimarketresearch.ceda;

import java.util.List;

public interface Api {
    public List<Commodity> getCommodities();
    public List<Geography> getGeographies();
    public List<Market> getMarkets();
}
