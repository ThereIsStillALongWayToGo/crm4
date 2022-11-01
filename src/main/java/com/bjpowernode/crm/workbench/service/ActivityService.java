package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.domain.Activitie;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    int saveCreateActivity(Activitie activitie);

    List<Activitie> queryActivityByConditionForPage(Map<String,Object> map);

    int queryCountOfActivityByCondition(Map<String,Object> map);

    int deleteActivityByIds(String[] ids);

    Activitie queryAtivityById(String id);

    int saveCreateActivityByList(Activitie activitie);

    List<Activitie> queryAllActivitys();

    int saveCreateActivityByList(List<Activitie> activitieList);
}
