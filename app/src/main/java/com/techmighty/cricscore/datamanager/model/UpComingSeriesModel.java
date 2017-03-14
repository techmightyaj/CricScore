package com.techmighty.cricscore.datamanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by sarthak on 11/03/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpComingSeriesModel {

    @JsonProperty("query")
    private QueryBean query;

    public QueryBean getQuery() {
        return query;
    }

    public void setQuery(QueryBean query) {
        this.query = query;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class QueryBean {


        @JsonProperty("count")
        private int count;
        @JsonProperty("created")
        private String created;
        @JsonProperty("lang")
        private String lang;
        @JsonProperty("diagnostics")
        private DiagnosticsBean diagnostics;
        @JsonProperty("results")
        private ResultsBean results;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public DiagnosticsBean getDiagnostics() {
            return diagnostics;
        }

        public void setDiagnostics(DiagnosticsBean diagnostics) {
            this.diagnostics = diagnostics;
        }

        public ResultsBean getResults() {
            return results;
        }

        public void setResults(ResultsBean results) {
            this.results = results;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DiagnosticsBean {

            @JsonProperty("cache")
            private CacheBean cache;
            @JsonProperty("publiclyCallable")
            private String publiclyCallable;
            @JsonProperty("user-time")
            private String usertime;
            @JsonProperty("service-time")
            private String servicetime;
            @JsonProperty("build-version")
            private String buildversion;
            @JsonProperty("url")
            private List<UrlBean> url;

            public CacheBean getCache() {
                return cache;
            }

            public void setCache(CacheBean cache) {
                this.cache = cache;
            }

            public String getPubliclyCallable() {
                return publiclyCallable;
            }

            public void setPubliclyCallable(String publiclyCallable) {
                this.publiclyCallable = publiclyCallable;
            }

            public String getUsertime() {
                return usertime;
            }

            public void setUsertime(String usertime) {
                this.usertime = usertime;
            }

            public String getServicetime() {
                return servicetime;
            }

            public void setServicetime(String servicetime) {
                this.servicetime = servicetime;
            }

            public String getBuildversion() {
                return buildversion;
            }

            public void setBuildversion(String buildversion) {
                this.buildversion = buildversion;
            }

            public List<UrlBean> getUrl() {
                return url;
            }

            public void setUrl(List<UrlBean> url) {
                this.url = url;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class CacheBean {
                /**
                 * execution-start-time : 1
                 * execution-stop-time : 4
                 * execution-time : 3
                 * method : GET
                 * type : MEMCACHED
                 * content : TABLE.queryyahooapiscomproductionsg3.cricket.upcoming_matches.f0492b5b88918c27cbe955e3db7f66bf
                 */

                @JsonProperty("execution-start-time")
                private String executionstarttime;
                @JsonProperty("execution-stop-time")
                private String executionstoptime;
                @JsonProperty("execution-time")
                private String executiontime;
                @JsonProperty("method")
                private String method;
                @JsonProperty("type")
                private String type;
                @JsonProperty("content")
                private String content;

                public String getExecutionstarttime() {
                    return executionstarttime;
                }

                public void setExecutionstarttime(String executionstarttime) {
                    this.executionstarttime = executionstarttime;
                }

                public String getExecutionstoptime() {
                    return executionstoptime;
                }

                public void setExecutionstoptime(String executionstoptime) {
                    this.executionstoptime = executionstoptime;
                }

                public String getExecutiontime() {
                    return executiontime;
                }

                public void setExecutiontime(String executiontime) {
                    this.executiontime = executiontime;
                }

                public String getMethod() {
                    return method;
                }

                public void setMethod(String method) {
                    this.method = method;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class UrlBean {
                /**
                 * execution-start-time : 6
                 * execution-stop-time : 11
                 * execution-time : 5
                 * content : http://sherpa-bcp5903.dht.yahoo.com:4080/YDHTWebService/V1/get/yql.global/store%3A%2F%2FHpFd40jgIuzAf4VrtOOToe
                 */

                @JsonProperty("execution-start-time")
                private String executionstarttime;
                @JsonProperty("execution-stop-time")
                private String executionstoptime;
                @JsonProperty("execution-time")
                private String executiontime;
                @JsonProperty("content")
                private String content;

                public String getExecutionstarttime() {
                    return executionstarttime;
                }

                public void setExecutionstarttime(String executionstarttime) {
                    this.executionstarttime = executionstarttime;
                }

                public String getExecutionstoptime() {
                    return executionstoptime;
                }

                public void setExecutionstoptime(String executionstoptime) {
                    this.executionstoptime = executionstoptime;
                }

                public String getExecutiontime() {
                    return executiontime;
                }

                public void setExecutiontime(String executiontime) {
                    this.executiontime = executiontime;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ResultsBean {
            @JsonProperty("Match")
            private List<MatchBean> Match;

            public List<MatchBean> getMatch() {
                return Match;
            }

            public void setMatch(List<MatchBean> Match) {
                this.Match = Match;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class MatchBean {
                /**
                 * group :
                 * matchid : 195133
                 * mtype : t20
                 * series_id : 12554
                 * series_name : Afghanistan vs Ireland T20 Series, 3 T20 Cricket Series in India, 2017
                 * stage : heat
                 * status : pre
                 * MatchNo : 3rd T20I
                 * Venue : {"venueid":"1883","content":"Greater Noida Sports Complex Ground, Greater Noida"}
                 * StartDate : 2017-03-12T14:00:00+05:30
                 * EndDate : 2017-03-12T18:00:00+05:30
                 * MatchTimeSpan : Day
                 * Team : [{"Team":"Afghanistan","role":"","teamid":"1188"},{"Team":"Ireland","role":"","teamid":"13"}]
                 * date_match_start : 20170312083000
                 * date_match_end : 20170312123000
                 */

                @JsonProperty("group")
                private String group;
                @JsonProperty("matchid")
                private String matchid;
                @JsonProperty("mtype")
                private String mtype;
                @JsonProperty("series_id")
                private String seriesId;
                @JsonProperty("series_name")
                private String seriesName;
                @JsonProperty("stage")
                private String stage;
                @JsonProperty("status")
                private String status;
                @JsonProperty("MatchNo")
                private String MatchNo;
                @JsonProperty("Venue")
                private VenueBean Venue;
                @JsonProperty("StartDate")
                private String StartDate;
                @JsonProperty("EndDate")
                private String EndDate;
                @JsonProperty("MatchTimeSpan")
                private String MatchTimeSpan;
                @JsonProperty("date_match_start")
                private long dateMatchStart;
                @JsonProperty("date_match_end")
                private long dateMatchEnd;
                @JsonProperty("Team")
                private List<TeamBean> Team;

                public String getGroup() {
                    return group;
                }

                public void setGroup(String group) {
                    this.group = group;
                }

                public String getMatchid() {
                    return matchid;
                }

                public void setMatchid(String matchid) {
                    this.matchid = matchid;
                }

                public String getMtype() {
                    return mtype;
                }

                public void setMtype(String mtype) {
                    this.mtype = mtype;
                }

                public String getSeriesId() {
                    return seriesId;
                }

                public void setSeriesId(String seriesId) {
                    this.seriesId = seriesId;
                }

                public String getSeriesName() {
                    return seriesName;
                }

                public void setSeriesName(String seriesName) {
                    this.seriesName = seriesName;
                }

                public String getStage() {
                    return stage;
                }

                public void setStage(String stage) {
                    this.stage = stage;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getMatchNo() {
                    return MatchNo;
                }

                public void setMatchNo(String MatchNo) {
                    this.MatchNo = MatchNo;
                }

                public VenueBean getVenue() {
                    return Venue;
                }

                public void setVenue(VenueBean Venue) {
                    this.Venue = Venue;
                }

                public String getStartDate() {
                    return StartDate;
                }

                public void setStartDate(String StartDate) {
                    this.StartDate = StartDate;
                }

                public String getEndDate() {
                    return EndDate;
                }

                public void setEndDate(String EndDate) {
                    this.EndDate = EndDate;
                }

                public String getMatchTimeSpan() {
                    return MatchTimeSpan;
                }

                public void setMatchTimeSpan(String MatchTimeSpan) {
                    this.MatchTimeSpan = MatchTimeSpan;
                }

                public long getDateMatchStart() {
                    return dateMatchStart;
                }

                public void setDateMatchStart(long dateMatchStart) {
                    this.dateMatchStart = dateMatchStart;
                }

                public long getDateMatchEnd() {
                    return dateMatchEnd;
                }

                public void setDateMatchEnd(long dateMatchEnd) {
                    this.dateMatchEnd = dateMatchEnd;
                }

                public List<TeamBean> getTeam() {
                    return Team;
                }

                public void setTeam(List<TeamBean> Team) {
                    this.Team = Team;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class VenueBean {
                    /**
                     * venueid : 1883
                     * content : Greater Noida Sports Complex Ground, Greater Noida
                     */

                    @JsonProperty("venueid")
                    private String venueid;
                    @JsonProperty("content")
                    private String content;

                    public String getVenueid() {
                        return venueid;
                    }

                    public void setVenueid(String venueid) {
                        this.venueid = venueid;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class TeamBean {
                    /**
                     * Team : Afghanistan
                     * role :
                     * teamid : 1188
                     */

                    @JsonProperty("Team")
                    private String Team;
                    @JsonProperty("role")
                    private String role;
                    @JsonProperty("teamid")
                    private String teamid;

                    public String getTeam() {
                        return Team;
                    }

                    public void setTeam(String Team) {
                        this.Team = Team;
                    }

                    public String getRole() {
                        return role;
                    }

                    public void setRole(String role) {
                        this.role = role;
                    }

                    public String getTeamid() {
                        return teamid;
                    }

                    public void setTeamid(String teamid) {
                        this.teamid = teamid;
                    }
                }
            }
        }
    }
}

