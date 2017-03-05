package com.techmighty.cricscore.datamanager.network;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by avaria on 05/03/17.
 */

public class CustomJsonRequest extends JsonObjectRequest {

    public CustomJsonRequest(int method, String url, JSONObject jsonRequest, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(method, url, jsonRequest, listener, errorListener);
    }

    public Map<String, String> getHeaders() throws AuthFailureError{
        HashMap<String, String > headers = new HashMap<>();
        headers.put("Content-Type","application/json; charset=utf-8");
        return headers;
    }
}
