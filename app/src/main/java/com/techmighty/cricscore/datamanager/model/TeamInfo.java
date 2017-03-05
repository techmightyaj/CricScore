package com.techmighty.cricscore.datamanager.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by avaria on 05/03/17.
 */

public class TeamInfo {

    /**
     * query : {"count":14,"created":"2017-03-05T08:22:23Z","lang":"en-US","diagnostics":{"cache":{"execution-start-time":"0","execution-stop-time":"4","execution-time":"4","method":"GET","type":"MEMCACHED","content":"TABLE.queryyahooapiscomproductionsg3.cricket.teams.cb28f8540307fdb68289fa5fedc2b832"},"url":[{"execution-start-time":"6","execution-stop-time":"10","execution-time":"4","content":"http://sherpa-bcp5903.dht.yahoo.com:4080/YDHTWebService/V1/get/yql.global/store%3A%2F%2FgPeXezE09iMcke9Y40ueqU"},{"execution-start-time":"15","execution-stop-time":"20","execution-time":"5","content":"http://cricketwebservice/ws/cwsapi/teams.php?output=summary&offset=0&count=10"}],"publiclyCallable":"true","user-time":"22","service-time":"13","build-version":"2.0.97"},"results":{"Team":[{"LastUpdated":"2017-02-01T12:58:32+05:30","TeamId":{"status":"1","content":"16"},"TeamName":"Scotland","ShortName":"SCO","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland-28-5-2011-6b8837ab0caf58585c591a0d14d930bd.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland_small-28-5-2011-c3e69a0626556d8655d29089b432b7b1.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland_flag-28-5-2011-a7444fc5a6c9c20e315b9127e054bfce.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland_flag_small-28-5-2011-3e2ece7f17ddabe1ddb67ac18d297914.gif","Ranking":{"mtype":"T20","ranker":"icc","trend":"steady","content":"11"},"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"11918","FirstName":"Preston","LastName":"Mommsen"},{"current_captain":"no","mtype":"T20","personid":"11918","FirstName":"Preston","LastName":"Mommsen"}],"Coach":{"personid":"641","role":"whatever","FirstName":"Grant","LastName":"Bradburn"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/16-11-2-2012-caabf874e5d5aa46a8c2ff9b8b80070f.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/16_s-11-2-2012-06e19db515c70c3d3e90d196f1de2ffa.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/16_l-11-2-2012-c7bedaa78b23b63de75b4cfc7533e0ae.png"},{"LastUpdated":"2017-02-26T22:18:29+05:30","TeamId":{"status":"1","content":"1188"},"TeamName":"Afghanistan","ShortName":"AFG","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan-26-2-2013-d4cf517a9d31f719f9f71c538c837492.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan_small-26-2-2013-5e656966574b931e1626deaa4da2ae9c.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan_flag-10-7-2011-efde696128bd30f3fabcb018f3a3d3f7.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan_flag_small-10-7-2011-cb163ccee2ad9db378b0c3b48bc3179e.gif","Ranking":[{"mtype":"ODI","ranker":"icc","trend":"steady","content":"10"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"9"}],"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"7795","FirstName":"Asghar","LastName":"Stanikzai"},{"current_captain":"no","mtype":"T20","personid":"7795","FirstName":"Asghar","LastName":"Stanikzai"}],"Coach":{"personid":"1567","role":"whatever","FirstName":"Inzamam-ul-Haq","LastName":null},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1188-11-2-2012-e311190d8b8e072fb3431dbffef251fc.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1188_s-11-2-2012-ea0a16b7ef41d8b2b62faee84b649a1d.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1188_l-11-2-2012-f75d356f15ed9edbce4afc6d45c32068.png"},{"LastUpdated":"2017-03-04T18:47:25+05:30","TeamId":{"status":"1","content":"21"},"TeamName":"United Arab Emirates","ShortName":"UAE","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates-23-2-2014-5901aa74454bec32756955e8e6961162.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates_small-23-2-2014-a8e0d17eb4d7869b99c8723eca374de9.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates_flag-23-2-2014-123c568e63153a3560ccfa3a93b0aaa3.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates_flag_small-23-2-2014-638a6b817bdea6cf39c9668077d64506.gif","Ranking":{"mtype":"T20","ranker":"icc","trend":"steady","content":"16"},"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"3623","FirstName":"Mohammad","LastName":"Tauqir"},{"current_captain":"no","mtype":"T20","personid":"3623","FirstName":"Mohammad","LastName":"Tauqir"}],"Coach":{"personid":"333","role":"whatever","FirstName":"Aaqib","LastName":"Javed"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/21-23-2-2014-4b6f983fdea88b5c138af6541cefbd09.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/21_s-23-2-2014-ec9f90202aee1acb5f63e4042da185e5.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/21_l-23-2-2014-a019c51a6c9f99a3c1158c5bb82a62ca.png"},{"LastUpdated":"2017-03-04T18:47:41+05:30","TeamId":{"status":"1","content":"13"},"TeamName":"Ireland","ShortName":"IRE","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland-26-2-2013-13dee5a557f9970434f1ae02f0be3da8.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland_small-26-2-2013-f59eeb8e5489d982ec1b8f5177ffd7a9.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland_flag-24-9-2011-9054796c4b024646e2e840057107bc04.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland_flag_small-24-9-2011-4faacdd1c7b9ec045faa0717f5537587.gif","Ranking":[{"mtype":"ODI","ranker":"icc","trend":"steady","content":"12"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"15"}],"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"3822","FirstName":"William","LastName":"Porterfield"},{"current_captain":"no","mtype":"T20","personid":"3822","FirstName":"William","LastName":"Porterfield"}],"Coach":{"personid":"1515","role":"whatever","FirstName":"Dave","LastName":"Houghton"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/13-11-2-2012-8b541e9b2f4f447b037aee32a9996f13.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/13_s-11-2-2012-dd285edb7e58766f594d099135a15817.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/13_l-11-2-2012-82d89a321ceca0fdb9f33b33efe5ba7c.png"},{"LastUpdated":"2017-02-26T20:26:55+05:30","TeamId":{"status":"1","content":"4"},"TeamName":"India","ShortName":"IND","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/india-26-2-2013-7bc0143dc758960959d93127dcbe8f71.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/india_small-26-2-2013-fd8756ab515d2b79ea0e3a43ac580615.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/india_flag-1-2-2011-0fa2af8a7fb72b445cf841cf27ff119a.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/india_flag_small-1-2-2011-19e94f1d1081d5dde82b381bf8c783b6.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"1"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"4"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"2"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"3993","FirstName":"Virat","LastName":"Kohli"},{"current_captain":"no","mtype":"ODI","personid":"3993","FirstName":"Virat","LastName":"Kohli"},{"current_captain":"no","mtype":"T20","personid":"3993","FirstName":"Virat","LastName":"Kohli"}],"Coach":{"personid":"1767","role":"whatever","FirstName":"Anil","LastName":"Kumble"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/4-11-2-2012-5651d44338907e593f94773398fac650.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/4_s-11-2-2012-dd77610cb84ba225571610f4d3b52097.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/4_l-11-2-2012-b8ce58599a586b164189b090b45c07e1.png"},{"LastUpdated":"2017-02-26T20:26:35+05:30","TeamId":{"status":"1","content":"1"},"TeamName":"Australia","ShortName":"AUS","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/australia-26-2-2013-fc64015435307ed32226b1154fe1c8b0.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/australia_small-26-2-2013-cfe74527547adb1b70ca1c7369364266.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/australia_flag-1-2-2011-5a85f74b5ef46c4d9669aa6814240776.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/australia_flag_small-1-2-2011-2801297b7b06aa33e14c9c0314536a15.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"2"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"2"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"7"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"4308","FirstName":"Steven","LastName":"Smith"},{"current_captain":"no","mtype":"ODI","personid":"4195","FirstName":"Matthew","LastName":"Wade"},{"current_captain":"no","mtype":"T20","personid":"4196","FirstName":"Aaron","LastName":"Finch"}],"Coach":{"personid":"1818","role":"whatever","FirstName":"Darren","LastName":"Lehmann"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1-11-2-2012-8699b8a840e0f972d1276d094fc7c827.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1_s-11-2-2012-280be956394485494566095b9e27426c.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1_l-11-2-2012-975ee512e59ffc420e26dee2813daa27.png"},{"LastUpdated":"2017-03-04T13:06:54+05:30","TeamId":{"status":"1","content":"7"},"TeamName":"South Africa","ShortName":"SA","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa-26-2-2013-0dd53b4c3d9d2d62fdf47e690a892b92.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa_small-1-2-2011-53d3554a638cc4b114764c154ea164bd.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa_flag-1-2-2011-d42076e888a05412fdfdf7504c4c6649.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa_flag_small-1-2-2011-52e6632a8c28d6b73e7e583692b58f16.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"3"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"1"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"3"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"28891","FirstName":"Faf","LastName":"du Plessis"},{"current_captain":"yes","mtype":"ODI","personid":"3675","FirstName":"AB","LastName":"de Villiers"},{"current_captain":"no","mtype":"T20","personid":"3675","FirstName":"AB","LastName":"de Villiers"}],"Coach":{"personid":"64189","role":"whatever","FirstName":"Russell","LastName":"Domingo"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/7-11-2-2012-4541e123431f83ef71ca72c9ba36a989.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/7_s-11-2-2012-d7641c072634340445b36f19996601ba.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/7_l-11-2-2012-6ffcebebcba7787554927c94de0b3109.png"},{"LastUpdated":"2017-03-04T11:08:21+05:30","TeamId":{"status":"1","content":"3"},"TeamName":"England","ShortName":"ENG","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens,Non-DomesticExhibition TestMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/england-26-2-2013-e031e0f1a9da23945bff29e137dc1eae.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/england_small-26-2-2013-94d952f96c06ffae74bf5ae06ed37fae.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/england_flag-1-2-2011-e2f5c084ccbade5aa14eaf17911929de.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/england_flag_small-1-2-2011-6c19ffee31cd7fb50f75bafcac6e8531.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"4"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"5"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"5"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"10129","FirstName":"Joe","LastName":"Root"},{"current_captain":"yes","mtype":"ODI","personid":"3823","FirstName":"Eoin","LastName":"Morgan"},{"current_captain":"no","mtype":"T20","personid":"3823","FirstName":"Eoin","LastName":"Morgan"}],"Coach":{"personid":"4897","role":"whatever","FirstName":"Trevor","LastName":"Bayliss"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/3-11-2-2012-1ea91e99c699245b408540e95157a693.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/3_s-11-2-2012-b11aa0721a26bd1d91720320dba3569a.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/3_l-11-2-2012-5593f23256a4c5327fda1729a771f8ff.png"},{"LastUpdated":"2017-03-04T13:06:37+05:30","TeamId":{"status":"1","content":"5"},"TeamName":"New Zealand","ShortName":"NZ","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens,Non-DomesticExhibition TestMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand-26-2-2013-e83c496a930a420848b561c210dbbaf4.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand_small-26-2-2013-f3b6a4b8899eb627854a956677ea2c53.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand_flag-1-2-2011-47faa19586061974b01c99058628d32e.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand_flag_small-1-2-2011-648a3001043e4d94a5eebd9dfe9a88a5.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"5"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"3"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"1"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"4330","FirstName":"Kane","LastName":"Williamson"},{"current_captain":"yes","mtype":"ODI","personid":"4330","FirstName":"Kane","LastName":"Williamson"},{"current_captain":"no","mtype":"T20","personid":"4330","FirstName":"Kane","LastName":"Williamson"}],"Coach":{"personid":"63213","role":"whatever","FirstName":"Mike","LastName":"Hesson"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/5-11-2-2012-36848dfcad81aae16dfc28cc1c506618.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/5_s-11-2-2012-a3e1d867528e59013ea81407d1fdfe02.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/5_l-11-2-2012-78e43d8e16ee76e5f28da1a679de2eff.png"},{"LastUpdated":"2017-02-11T01:15:36+05:30","TeamId":{"status":"1","content":"6"},"TeamName":"Pakistan","ShortName":"PAK","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan-26-2-2013-f6f54d67dea9677b03ddc1c009c070f9.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan_small-26-2-2013-6af95f1da13f29b8ef5ccfbf3cb89648.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan_flag-1-2-2011-f99a8132f62ed22d64b985c2ba0d65eb.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan_flag_small-1-2-2011-5bbc7ebe24b9bc2460e131bfc9cafd78.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"6"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"8"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"7"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"2068","FirstName":"Misbah-ul-Haq","LastName":null},{"current_captain":"yes","mtype":"ODI","personid":"4038","FirstName":"Sarfraz","LastName":"Ahmed"},{"current_captain":"no","mtype":"T20","personid":"4038","FirstName":"Sarfraz","LastName":"Ahmed"}],"Coach":{"personid":"4896","role":"whatever","FirstName":"Mickey","LastName":"Arthur"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/6-11-2-2012-e492bb0be566324796f25d3bcd2c3019.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/6_s-11-2-2012-2ef4be67daf68f843f48115ff5ba8f1a.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/6_l-11-2-2012-472fc93551b80e5564b9fd0355191a4e.png"},{"LastUpdated":"2017-03-01T16:05:22+05:30","TeamId":{"status":"1","content":"8"},"TeamName":"Sri Lanka","ShortName":"SL","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka-26-2-2013-de0108e194085662137677a04fc4d093.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka_small-26-2-2013-da0378709cab16d862dd11348d5f8a09.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka_flag-1-2-2011-9c66eb3e952d7fcda9b20d42145ef18c.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka_flag_small-1-2-2011-4239d880b394fcc423a14234d1fafaac.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"7"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"6"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"8"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"5244","FirstName":"Angelo","LastName":"Mathews"},{"current_captain":"no","mtype":"ODI","personid":"3702","FirstName":"Upul","LastName":"Tharanga"},{"current_captain":"no","mtype":"T20","personid":"5244","FirstName":"Angelo","LastName":"Mathews"}],"Coach":{"personid":"22094","role":"whatever","FirstName":"Jerome","LastName":"Jayaratne"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/8-11-2-2012-09cb390bd958ae05890f56d2b1d9a39a.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/8_s-11-2-2012-8d06a8566e73875152c057e7a0993b45.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/8_l-11-2-2012-42596125ceefa9b3960e6231785d0ab6.png"},{"LastUpdated":"2017-03-04T11:09:30+05:30","TeamId":{"status":"1","content":"9"},"TeamName":"West Indies","ShortName":"WI","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies-26-2-2013-d3ee3026b84398864c10e4320494c6e8.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies_small-26-2-2013-d0e88ec3179f31a2c0ebc05e1830453e.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies_flag-1-2-2011-1f60ba1dc32a680e11ae5efe99bcc924.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies_flag_small-1-2-2011-7f81c93235b1ea332d460c28778e21a4.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"8"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"9"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"4"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"10232","FirstName":"Jason","LastName":"Holder"},{"current_captain":"yes","mtype":"ODI","personid":"10232","FirstName":"Jason","LastName":"Holder"},{"current_captain":"no","mtype":"T20","personid":"56973","FirstName":"Carlos","LastName":"Brathwaite"}],"Coach":{"personid":"149","role":"whatever","FirstName":"Stuart","LastName":"Law"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/9-11-2-2012-c51c1d9604f42152a6e87e5cb38542e3.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/9_s-11-2-2012-b317c02e8201f9cbbefd3d21381bb534.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/9_l-11-2-2012-da7e8c6fe82f0fa6ec7ee4d3051d3ba6.png"},{"LastUpdated":"2017-02-28T12:25:43+05:30","TeamId":{"status":"1","content":"2"},"TeamName":"Bangladesh","ShortName":"BAN","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh-26-2-2013-ce56db03135b10cf77a4b487115cffea.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh_small-26-2-2013-5863cc151a9fcee810314452854efd0e.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh_flag-1-2-2011-60e36623244889186536ddf79ddd7a74.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh_flag_small-1-2-2011-578103ec57a0fd8d6147f9e92b6a1b7e.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"9"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"7"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"10"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"3693","FirstName":"Mushfiqur","LastName":"Rahim"},{"current_captain":"no","mtype":"ODI","personid":"1948","FirstName":"Mashrafe","LastName":"Mortaza"},{"current_captain":"no","mtype":"T20","personid":"1948","FirstName":"Mashrafe","LastName":"Mortaza"}],"Coach":{"personid":"1413","role":"whatever","FirstName":"Chandika","LastName":"Hathurusingha"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/2-11-2-2012-4eecb7dca92c191ec776311e4fe802cb.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/2_s-11-2-2012-4490ca9fcde22aa60d67259151e5d1f0.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/2_l-11-2-2012-a853bb5b43497e2b3a38791dc389adc0.png"},{"LastUpdated":"2017-02-26T22:18:57+05:30","TeamId":{"status":"1","content":"10"},"TeamName":"Zimbabwe","ShortName":"ZIM","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe-26-2-2013-31a0ff68b0cd513b46c5bc8b4ac6fb7f.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe_small-26-2-2013-3fa280679cc09d274123420e13abc8f8.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe_flag-1-2-2011-f21f8d897256f2509a730f93112daf0a.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe_flag_small-1-2-2011-790452146c32bdcacd149e27895001b4.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"10"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"11"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"12"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"3656","FirstName":"Graeme","LastName":"Cremer"},{"current_captain":"yes","mtype":"ODI","personid":"3656","FirstName":"Graeme","LastName":"Cremer"},{"current_captain":"no","mtype":"T20","personid":"3656","FirstName":"Graeme","LastName":"Cremer"}],"Coach":{"personid":"2884","role":"whatever","FirstName":"Heath","LastName":"Streak"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/10-11-2-2012-e679699d425313483daeed697d802023.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/10_s-11-2-2012-fdbd0a77e493fe44165ab2b012380268.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/10_l-11-2-2012-4dc0861b3616d2c3ad05e5e7e94207df.png"}]}}
     */

