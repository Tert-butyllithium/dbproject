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
    List<Good> findFavorites(@Param("user") Integer user,@Param("page") Integer page);

    /**
     * the number of users who mark this good
     * @param good
     * @return
     */
    Integer countUserFavorite(@Param("good") Integer good);

    /**
     * mark as favorite
     * @param user
     * @param good
     * may cause exception: org.springframework.dao.DuplicateKeyException
     */
    void mark(@Param("user") Integer user, @Param("good") Integer good);

    /**
     * delete a favorite relation
     * @param user
     * @param good
     */
    void delete(@Param("user") Integer user, @Param("good") Integer good);
}
