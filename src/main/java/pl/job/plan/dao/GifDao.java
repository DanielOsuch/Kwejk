package pl.job.plan.dao;

import pl.job.plan.model.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findFavorites();
    Gif findByCategoryId(int id);
    Gif findOne(String name);
    List<Gif> findGifById(int id);
    List<Gif> findGifByName(String name);


}