    private QueryBean query;

    public QueryBean getQuery() {
        return query;
    }

    public void setQuery(QueryBean query) {
        this.query = query;
    }

    public static class QueryBean {
        /**
         * count : 14
         * created : 2017-03-05T08:22:23Z
         * lang : en-US
         * diagnostics : {"cache":{"execution-start-time":"0","execution-stop-time":"4","execution-time":"4","method":"GET","type":"MEMCACHED","content":"TABLE.queryyahooapiscomproductionsg3.cricket.teams.cb28f8540307fdb68289fa5fedc2b832"},"url":[{"execution-start-time":"6","execution-stop-time":"10","execution-time":"4","content":"http://sherpa-bcp5903.dht.yahoo.com:4080/YDHTWebService/V1/get/yql.global/store%3A%2F%2FgPeXezE09iMcke9Y40ueqU"},{"execution-start-time":"15","execution-stop-time":"20","execution-time":"5","content":"http://cricketwebservice/ws/cwsapi/teams.php?output=summary&offset=0&count=10"}],"publiclyCallable":"true","user-time":"22","service-time":"13","build-version":"2.0.97"}
         * results : {"Team":[{"LastUpdated":"2017-02-01T12:58:32+05:30","TeamId":{"status":"1","content":"16"},"TeamName":"Scotland","ShortName":"SCO","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland-28-5-2011-6b8837ab0caf58585c591a0d14d930bd.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland_small-28-5-2011-c3e69a0626556d8655d29089b432b7b1.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland_flag-28-5-2011-a7444fc5a6c9c20e315b9127e054bfce.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/scotland_flag_small-28-5-2011-3e2ece7f17ddabe1ddb67ac18d297914.gif","Ranking":{"mtype":"T20","ranker":"icc","trend":"steady","content":"11"},"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"11918","FirstName":"Preston","LastName":"Mommsen"},{"current_captain":"no","mtype":"T20","personid":"11918","FirstName":"Preston","LastName":"Mommsen"}],"Coach":{"personid":"641","role":"whatever","FirstName":"Grant","LastName":"Bradburn"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/16-11-2-2012-caabf874e5d5aa46a8c2ff9b8b80070f.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/16_s-11-2-2012-06e19db515c70c3d3e90d196f1de2ffa.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/16_l-11-2-2012-c7bedaa78b23b63de75b4cfc7533e0ae.png"},{"LastUpdated":"2017-02-26T22:18:29+05:30","TeamId":{"status":"1","content":"1188"},"TeamName":"Afghanistan","ShortName":"AFG","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan-26-2-2013-d4cf517a9d31f719f9f71c538c837492.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan_small-26-2-2013-5e656966574b931e1626deaa4da2ae9c.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan_flag-10-7-2011-efde696128bd30f3fabcb018f3a3d3f7.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/afghanistan_flag_small-10-7-2011-cb163ccee2ad9db378b0c3b48bc3179e.gif","Ranking":[{"mtype":"ODI","ranker":"icc","trend":"steady","content":"10"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"9"}],"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"7795","FirstName":"Asghar","LastName":"Stanikzai"},{"current_captain":"no","mtype":"T20","personid":"7795","FirstName":"Asghar","LastName":"Stanikzai"}],"Coach":{"personid":"1567","role":"whatever","FirstName":"Inzamam-ul-Haq","LastName":null},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1188-11-2-2012-e311190d8b8e072fb3431dbffef251fc.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1188_s-11-2-2012-ea0a16b7ef41d8b2b62faee84b649a1d.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1188_l-11-2-2012-f75d356f15ed9edbce4afc6d45c32068.png"},{"LastUpdated":"2017-03-04T18:47:25+05:30","TeamId":{"status":"1","content":"21"},"TeamName":"United Arab Emirates","ShortName":"UAE","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates-23-2-2014-5901aa74454bec32756955e8e6961162.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates_small-23-2-2014-a8e0d17eb4d7869b99c8723eca374de9.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates_flag-23-2-2014-123c568e63153a3560ccfa3a93b0aaa3.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/united_arab_emirates_flag_small-23-2-2014-638a6b817bdea6cf39c9668077d64506.gif","Ranking":{"mtype":"T20","ranker":"icc","trend":"steady","content":"16"},"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"3623","FirstName":"Mohammad","LastName":"Tauqir"},{"current_captain":"no","mtype":"T20","personid":"3623","FirstName":"Mohammad","LastName":"Tauqir"}],"Coach":{"personid":"333","role":"whatever","FirstName":"Aaqib","LastName":"Javed"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/21-23-2-2014-4b6f983fdea88b5c138af6541cefbd09.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/21_s-23-2-2014-ec9f90202aee1acb5f63e4042da185e5.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/21_l-23-2-2014-a019c51a6c9f99a3c1158c5bb82a62ca.png"},{"LastUpdated":"2017-03-04T18:47:41+05:30","TeamId":{"status":"1","content":"13"},"TeamName":"Ireland","ShortName":"IRE","TeamType":"InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland-26-2-2013-13dee5a557f9970434f1ae02f0be3da8.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland_small-26-2-2013-f59eeb8e5489d982ec1b8f5177ffd7a9.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland_flag-24-9-2011-9054796c4b024646e2e840057107bc04.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/ireland_flag_small-24-9-2011-4faacdd1c7b9ec045faa0717f5537587.gif","Ranking":[{"mtype":"ODI","ranker":"icc","trend":"steady","content":"12"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"15"}],"Captain":[{"current_captain":"yes","mtype":"ODI","personid":"3822","FirstName":"William","LastName":"Porterfield"},{"current_captain":"no","mtype":"T20","personid":"3822","FirstName":"William","LastName":"Porterfield"}],"Coach":{"personid":"1515","role":"whatever","FirstName":"Dave","LastName":"Houghton"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/13-11-2-2012-8b541e9b2f4f447b037aee32a9996f13.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/13_s-11-2-2012-dd285edb7e58766f594d099135a15817.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/13_l-11-2-2012-82d89a321ceca0fdb9f33b33efe5ba7c.png"},{"LastUpdated":"2017-02-26T20:26:55+05:30","TeamId":{"status":"1","content":"4"},"TeamName":"India","ShortName":"IND","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/india-26-2-2013-7bc0143dc758960959d93127dcbe8f71.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/india_small-26-2-2013-fd8756ab515d2b79ea0e3a43ac580615.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/india_flag-1-2-2011-0fa2af8a7fb72b445cf841cf27ff119a.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/india_flag_small-1-2-2011-19e94f1d1081d5dde82b381bf8c783b6.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"1"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"4"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"2"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"3993","FirstName":"Virat","LastName":"Kohli"},{"current_captain":"no","mtype":"ODI","personid":"3993","FirstName":"Virat","LastName":"Kohli"},{"current_captain":"no","mtype":"T20","personid":"3993","FirstName":"Virat","LastName":"Kohli"}],"Coach":{"personid":"1767","role":"whatever","FirstName":"Anil","LastName":"Kumble"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/4-11-2-2012-5651d44338907e593f94773398fac650.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/4_s-11-2-2012-dd77610cb84ba225571610f4d3b52097.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/4_l-11-2-2012-b8ce58599a586b164189b090b45c07e1.png"},{"LastUpdated":"2017-02-26T20:26:35+05:30","TeamId":{"status":"1","content":"1"},"TeamName":"Australia","ShortName":"AUS","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/australia-26-2-2013-fc64015435307ed32226b1154fe1c8b0.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/australia_small-26-2-2013-cfe74527547adb1b70ca1c7369364266.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/australia_flag-1-2-2011-5a85f74b5ef46c4d9669aa6814240776.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/australia_flag_small-1-2-2011-2801297b7b06aa33e14c9c0314536a15.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"2"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"2"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"7"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"4308","FirstName":"Steven","LastName":"Smith"},{"current_captain":"no","mtype":"ODI","personid":"4195","FirstName":"Matthew","LastName":"Wade"},{"current_captain":"no","mtype":"T20","personid":"4196","FirstName":"Aaron","LastName":"Finch"}],"Coach":{"personid":"1818","role":"whatever","FirstName":"Darren","LastName":"Lehmann"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1-11-2-2012-8699b8a840e0f972d1276d094fc7c827.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1_s-11-2-2012-280be956394485494566095b9e27426c.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/1_l-11-2-2012-975ee512e59ffc420e26dee2813daa27.png"},{"LastUpdated":"2017-03-04T13:06:54+05:30","TeamId":{"status":"1","content":"7"},"TeamName":"South Africa","ShortName":"SA","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa-26-2-2013-0dd53b4c3d9d2d62fdf47e690a892b92.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa_small-1-2-2011-53d3554a638cc4b114764c154ea164bd.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa_flag-1-2-2011-d42076e888a05412fdfdf7504c4c6649.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/south_africa_flag_small-1-2-2011-52e6632a8c28d6b73e7e583692b58f16.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"3"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"1"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"3"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"28891","FirstName":"Faf","LastName":"du Plessis"},{"current_captain":"yes","mtype":"ODI","personid":"3675","FirstName":"AB","LastName":"de Villiers"},{"current_captain":"no","mtype":"T20","personid":"3675","FirstName":"AB","LastName":"de Villiers"}],"Coach":{"personid":"64189","role":"whatever","FirstName":"Russell","LastName":"Domingo"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/7-11-2-2012-4541e123431f83ef71ca72c9ba36a989.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/7_s-11-2-2012-d7641c072634340445b36f19996601ba.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/7_l-11-2-2012-6ffcebebcba7787554927c94de0b3109.png"},{"LastUpdated":"2017-03-04T11:08:21+05:30","TeamId":{"status":"1","content":"3"},"TeamName":"England","ShortName":"ENG","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens,Non-DomesticExhibition TestMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/england-26-2-2013-e031e0f1a9da23945bff29e137dc1eae.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/england_small-26-2-2013-94d952f96c06ffae74bf5ae06ed37fae.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/england_flag-1-2-2011-e2f5c084ccbade5aa14eaf17911929de.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/england_flag_small-1-2-2011-6c19ffee31cd7fb50f75bafcac6e8531.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"4"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"5"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"5"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"10129","FirstName":"Joe","LastName":"Root"},{"current_captain":"yes","mtype":"ODI","personid":"3823","FirstName":"Eoin","LastName":"Morgan"},{"current_captain":"no","mtype":"T20","personid":"3823","FirstName":"Eoin","LastName":"Morgan"}],"Coach":{"personid":"4897","role":"whatever","FirstName":"Trevor","LastName":"Bayliss"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/3-11-2-2012-1ea91e99c699245b408540e95157a693.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/3_s-11-2-2012-b11aa0721a26bd1d91720320dba3569a.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/3_l-11-2-2012-5593f23256a4c5327fda1729a771f8ff.png"},{"LastUpdated":"2017-03-04T13:06:37+05:30","TeamId":{"status":"1","content":"5"},"TeamName":"New Zealand","ShortName":"NZ","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens,Non-DomesticExhibition TestMens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand-26-2-2013-e83c496a930a420848b561c210dbbaf4.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand_small-26-2-2013-f3b6a4b8899eb627854a956677ea2c53.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand_flag-1-2-2011-47faa19586061974b01c99058628d32e.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/new_zealand_flag_small-1-2-2011-648a3001043e4d94a5eebd9dfe9a88a5.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"5"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"3"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"1"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"4330","FirstName":"Kane","LastName":"Williamson"},{"current_captain":"yes","mtype":"ODI","personid":"4330","FirstName":"Kane","LastName":"Williamson"},{"current_captain":"no","mtype":"T20","personid":"4330","FirstName":"Kane","LastName":"Williamson"}],"Coach":{"personid":"63213","role":"whatever","FirstName":"Mike","LastName":"Hesson"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/5-11-2-2012-36848dfcad81aae16dfc28cc1c506618.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/5_s-11-2-2012-a3e1d867528e59013ea81407d1fdfe02.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/5_l-11-2-2012-78e43d8e16ee76e5f28da1a679de2eff.png"},{"LastUpdated":"2017-02-11T01:15:36+05:30","TeamId":{"status":"1","content":"6"},"TeamName":"Pakistan","ShortName":"PAK","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan-26-2-2013-f6f54d67dea9677b03ddc1c009c070f9.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan_small-26-2-2013-6af95f1da13f29b8ef5ccfbf3cb89648.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan_flag-1-2-2011-f99a8132f62ed22d64b985c2ba0d65eb.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/pakistan_flag_small-1-2-2011-5bbc7ebe24b9bc2460e131bfc9cafd78.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"6"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"8"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"7"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"2068","FirstName":"Misbah-ul-Haq","LastName":null},{"current_captain":"yes","mtype":"ODI","personid":"4038","FirstName":"Sarfraz","LastName":"Ahmed"},{"current_captain":"no","mtype":"T20","personid":"4038","FirstName":"Sarfraz","LastName":"Ahmed"}],"Coach":{"personid":"4896","role":"whatever","FirstName":"Mickey","LastName":"Arthur"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/6-11-2-2012-e492bb0be566324796f25d3bcd2c3019.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/6_s-11-2-2012-2ef4be67daf68f843f48115ff5ba8f1a.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/6_l-11-2-2012-472fc93551b80e5564b9fd0355191a4e.png"},{"LastUpdated":"2017-03-01T16:05:22+05:30","TeamId":{"status":"1","content":"8"},"TeamName":"Sri Lanka","ShortName":"SL","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka-26-2-2013-de0108e194085662137677a04fc4d093.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka_small-26-2-2013-da0378709cab16d862dd11348d5f8a09.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka_flag-1-2-2011-9c66eb3e952d7fcda9b20d42145ef18c.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/sri_lanka_flag_small-1-2-2011-4239d880b394fcc423a14234d1fafaac.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"7"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"6"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"8"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"5244","FirstName":"Angelo","LastName":"Mathews"},{"current_captain":"no","mtype":"ODI","personid":"3702","FirstName":"Upul","LastName":"Tharanga"},{"current_captain":"no","mtype":"T20","personid":"5244","FirstName":"Angelo","LastName":"Mathews"}],"Coach":{"personid":"22094","role":"whatever","FirstName":"Jerome","LastName":"Jayaratne"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/8-11-2-2012-09cb390bd958ae05890f56d2b1d9a39a.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/8_s-11-2-2012-8d06a8566e73875152c057e7a0993b45.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/8_l-11-2-2012-42596125ceefa9b3960e6231785d0ab6.png"},{"LastUpdated":"2017-03-04T11:09:30+05:30","TeamId":{"status":"1","content":"9"},"TeamName":"West Indies","ShortName":"WI","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies-26-2-2013-d3ee3026b84398864c10e4320494c6e8.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies_small-26-2-2013-d0e88ec3179f31a2c0ebc05e1830453e.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies_flag-1-2-2011-1f60ba1dc32a680e11ae5efe99bcc924.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/west_indies_flag_small-1-2-2011-7f81c93235b1ea332d460c28778e21a4.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"8"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"9"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"4"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"10232","FirstName":"Jason","LastName":"Holder"},{"current_captain":"yes","mtype":"ODI","personid":"10232","FirstName":"Jason","LastName":"Holder"},{"current_captain":"no","mtype":"T20","personid":"56973","FirstName":"Carlos","LastName":"Brathwaite"}],"Coach":{"personid":"149","role":"whatever","FirstName":"Stuart","LastName":"Law"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/9-11-2-2012-c51c1d9604f42152a6e87e5cb38542e3.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/9_s-11-2-2012-b317c02e8201f9cbbefd3d21381bb534.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/9_l-11-2-2012-da7e8c6fe82f0fa6ec7ee4d3051d3ba6.png"},{"LastUpdated":"2017-02-28T12:25:43+05:30","TeamId":{"status":"1","content":"2"},"TeamName":"Bangladesh","ShortName":"BAN","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh-26-2-2013-ce56db03135b10cf77a4b487115cffea.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh_small-26-2-2013-5863cc151a9fcee810314452854efd0e.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh_flag-1-2-2011-60e36623244889186536ddf79ddd7a74.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/bangladesh_flag_small-1-2-2011-578103ec57a0fd8d6147f9e92b6a1b7e.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"9"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"7"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"10"}],"Captain":[{"current_captain":"yes","mtype":"Test","personid":"3693","FirstName":"Mushfiqur","LastName":"Rahim"},{"current_captain":"no","mtype":"ODI","personid":"1948","FirstName":"Mashrafe","LastName":"Mortaza"},{"current_captain":"no","mtype":"T20","personid":"1948","FirstName":"Mashrafe","LastName":"Mortaza"}],"Coach":{"personid":"1413","role":"whatever","FirstName":"Chandika","LastName":"Hathurusingha"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/2-11-2-2012-4eecb7dca92c191ec776311e4fe802cb.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/2_s-11-2-2012-4490ca9fcde22aa60d67259151e5d1f0.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/2_l-11-2-2012-a853bb5b43497e2b3a38791dc389adc0.png"},{"LastUpdated":"2017-02-26T22:18:57+05:30","TeamId":{"status":"1","content":"10"},"TeamName":"Zimbabwe","ShortName":"ZIM","TeamType":"InternationalTestMens,InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens,InternationalWarm-up T20Mens","TeamCategory":"Men's","TeamLogoPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe-26-2-2013-31a0ff68b0cd513b46c5bc8b4ac6fb7f.jpg","TeamLogoSmallPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe_small-26-2-2013-3fa280679cc09d274123420e13abc8f8.jpg","TeamFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe_flag-1-2-2011-f21f8d897256f2509a730f93112daf0a.gif","TeamSmallFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/zimbabwe_flag_small-1-2-2011-790452146c32bdcacd149e27895001b4.gif","Ranking":[{"mtype":"Test","ranker":"icc","trend":"steady","content":"10"},{"mtype":"ODI","ranker":"icc","trend":"steady","content":"11"},{"mtype":"T20","ranker":"icc","trend":"steady","content":"12"}],"Captain":[{"current_captain":"no","mtype":"Test","personid":"3656","FirstName":"Graeme","LastName":"Cremer"},{"current_captain":"yes","mtype":"ODI","personid":"3656","FirstName":"Graeme","LastName":"Cremer"},{"current_captain":"no","mtype":"T20","personid":"3656","FirstName":"Graeme","LastName":"Cremer"}],"Coach":{"personid":"2884","role":"whatever","FirstName":"Heath","LastName":"Streak"},"TeamRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/10-11-2-2012-e679699d425313483daeed697d802023.png","TeamSmallRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/10_s-11-2-2012-fdbd0a77e493fe44165ab2b012380268.png","TeamLargeRoundFlagPath":"https://s.yimg.com/qx/cricket/fufp/images/10_l-11-2-2012-4dc0861b3616d2c3ad05e5e7e94207df.png"}]}
         */

