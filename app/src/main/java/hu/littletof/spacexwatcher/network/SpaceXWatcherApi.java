package hu.littletof.spacexwatcher.network;

import java.util.List;

import hu.littletof.spacexwatcher.model.AllLaunch;
import retrofit2.Call;
import retrofit2.http.*;

public interface SpaceXWatcherApi {

    /**
     * All Launches
     * #### Optional Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| flight_id | `5a9fc479ab70786ba5a1eaaa` | string | Filter launches by mongo document id |\n| start/end | `start=2017-06-22&amp;end=2017-06-25` | valid JavaScript date format | Include both to sort by date range |\n| flight_number | `60` | integer | Filter by flight number |\n| launch_year | `2018` | integer | Filter by launch year |\n| launch_date_utc | `2017-06-23T19:10:000Z` | UTC ISO timestamp | Filter by utc launch date |\n| launch_date_local | `2017-06-23T19:10:000Z` | Local ISO timestamp | Filter by local launch date |\n| tbd | `true` | boolean | Filter by TBD launches |\n| rocket_id | `falconheavy` | string | Filter by rocket ID |\n| rocket_name | `Falcon+Heavy` | string | Filter by rocket name |\n| rocket_type | `FT` | string | Filter by rocket type |\n| core_serial | `B1045` | string | Filter by core serial number |\n| land_success | `true` | boolean | Filter by successful core landings |\n| landing_intent | `true` | boolean | Filter by landing intention |\n| landing_type | `ASDS` | string | Filter by landing method |\n| landing_vehicle | `OCISLY` | string | Filter by landing vehicle |\n| cap_serial | `C111` | string | Filter by capsule serial number |\n| core_flight | `2` | integer | Filter by number of previous core flights |\n| block | `5` | integer | Filter by core block number |\n| gridfins | `true` | boolean | Filter launches by cores that used gridfins |\n| legs | `true` | boolean | Filter launches by cores that used landing legs |\n| core_reuse | `true` | boolean | Filter launches by reused cores |\n| capsule_reuse | `true` | boolean | Filter launches by reused capsules |\n| fairings_reused | `true` | boolean | Filter by reused fairings |\n| fairings_recovery_attempt | `false` | boolean | Filter by fairing recovery attempts |\n| fairings_recovered | `false` | boolean | Filter by recovered fairings |\n| fairings_ship | `MRSTEVEN` | string | Filter by fairings ship used |\n| site_id | `ksc_lc_39a` | string | Filter by launch site ID |\n| site_name | `KSC LC 39A` | string | Filter by launch site ID |\n| payload_id | `BulgariaSat-1` | string | Filter by payload ID |\n| norad_id | `43571` | integer | Filter by NORAD ID |\n| customer | `Iridium` | string | Filter by launch payload customer |\n| nationality | `Bulgaria` | string | Filter by payload nationality |\n| manufacturer | `SSL` | string | Filter by payload manufacturer |\n| payload_type | `Satellite` | string | Filter by payload type |\n| orbit | `GTO` | string | Filter by payload orbit |\n| reference_system | `geocentric` | string | Filter by payload orbit reference system |\n| regime | `geostationary` | string | Filter by payload orbit regime |\n| longitude | `-108` | float | Filter by payload orbit longitude |\n| semi_major_axis_km | `21226.178` | float | Filter by payload orbit semi major axis |\n| eccentricity | `0.6904141` | float | Filter by payload orbit eccentricity |\n| periapsis_km | `193.19` | float | Filter by payload orbit periapsis |\n| apoapsis_km | `29502.896` | float | Filter by payload orbit apoapsis |\n| inclination_deg | `27.0648` | float | Filter by payload orbit inclination |\n| period_min | `512.941` | float | Filter by payload orbit period |\n| lifespan_years | `512.941` | integer | Filter by payload lifespan in years |\n| epoch | `2018-08-07T06:57:16.000Z` | string | Filter by payload orbit epoch |\n| mean_motion | `2.80734018` | float | Filter by payload orbit mean motion |\n| raan | `227.0228` | float | Filter by payload orbit right ascension of the ascending node |\n| launch_success | `true` | boolean | Filter by launch success |\n\n#### Optional Ouput Control Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| id | `true` | boolean | Set as `true` to show mongo document id&#39;s |\n| limit | `3` | integer | Limit results returned, defaults to all documents returned |\n| offset | `3` | integer | Offset or skip results from the beginning of the query |\n| sort | `flight_number` | string | Change result sorting by setting value to any parameter in this list |\n| order | `desc` | string | Change result ordering by setting values of `asc` or `desc` |
     * @return Call<List<AllLaunch>>
     */

    @GET("v3/launches")
    Call<List<AllLaunch>> allLaunches();



