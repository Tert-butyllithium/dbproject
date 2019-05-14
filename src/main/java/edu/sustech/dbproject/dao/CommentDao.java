package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {

    /**
     * show all comments for a seller
     * @param user
     * @return
     */
    List<Comment> showAllComment(Integer user,Integer page);

    /**
     * add a comment to database
     * @param comment
     */
    void insert(Comment comment);

    /**
     * modify a comment
     * @param comment
     */
    void update(Comment comment);

    /**
     * list all pictures for a comment
     * @param comment
     * @return
     */
    List<String> listPictures(Integer comment);

    /**
     * add picture for a comment
     * @param picture
     */

    void addPicture(Integer comment,String picture);

    /**
     * remove the picture
     * @param picture
     */
    void removePicture(Integer comment,String picture);
}
