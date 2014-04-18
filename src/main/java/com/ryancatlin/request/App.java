package com.ryancatlin.request;

import java.util.HashMap;

import com.github.kevinsawicki.http.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        String quotesUrl = "http://www.iheartquotes.com/api/v1/random";
        HttpRequest request = HttpRequest.get(quotesUrl);

        int code = request.code();
        if (code == 200) {
            String body = request.body();
            System.out.println(body);
        } else {
            System.out.println("Unsuccessfull." + " " + code);
        }
    }
}
