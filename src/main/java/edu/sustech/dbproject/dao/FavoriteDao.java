package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Good;
import edu.sustech.dbproject.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface FavoriteDao {

    /**
     * find all favorites for some one
     * @param user
     * @return
     */
    List<Good> findFavorites(Integer user, Integer page);

    /**
     * list all users mark this good
     * @param good
     * @return
     */
    Integer countUserFavorite(Integer good);

    /**
     * mark as favorite
     * @param user
     * @param good
     */
    void mark(@Param("user") Integer user, @Param("good") Integer good);

    /**
     * delete a favorite relation
     * @param user
     * @param good
     */
    void delete(@Param("user") Integer user, @Param("good") Integer good);
}
