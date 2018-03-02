package com.manager.server.mapper;

import com.manager.server.model.WeatherEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface WeatherMapper {

    @Select("select * from weather")
    List<WeatherEntity> selectAll();

    @Insert("INSERT INTO weather( time, weather, humidity, mintemp, maxtemp)"
            +"VALUES ( #{time}, #{weather}, #{humidity}, #{mintemp}, #{maxtemp} );")
    boolean insertToTable(WeatherEntity entity);

    @Delete("DELETE FROM weather WHERE time = #{time} ;")
    boolean deleteByTime(@Param("time") Date time);

    @Update("UPDATE  weather SET " +
            "time = #{time}, weather = #{weather}, humidity = #{humidity}, " +
            "mintemp = #{mintemp}, maxtemp = #{maxtemp} "
            + "WHERE time = #{time} ;")
    boolean updateByTime(WeatherEntity entity);
}