        private int count;
        private String created;
        private String lang;
        private DiagnosticsBean diagnostics;
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

        public static class DiagnosticsBean {
            /**
             * cache : {"execution-start-time":"0","execution-stop-time":"4","execution-time":"4","method":"GET","type":"MEMCACHED","content":"TABLE.queryyahooapiscomproductionsg3.cricket.teams.cb28f8540307fdb68289fa5fedc2b832"}
             * url : [{"execution-start-time":"6","execution-stop-time":"10","execution-time":"4","content":"http://sherpa-bcp5903.dht.yahoo.com:4080/YDHTWebService/V1/get/yql.global/store%3A%2F%2FgPeXezE09iMcke9Y40ueqU"},{"execution-start-time":"15","execution-stop-time":"20","execution-time":"5","content":"http://cricketwebservice/ws/cwsapi/teams.php?output=summary&offset=0&count=10"}]
             * publiclyCallable : true
             * user-time : 22
             * service-time : 13
             * build-version : 2.0.97
             */

            private CacheBean cache;
            private String publiclyCallable;
            @SerializedName("user-time")
            private String usertime;
            @SerializedName("service-time")
            private String servicetime;
            @SerializedName("build-version")
            private String buildversion;
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

            public static class CacheBean {
                /**
                 * execution-start-time : 0
                 * execution-stop-time : 4
                 * execution-time : 4
                 * method : GET
                 * type : MEMCACHED
                 * content : TABLE.queryyahooapiscomproductionsg3.cricket.teams.cb28f8540307fdb68289fa5fedc2b832
                 */

