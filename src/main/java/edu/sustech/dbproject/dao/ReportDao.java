package edu.sustech.dbproject.dao;

import edu.sustech.dbproject.entity.Report;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportDao {
    /**
     * list all reports
     * @param num
     * @param page
     * @return
     */
    List<Report> listAllReport(Integer num,Integer page);

    /**
     * list all unprocessed reports
     * @param num represents the number for each page
     * @param page
     * @return the page of all unprocessed reports
     */
    List<Report> listAllUnprocessed(Integer num, Integer page);

    /**
     * insert a report to database
     * @param report
     */
    void insert(Report report);

    /**
     * return all pictures of the comment
     * @param report
     * @return
     */
    List<String> listPictures(Integer report);

    /**
     * modify a report
     * @param report
     */
    void update(Report report);

    /**
     * add picture for a report
     * @param picture
     */

    void addPicture(@Param("report") Integer report,@Param("report") String picture);

    /**
     * remove the picture
     * @param picture
     */
    void removePicture(@Param("report") Integer report,@Param("report") String picture);
}
