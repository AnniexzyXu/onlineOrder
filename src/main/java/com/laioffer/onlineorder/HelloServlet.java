package com.laioffer.onlineorder;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        // Hello
        PrintWriter out = response.getWriter();
        JSONObject object = new JSONObject();
        object.put("email", "sunlaioffer");
        out.println(object);
    }
    public void destroy() {
    }
}