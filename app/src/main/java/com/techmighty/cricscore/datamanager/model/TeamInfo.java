package com.techmighty.cricscore.datamanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by avaria on 05/03/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamInfo {


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
            @JsonProperty("Team")
            private List<TeamBean> Team;

            public List<TeamBean> getTeam() {
                return Team;
            }

            public void setTeam(List<TeamBean> Team) {
                this.Team = Team;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class TeamBean {

                @JsonProperty("LastUpdated")
                private String LastUpdated;
                @JsonProperty("TeamId")
                private TeamIdBean TeamId;
                @JsonProperty("TeamName")
                private String TeamName;
                @JsonProperty("ShortName")
                private String ShortName;
                @JsonProperty("TeamType")
                private String TeamType;
                @JsonProperty("TeamCategory")
                private String TeamCategory;
                @JsonProperty("TeamLogoPath")
                private String TeamLogoPath;
                @JsonProperty("TeamLogoSmallPath")
                private String TeamLogoSmallPath;
                @JsonProperty("TeamFlagPath")
                private String TeamFlagPath;
                @JsonProperty("TeamSmallFlagPath")
                private String TeamSmallFlagPath;
                @JsonProperty("Ranking")
                private Object Ranking;
                @JsonProperty("Coach")
                private CoachBean Coach;
                @JsonProperty("TeamRoundFlagPath")
                private String TeamRoundFlagPath;
                @JsonProperty("TeamSmallRoundFlagPath")
                private String TeamSmallRoundFlagPath;
                @JsonProperty("TeamLargeRoundFlagPath")
                private String TeamLargeRoundFlagPath;
                @JsonProperty("Captain")
                private List<CaptainBean> Captain;

                public String getLastUpdated() {
                    return LastUpdated;
                }

                public void setLastUpdated(String LastUpdated) {
                    this.LastUpdated = LastUpdated;
                }

                public TeamIdBean getTeamId() {
                    return TeamId;
                }

                public void setTeamId(TeamIdBean TeamId) {
                    this.TeamId = TeamId;
                }

                public String getTeamName() {
                    return TeamName;
                }

                public void setTeamName(String TeamName) {
                    this.TeamName = TeamName;
                }

                public String getShortName() {
                    return ShortName;
                }

                public void setShortName(String ShortName) {
                    this.ShortName = ShortName;
                }

                public String getTeamType() {
                    return TeamType;
                }

                public void setTeamType(String TeamType) {
                    this.TeamType = TeamType;
                }

                public String getTeamCategory() {
                    return TeamCategory;
                }

                public void setTeamCategory(String TeamCategory) {
                    this.TeamCategory = TeamCategory;
                }

                public String getTeamLogoPath() {
                    return TeamLogoPath;
                }

                public void setTeamLogoPath(String TeamLogoPath) {
                    this.TeamLogoPath = TeamLogoPath;
                }

                public String getTeamLogoSmallPath() {
                    return TeamLogoSmallPath;
                }

                public void setTeamLogoSmallPath(String TeamLogoSmallPath) {
                    this.TeamLogoSmallPath = TeamLogoSmallPath;
                }

                public String getTeamFlagPath() {
                    return TeamFlagPath;
                }

                public void setTeamFlagPath(String TeamFlagPath) {
                    this.TeamFlagPath = TeamFlagPath;
                }

                public String getTeamSmallFlagPath() {
                    return TeamSmallFlagPath;
                }

                public void setTeamSmallFlagPath(String TeamSmallFlagPath) {
                    this.TeamSmallFlagPath = TeamSmallFlagPath;
                }

                public Object getRanking() {
                    return Ranking;
                }

                public void setRanking(Object Ranking) {
                    this.Ranking = Ranking;
                }

                public CoachBean getCoach() {
                    return Coach;
                }

                public void setCoach(CoachBean Coach) {
                    this.Coach = Coach;
                }

                public String getTeamRoundFlagPath() {
                    return TeamRoundFlagPath;
                }

                public void setTeamRoundFlagPath(String TeamRoundFlagPath) {
                    this.TeamRoundFlagPath = TeamRoundFlagPath;
                }

                public String getTeamSmallRoundFlagPath() {
                    return TeamSmallRoundFlagPath;
                }

                public void setTeamSmallRoundFlagPath(String TeamSmallRoundFlagPath) {
                    this.TeamSmallRoundFlagPath = TeamSmallRoundFlagPath;
                }

                public String getTeamLargeRoundFlagPath() {
                    return TeamLargeRoundFlagPath;
                }

                public void setTeamLargeRoundFlagPath(String TeamLargeRoundFlagPath) {
                    this.TeamLargeRoundFlagPath = TeamLargeRoundFlagPath;
                }

                public List<CaptainBean> getCaptain() {
                    return Captain;
                }

                public void setCaptain(List<CaptainBean> Captain) {
                    this.Captain = Captain;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class TeamIdBean {
                    /**
                     * status : 1
                     * content : 16
                     */

                    @JsonProperty("status")
                    private String status;
                    @JsonProperty("content")
                    private String content;

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class RankingBean {
                    /**
                     * mtype : T20
                     * ranker : icc
                     * trend : steady
                     * content : 11
                     */

                    @JsonProperty("mtype")
                    private String mtype;
                    @JsonProperty("ranker")
                    private String ranker;
                    @JsonProperty("trend")
                    private String trend;
                    @JsonProperty("content")
                    private String content;

                    public String getMtype() {
                        return mtype;
                    }

                    public void setMtype(String mtype) {
                        this.mtype = mtype;
                    }

                    public String getRanker() {
                        return ranker;
                    }

                    public void setRanker(String ranker) {
                        this.ranker = ranker;
                    }

                    public String getTrend() {
                        return trend;
                    }

                    public void setTrend(String trend) {
                        this.trend = trend;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class CoachBean {
                    /**
                     * personid : 641
                     * role : whatever
                     * FirstName : Grant
                     * LastName : Bradburn
                     */

                    @JsonProperty("personid")
                    private String personid;
                    @JsonProperty("role")
                    private String role;
                    @JsonProperty("FirstName")
                    private String FirstName;
                    @JsonProperty("LastName")
                    private String LastName;

                    public String getPersonid() {
                        return personid;
                    }

                    public void setPersonid(String personid) {
                        this.personid = personid;
                    }

                    public String getRole() {
                        return role;
                    }

                    public void setRole(String role) {
                        this.role = role;
                    }

                    public String getFirstName() {
                        return FirstName;
                    }

                    public void setFirstName(String FirstName) {
                        this.FirstName = FirstName;
                    }

                    public String getLastName() {
                        return LastName;
                    }

                    public void setLastName(String LastName) {
                        this.LastName = LastName;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class CaptainBean {
                    /**
                     * current_captain : yes
                     * mtype : ODI
                     * personid : 11918
                     * FirstName : Preston
                     * LastName : Mommsen
                     */

                    @JsonProperty("current_captain")
                    private String currentCaptain;
                    @JsonProperty("mtype")
                    private String mtype;
                    @JsonProperty("personid")
                    private String personid;
                    @JsonProperty("FirstName")
                    private String FirstName;
                    @JsonProperty("LastName")
                    private String LastName;

                    public String getCurrentCaptain() {
                        return currentCaptain;
                    }

                    public void setCurrentCaptain(String currentCaptain) {
                        this.currentCaptain = currentCaptain;
                    }

                    public String getMtype() {
                        return mtype;
                    }

                    public void setMtype(String mtype) {
                        this.mtype = mtype;
                    }

                    public String getPersonid() {
                        return personid;
                    }

                    public void setPersonid(String personid) {
                        this.personid = personid;
                    }

                    public String getFirstName() {
                        return FirstName;
                    }

                    public void setFirstName(String FirstName) {
                        this.FirstName = FirstName;
                    }

                    public String getLastName() {
                        return LastName;
                    }

                    public void setLastName(String LastName) {
                        this.LastName = LastName;
                    }
                }
            }
        }
    }
}