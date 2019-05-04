package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.ListResourceBundle;

public interface GoodsDao {

    /**
     * find a good by its id
     * @param goodId
     * @return
     */
    Good findById(Integer goodId);

    /**
     * find all pictures for this good
     * @param goodId
     * @return
     */
    List<String> listPictures(Integer goodId);


    /**
     * find all goods sold by someone
     * @param seller
     * @return
     */
    List<Good> findBySeller(Integer seller, Integer page);

    /**
     * find all goods with a keywords
     * @param name
     * @return
     */
    List<Good> findByName(String name);



//    /**
//     * find all goods that have both two keywords
//     * @param name1
//     * @param name2
//     * @return
//     */
//    List<Good> findByKeywords(String name1,String name2);

    /**
     * find all goods with a tag
     * @param name
     * @param tag
     * @return
     */
    List<Good> findWithTag(@Param("name") String name,@Param("tag") Integer tag);

    /**
     * insert a new good to database
     * @param good
     */
    void insert(Good good);

    /**
     * modify a good
     * @param good
     */

    void update(Good good);

    /**
     * add picture for a good
     * @param picture
     */

    void addPicture(@Param("good") Integer good,@Param("picture") String picture);

    /**
     * remove the picture
     * @param picture
     */
    void removePicture(@Param("good") Integer good,@Param("picture") String picture);

}
