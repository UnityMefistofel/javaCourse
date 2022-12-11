package lesson_14.homework;
//package com.example.webjakeedemo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calcServlet", value = "/calcServlet")
public class Calc extends HttpServlet {

    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String inpParam1 = request.getParameter("par1");    // первое число
        String inpParam2 = request.getParameter("par2");  // второе число
        String inpParam3 = request.getParameter("par3");  // операция ( add / sub / mul / div для

        //    для сложения, вычитания, умножения и деления

        //    соответственно )

        float num1 = 0;
        float num2 = 0;
        if (inpParam1 != null) {
            num1 = Float.parseFloat(inpParam1);
        }
        if (inpParam2 != null) {
            num2 = Float.parseFloat(inpParam2);
        }

        float res = 0;
        String act = "+";
        if (inpParam3 != null) {
            switch (inpParam3) {
                case "add" -> {
                    res = num1 + num2;
                    act = "+";
                }
                case "sub" -> {
                    res = num1 - num2;
                    act = "-";
                }
                case "mul" -> {
                    res = num1 * num2;
                    act = "*";
                }
                case "div" -> {
                    res = (num2 == 0) ? 0 : num1 / num2;
                    act = "/";
                }
                default -> {
                }
            }
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Калькулятор";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>Первое число</b>: "
                + num1+ "\n" +
                "  <li><b>Второе число</b>: "
                + num2+ "\n" +
                "</ul>\n" +
                "<br/>" +
                "<p>Выражение: "+num1+" "+act+" "+num2+" = "+res+"</p>"+
                "</body>" +
                "</html>"
        );
    }

    public void destroy() {}

}

