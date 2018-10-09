package spittr.data;

import spittr.model.Spittle;

import java.util.List;

public interface SpittleRepository {
    public List<Spittle> findSpittles(long max,int count);
}