                @SerializedName("execution-start-time")
                private String executionstarttime;
                @SerializedName("execution-stop-time")
                private String executionstoptime;
                @SerializedName("execution-time")
                private String executiontime;
                private String method;
                private String type;
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

            public static class UrlBean {
                /**
                 * execution-start-time : 6
                 * execution-stop-time : 10
                 * execution-time : 4
                 * content : http://sherpa-bcp5903.dht.yahoo.com:4080/YDHTWebService/V1/get/yql.global/store%3A%2F%2FgPeXezE09iMcke9Y40ueqU
                 */

                @SerializedName("execution-start-time")
                private String executionstarttime;
                @SerializedName("execution-stop-time")
                private String executionstoptime;
                @SerializedName("execution-time")
                private String executiontime;
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

        public static class ResultsBean {
            private List<TeamBean> Team;

            public List<TeamBean> getTeam() {
                return Team;
            }

            public void setTeam(List<TeamBean> Team) {
                this.Team = Team;
            }

            public static class TeamBean {
                /**
                 * LastUpdated : 2017-02-01T12:58:32+05:30
                 * TeamId : {"status":"1","content":"16"}
                 * TeamName : Scotland
                 * ShortName : SCO
                 * TeamType : InternationalODIMens,InternationalT20Mens,DomesticFirst-classMens,DomesticList AMens,DomesticT20Mens,InternationalWarm-up 50 overMens
                 * TeamCategory : Men's
                 * TeamLogoPath : https://s.yimg.com/qx/cricket/fufp/images/scotland-28-5-2011-6b8837ab0caf58585c591a0d14d930bd.jpg
                 * TeamLogoSmallPath : https://s.yimg.com/qx/cricket/fufp/images/scotland_small-28-5-2011-c3e69a0626556d8655d29089b432b7b1.jpg
                 * TeamFlagPath : https://s.yimg.com/qx/cricket/fufp/images/scotland_flag-28-5-2011-a7444fc5a6c9c20e315b9127e054bfce.gif
                 * TeamSmallFlagPath : https://s.yimg.com/qx/cricket/fufp/images/scotland_flag_small-28-5-2011-3e2ece7f17ddabe1ddb67ac18d297914.gif
                 * Ranking : {"mtype":"T20","ranker":"icc","trend":"steady","content":"11"}
                 * Captain : [{"current_captain":"yes","mtype":"ODI","personid":"11918","FirstName":"Preston","LastName":"Mommsen"},{"current_captain":"no","mtype":"T20","personid":"11918","FirstName":"Preston","LastName":"Mommsen"}]
                 * Coach : {"personid":"641","role":"whatever","FirstName":"Grant","LastName":"Bradburn"}
                 * TeamRoundFlagPath : https://s.yimg.com/qx/cricket/fufp/images/16-11-2-2012-caabf874e5d5aa46a8c2ff9b8b80070f.png
                 * TeamSmallRoundFlagPath : https://s.yimg.com/qx/cricket/fufp/images/16_s-11-2-2012-06e19db515c70c3d3e90d196f1de2ffa.png
                 * TeamLargeRoundFlagPath : https://s.yimg.com/qx/cricket/fufp/images/16_l-11-2-2012-c7bedaa78b23b63de75b4cfc7533e0ae.png
                 */

