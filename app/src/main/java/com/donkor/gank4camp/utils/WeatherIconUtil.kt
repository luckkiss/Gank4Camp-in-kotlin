package com.donkor.gank4camp.utils

import com.donkor.gank4camp.R
import java.util.HashMap

/**
 * Created by donkor on 2017/12/30.
 */
class WeatherIconUtil {
    var dayIcon: MutableMap<Int, Int> = HashMap()
    var nightIcon: MutableMap<Int, Int> = HashMap()
    init {
        dayIcon.put(100, R.mipmap.weather_clear)
        dayIcon.put(101, R.mipmap.weather_clouds)
        dayIcon.put(102, R.mipmap.weather_clouds)
        dayIcon.put(103, R.mipmap.weather_clouds)
        dayIcon.put(104, R.mipmap.weather_clouds)
        dayIcon.put(200, R.mipmap.weather_wind)
        dayIcon.put(201, R.mipmap.weather_clear)
        dayIcon.put(202, R.mipmap.weather_wind)
        dayIcon.put(203, R.mipmap.weather_wind)
        dayIcon.put(204, R.mipmap.weather_wind)
        dayIcon.put(205, R.mipmap.weather_wind)
        dayIcon.put(206, R.mipmap.weather_wind)
        dayIcon.put(207, R.mipmap.weather_wind)
        dayIcon.put(208, R.mipmap.weather_wind)
        dayIcon.put(209, R.mipmap.weather_wind)
        dayIcon.put(210, R.mipmap.weather_wind)
        dayIcon.put(211, R.mipmap.weather_wind)
        dayIcon.put(212, R.mipmap.weather_wind)
        dayIcon.put(213, R.mipmap.weather_wind)
        dayIcon.put(300, R.mipmap.weather_showers_day)
        dayIcon.put(301, R.mipmap.weather_showers_day)
        dayIcon.put(302, R.mipmap.weather_showers_day)
        dayIcon.put(303, R.mipmap.weather_showers_day)
        dayIcon.put(304, R.mipmap.weather_hail)
        dayIcon.put(305, R.mipmap.weather_drizzle_day)
        dayIcon.put(306, R.mipmap.weather_rain_day)
        dayIcon.put(307, R.mipmap.weather_rain_day)
        dayIcon.put(308, R.mipmap.weather_storm_day)
        dayIcon.put(309, R.mipmap.weather_drizzle_day)
        dayIcon.put(310, R.mipmap.weather_storm_day)
        dayIcon.put(311, R.mipmap.weather_storm_day)
        dayIcon.put(312, R.mipmap.weather_storm_day)
        dayIcon.put(313, R.mipmap.weather_snow_rain)
        dayIcon.put(400, R.mipmap.weather_snow)
        dayIcon.put(401, R.mipmap.weather_snow)
        dayIcon.put(402, R.mipmap.weather_snow)
        dayIcon.put(403, R.mipmap.weather_snow)
        dayIcon.put(404, R.mipmap.weather_snow_rain)
        dayIcon.put(405, R.mipmap.weather_snow_rain)
        dayIcon.put(406, R.mipmap.weather_snow_rain)
        dayIcon.put(500, R.mipmap.weather_fog)
        dayIcon.put(501, R.mipmap.weather_fog)
        dayIcon.put(502, R.mipmap.weather_haze)
        dayIcon.put(503, R.mipmap.weather_haze)
        dayIcon.put(504, R.mipmap.weather_haze)
        dayIcon.put(507, R.mipmap.weather_haze)
        dayIcon.put(508, R.mipmap.weather_haze)
        dayIcon.put(508, R.mipmap.weather_clear)
        dayIcon.put(508, R.mipmap.weather_snow)
        dayIcon.put(999, R.mipmap.weather_none_available)
        dayIcon.withDefault { R.mipmap.weather_none_available }


        nightIcon.put(100, R.mipmap.weather_clear_night)
        nightIcon.put(101, R.mipmap.weather_clouds_night)
        nightIcon.put(102, R.mipmap.weather_clouds)
        nightIcon.put(103, R.mipmap.weather_clouds)
        nightIcon.put(104, R.mipmap.weather_clouds)
        nightIcon.put(200, R.mipmap.weather_wind)
        nightIcon.put(201, R.mipmap.weather_clear_night)
        nightIcon.put(202, R.mipmap.weather_wind)
        nightIcon.put(203, R.mipmap.weather_wind)
        nightIcon.put(204, R.mipmap.weather_wind)
        nightIcon.put(205, R.mipmap.weather_wind)
        nightIcon.put(206, R.mipmap.weather_wind)
        nightIcon.put(207, R.mipmap.weather_wind)
        nightIcon.put(208, R.mipmap.weather_wind)
        nightIcon.put(209, R.mipmap.weather_wind)
        nightIcon.put(210, R.mipmap.weather_wind)
        nightIcon.put(211, R.mipmap.weather_wind)
        nightIcon.put(212, R.mipmap.weather_wind)
        nightIcon.put(213, R.mipmap.weather_wind)
        nightIcon.put(300, R.mipmap.weather_showers_night)
        nightIcon.put(301, R.mipmap.weather_showers_night)
        nightIcon.put(302, R.mipmap.weather_showers_night)
        nightIcon.put(303, R.mipmap.weather_showers_night)
        nightIcon.put(304, R.mipmap.weather_hail)
        nightIcon.put(305, R.mipmap.weather_drizzle_night)
        nightIcon.put(306, R.mipmap.weather_rain_day)
        nightIcon.put(307, R.mipmap.weather_rain_day)
        nightIcon.put(308, R.mipmap.weather_storm_day)
        nightIcon.put(309, R.mipmap.weather_drizzle_night)
        nightIcon.put(310, R.mipmap.weather_storm_night)
        nightIcon.put(311, R.mipmap.weather_storm_night)
        nightIcon.put(312, R.mipmap.weather_storm_night)
        nightIcon.put(313, R.mipmap.weather_snow_rain)
        nightIcon.put(400, R.mipmap.weather_snow)
        nightIcon.put(401, R.mipmap.weather_snow)
        nightIcon.put(402, R.mipmap.weather_snow)
        nightIcon.put(403, R.mipmap.weather_snow)
        nightIcon.put(404, R.mipmap.weather_snow_rain)
        nightIcon.put(405, R.mipmap.weather_snow_rain)
        nightIcon.put(406, R.mipmap.weather_snow_rain)
        nightIcon.put(500, R.mipmap.weather_fog)
        nightIcon.put(501, R.mipmap.weather_fog)
        nightIcon.put(502, R.mipmap.weather_haze)
        nightIcon.put(503, R.mipmap.weather_haze)
        nightIcon.put(504, R.mipmap.weather_haze)
        nightIcon.put(507, R.mipmap.weather_haze)
        nightIcon.put(508, R.mipmap.weather_haze)
        nightIcon.put(508, R.mipmap.weather_clear_night)
        nightIcon.put(508, R.mipmap.weather_snow)
        nightIcon.put(999, R.mipmap.weather_none_available)
        nightIcon.withDefault { R.mipmap.weather_none_available }
    }
}
