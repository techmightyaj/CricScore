package com.techmighty.cricscore.utility;

/**
 * Created by avaria on 05/03/17.
 */

public class UrlConstants {

    //Fetch Team Info
    public static String TEAM_INFO = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20cricket.teams&format=json&diagnostics=true&env=store%3A%2F%2F0TxIGQMQbObzvU4Apia0V0&callback=";
    public static String UPCOMING_MATCHES = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20cricket.upcoming_matches&format=json&diagnostics=true&env=store%3A%2F%2F0TxIGQMQbObzvU4Apia0V0&callback=";

}