                private String LastUpdated;
                private TeamIdBean TeamId;
                private String TeamName;
                private String ShortName;
                private String TeamType;
                private String TeamCategory;
                private String TeamLogoPath;
                private String TeamLogoSmallPath;
                private String TeamFlagPath;
                private String TeamSmallFlagPath;
                private RankingBean Ranking;
                private CoachBean Coach;
                private String TeamRoundFlagPath;
                private String TeamSmallRoundFlagPath;
                private String TeamLargeRoundFlagPath;
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

                public RankingBean getRanking() {
                    return Ranking;
                }

                public void setRanking(RankingBean Ranking) {
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

                public static class TeamIdBean {
                    /**
                     * status : 1
                     * content : 16
                     */

                    private String status;
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

                public static class RankingBean {
                    /**
                     * mtype : T20
                     * ranker : icc
                     * trend : steady
                     * content : 11
                     */

                    private String mtype;
                    private String ranker;
                    private String trend;
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

                public static class CoachBean {
                    /**
                     * personid : 641
                     * role : whatever
                     * FirstName : Grant
                     * LastName : Bradburn
                     */

                    private String personid;
                    private String role;
                    private String FirstName;
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

                public static class CaptainBean {
                    /**
                     * current_captain : yes
                     * mtype : ODI
                     * personid : 11918
                     * FirstName : Preston
                     * LastName : Mommsen
                     */

                    private String current_captain;
                    private String mtype;
                    private String personid;
                    private String FirstName;
                    private String LastName;

                    public String getCurrent_captain() {
                        return current_captain;
                    }

                    public void setCurrent_captain(String current_captain) {
                        this.current_captain = current_captain;
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