    /**
     * Past Launches
     * #### Optional Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| flight_id | `5a9fc479ab70786ba5a1eaaa` | string | Filter launches by mongo document id |\n| start/end | `start=2017-06-22&amp;end=2017-06-25` | valid JavaScript date format | Include both to sort by date range |\n| flight_number | `60` | integer | Filter by flight number |\n| launch_year | `2018` | integer | Filter by launch year |\n| launch_date_utc | `2017-06-23T19:10:000Z` | UTC ISO timestamp | Filter by utc launch date |\n| launch_date_local | `2017-06-23T19:10:000Z` | Local ISO timestamp | Filter by local launch date |\n| tbd | `true` | boolean | Filter by TBD launches |\n| rocket_id | `falconheavy` | string | Filter by rocket ID |\n| rocket_name | `Falcon+Heavy` | string | Filter by rocket name |\n| rocket_type | `FT` | string | Filter by rocket type |\n| core_serial | `B1045` | string | Filter by core serial number |\n| land_success | `true` | boolean | Filter by successful core landings |\n| landing_intent | `true` | boolean | Filter by landing intention |\n| landing_type | `ASDS` | string | Filter by landing method |\n| landing_vehicle | `OCISLY` | string | Filter by landing vehicle |\n| cap_serial | `C111` | string | Filter by capsule serial number |\n| core_flight | `2` | integer | Filter by number of previous core flights |\n| block | `5` | integer | Filter by core block number |\n| gridfins | `true` | boolean | Filter launches by cores that used gridfins |\n| legs | `true` | boolean | Filter launches by cores that used landing legs |\n| core_reuse | `true` | boolean | Filter launches by reused cores |\n| capsule_reuse | `true` | boolean | Filter launches by reused capsules |\n| fairings_reused | `true` | boolean | Filter by reused fairings |\n| fairings_recovery_attempt | `false` | boolean | Filter by fairing recovery attempts |\n| fairings_recovered | `false` | boolean | Filter by recovered fairings |\n| fairings_ship | `MRSTEVEN` | string | Filter by fairings ship used |\n| site_id | `ksc_lc_39a` | string | Filter by launch site ID |\n| site_name | `KSC LC 39A` | string | Filter by launch site ID |\n| payload_id | `BulgariaSat-1` | string | Filter by payload ID |\n| norad_id | `43571` | integer | Filter by NORAD ID |\n| customer | `Iridium` | string | Filter by launch payload customer |\n| nationality | `Bulgaria` | string | Filter by payload nationality |\n| manufacturer | `SSL` | string | Filter by payload manufacturer |\n| payload_type | `Satellite` | string | Filter by payload type |\n| orbit | `GTO` | string | Filter by payload orbit |\n| reference_system | `geocentric` | string | Filter by payload orbit reference system |\n| regime | `geostationary` | string | Filter by payload orbit regime |\n| longitude | `-108` | float | Filter by payload orbit longitude |\n| semi_major_axis_km | `21226.178` | float | Filter by payload orbit semi major axis |\n| eccentricity | `0.6904141` | float | Filter by payload orbit eccentricity |\n| periapsis_km | `193.19` | float | Filter by payload orbit periapsis |\n| apoapsis_km | `29502.896` | float | Filter by payload orbit apoapsis |\n| inclination_deg | `27.0648` | float | Filter by payload orbit inclination |\n| period_min | `512.941` | float | Filter by payload orbit period |\n| lifespan_years | `512.941` | integer | Filter by payload lifespan in years |\n| epoch | `2018-08-07T06:57:16.000Z` | string | Filter by payload orbit epoch |\n| mean_motion | `2.80734018` | float | Filter by payload orbit mean motion |\n| raan | `227.0228` | float | Filter by payload orbit right ascension of the ascending node |\n| launch_success | `true` | boolean | Filter by launch success |\n\n#### Optional Ouput Control Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| id | `true` | boolean | Set as `true` to show mongo document id&#39;s |\n| limit | `3` | integer | Limit results returned, defaults to all documents returned |\n| offset | `3` | integer | Offset or skip results from the beginning of the query |\n| sort | `flight_number` | string | Change result sorting by setting value to any parameter in this list |\n| order | `desc` | string | Change result ordering by setting values of `asc` or `desc` |
     * @return Call<List<PastLaunch>>
     */

    @GET("v3/launches/past")
    Call<List<PastLaunch>> pastLaunches();



