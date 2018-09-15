package com.yibao.music.model.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yibao.music.model.MusicBean;
import com.yibao.music.model.MusicInfo;
import com.yibao.music.model.SearchHistoryBean;

import com.yibao.music.model.greendao.MusicBeanDao;
import com.yibao.music.model.greendao.MusicInfoDao;
import com.yibao.music.model.greendao.SearchHistoryBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig musicBeanDaoConfig;
    private final DaoConfig musicInfoDaoConfig;
    private final DaoConfig searchHistoryBeanDaoConfig;

    private final MusicBeanDao musicBeanDao;
    private final MusicInfoDao musicInfoDao;
    private final SearchHistoryBeanDao searchHistoryBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        musicBeanDaoConfig = daoConfigMap.get(MusicBeanDao.class).clone();
        musicBeanDaoConfig.initIdentityScope(type);

        musicInfoDaoConfig = daoConfigMap.get(MusicInfoDao.class).clone();
        musicInfoDaoConfig.initIdentityScope(type);

        searchHistoryBeanDaoConfig = daoConfigMap.get(SearchHistoryBeanDao.class).clone();
        searchHistoryBeanDaoConfig.initIdentityScope(type);

        musicBeanDao = new MusicBeanDao(musicBeanDaoConfig, this);
        musicInfoDao = new MusicInfoDao(musicInfoDaoConfig, this);
        searchHistoryBeanDao = new SearchHistoryBeanDao(searchHistoryBeanDaoConfig, this);

        registerDao(MusicBean.class, musicBeanDao);
        registerDao(MusicInfo.class, musicInfoDao);
        registerDao(SearchHistoryBean.class, searchHistoryBeanDao);
    }
    
    public void clear() {
        musicBeanDaoConfig.clearIdentityScope();
        musicInfoDaoConfig.clearIdentityScope();
        searchHistoryBeanDaoConfig.clearIdentityScope();
    }

    public MusicBeanDao getMusicBeanDao() {
        return musicBeanDao;
    }

    public MusicInfoDao getMusicInfoDao() {
        return musicInfoDao;
    }

    public SearchHistoryBeanDao getSearchHistoryBeanDao() {
        return searchHistoryBeanDao;
    }

}
