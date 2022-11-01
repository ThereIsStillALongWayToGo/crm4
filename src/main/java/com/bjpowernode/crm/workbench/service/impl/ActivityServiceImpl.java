package com.bjpowernode.crm.workbench.service.impl;

import com.bjpowernode.crm.workbench.domain.Activitie;
import com.bjpowernode.crm.workbench.mapper.ActivitiesMapper;
import com.bjpowernode.crm.workbench.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("ActivityService")
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivitiesMapper activitiesMapper;
    @Override
    public int saveCreateActivity(Activitie activitie) {
        return activitiesMapper.insertActivity(activitie);
    }

    @Override
    public List<Activitie> queryActivityByConditionForPage(Map<String, Object> map) {
        return activitiesMapper.selectActivityByConditionForPage(map);
    }

    @Override
    public int queryCountOfActivityByCondition(Map<String, Object> map) {
        return activitiesMapper.selectCountOfActivityByCondition(map);
    }

    @Override
    public int deleteActivityByIds(String[] ids) {
        return activitiesMapper.deleteActivityByIds(ids);
    }

    @Override
    public Activitie queryAtivityById(String id) {
        return activitiesMapper.selectActivityById(id);
    }

    @Override
    public int saveCreateActivityByList(Activitie activitie) {
        return activitiesMapper.updateActivity(activitie);
    }

    @Override
    public List<Activitie> queryAllActivitys() {
        return activitiesMapper.selectAllActivitys();
    }

    @Override
    public int saveCreateActivityByList(List<Activitie> activitieList) {
        return activitiesMapper.insertActivityByList(activitieList);
    }
}