    /**
     * Upcoming Launches
     * #### Optional Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| flight_id | `5a9fc479ab70786ba5a1eaaa` | string | Filter launches by mongo document id |\n| start/end | `start=2017-06-22&amp;end=2017-06-25` | valid JavaScript date format | Include both to sort by date range |\n| flight_number | `60` | integer | Filter by flight number |\n| launch_year | `2018` | integer | Filter by launch year |\n| launch_date_utc | `2017-06-23T19:10:000Z` | UTC ISO timestamp | Filter by utc launch date |\n| launch_date_local | `2017-06-23T19:10:000Z` | Local ISO timestamp | Filter by local launch date |\n| tbd | `true` | boolean | Filter by TBD launches |\n| rocket_id | `falconheavy` | string | Filter by rocket ID |\n| rocket_name | `Falcon+Heavy` | string | Filter by rocket name |\n| rocket_type | `FT` | string | Filter by rocket type |\n| core_serial | `B1045` | string | Filter by core serial number |\n| land_success | `true` | boolean | Filter by successful core landings |\n| landing_intent | `true` | boolean | Filter by landing intention |\n| landing_type | `ASDS` | string | Filter by landing method |\n| landing_vehicle | `OCISLY` | string | Filter by landing vehicle |\n| cap_serial | `C111` | string | Filter by capsule serial number |\n| core_flight | `2` | integer | Filter by number of previous core flights |\n| block | `5` | integer | Filter by core block number |\n| gridfins | `true` | boolean | Filter launches by cores that used gridfins |\n| legs | `true` | boolean | Filter launches by cores that used landing legs |\n| core_reuse | `true` | boolean | Filter launches by reused cores |\n| capsule_reuse | `true` | boolean | Filter launches by reused capsules |\n| fairings_reused | `true` | boolean | Filter by reused fairings |\n| fairings_recovery_attempt | `false` | boolean | Filter by fairing recovery attempts |\n| fairings_recovered | `false` | boolean | Filter by recovered fairings |\n| fairings_ship | `MRSTEVEN` | string | Filter by fairings ship used |\n| site_id | `ksc_lc_39a` | string | Filter by launch site ID |\n| site_name | `KSC LC 39A` | string | Filter by launch site ID |\n| payload_id | `BulgariaSat-1` | string | Filter by payload ID |\n| norad_id | `43571` | integer | Filter by NORAD ID |\n| customer | `Iridium` | string | Filter by launch payload customer |\n| nationality | `Bulgaria` | string | Filter by payload nationality |\n| manufacturer | `SSL` | string | Filter by payload manufacturer |\n| payload_type | `Satellite` | string | Filter by payload type |\n| orbit | `GTO` | string | Filter by payload orbit |\n| reference_system | `geocentric` | string | Filter by payload orbit reference system |\n| regime | `geostationary` | string | Filter by payload orbit regime |\n| longitude | `-108` | float | Filter by payload orbit longitude |\n| semi_major_axis_km | `21226.178` | float | Filter by payload orbit semi major axis |\n| eccentricity | `0.6904141` | float | Filter by payload orbit eccentricity |\n| periapsis_km | `193.19` | float | Filter by payload orbit periapsis |\n| apoapsis_km | `29502.896` | float | Filter by payload orbit apoapsis |\n| inclination_deg | `27.0648` | float | Filter by payload orbit inclination |\n| period_min | `512.941` | float | Filter by payload orbit period |\n| lifespan_years | `512.941` | integer | Filter by payload lifespan in years |\n| epoch | `2018-08-07T06:57:16.000Z` | string | Filter by payload orbit epoch |\n| mean_motion | `2.80734018` | float | Filter by payload orbit mean motion |\n| raan | `227.0228` | float | Filter by payload orbit right ascension of the ascending node |\n| launch_success | `true` | boolean | Filter by launch success |\n\n#### Optional Ouput Control Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| id | `true` | boolean | Set as `true` to show mongo document id&#39;s |\n| limit | `3` | integer | Limit results returned, defaults to all documents returned |\n| offset | `3` | integer | Offset or skip results from the beginning of the query |\n| sort | `flight_number` | string | Change result sorting by setting value to any parameter in this list |\n| order | `desc` | string | Change result ordering by setting values of `asc` or `desc` |
     * @return Call<List<UpcomingLaunch>>
     */

    @GET("v3/launches/upcoming")
    Call<List<UpcomingLaunch>> upcomingLaunches();



    /**
     * One Launch
     * #### Params\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| flight_number | `64` | integer | get one launch by flight number |\n\n#### Optional Ouput Control Querystrings\n\n| Param  | Sample | Type | Description |\n| --- | --- | --- | --- |\n| id | `true` | boolean | Set as `true` to show mongo document id&#39;s |
     * @param flightNumber
     * @return Call<OneLaunch>
     */

    @GET("v3/launches/{flight_number}")
    Call<OneLaunch> oneLaunch(
            @Path("flight_number") String flightNumber
    );


}
