package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.Activitie;

import java.util.List;
import java.util.Map;

public interface ActivitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Oct 26 17:49:42 GMT+08:00 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Oct 26 17:49:42 GMT+08:00 2022
     */
    int insert(Activitie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Oct 26 17:49:42 GMT+08:00 2022
     */
    int insertSelective(Activitie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Oct 26 17:49:42 GMT+08:00 2022
     */
    Activitie selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Oct 26 17:49:42 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(Activitie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Oct 26 17:49:42 GMT+08:00 2022
     */
    int updateByPrimaryKey(Activitie record);


    int insertActivity(Activitie activitie);

    List<Activitie>  selectActivityByConditionForPage(Map<String,Object> map);

    int selectCountOfActivityByCondition(Map<String,Object> map);

    int deleteActivityByIds(String[] ids);

    Activitie selectActivityById(String id);

    int updateActivity(Activitie activitie);

    List<Activitie> selectAllActivitys();

    int insertActivityByList(List<Activitie> activitieList);
}