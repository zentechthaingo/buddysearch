package com.buddysearch.presentation.di.module;

import com.buddysearch.android.data.mapper.realm.RealmMessageEntityMapper;
import com.buddysearch.android.data.mapper.realm.RealmUserEntityMapper;
import com.buddysearch.android.data.store.cache.MessageCache;
import com.buddysearch.android.data.store.cache.UserCache;
import com.buddysearch.android.data.store.cache.realm.RealmMessageCache;
import com.buddysearch.android.data.store.cache.realm.RealmUserCache;
import com.buddysearch.presentation.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CacheModule {

    @Provides
    @ActivityScope
    UserCache providesUserCache(RealmUserEntityMapper realmUserEntityMapper) {
        return new RealmUserCache(realmUserEntityMapper);
    }

    @Provides
    @ActivityScope
    MessageCache providesMessageCache(RealmMessageEntityMapper realmMessageEntityMapper) {
        return new RealmMessageCache(realmMessageEntityMapper);
    }
}
