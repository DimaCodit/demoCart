package com.example.demoCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CartServlet", urlPatterns = "/cart")
public class Cart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String page = "";

        List<Product> productsList = Arrays.asList(
                new Product("1", "Гречка", 80),
                new Product("2", "Рис", 55),
                new Product("3", "Перловка", 33),
                new Product("4", "Манка", 25),
                new Product("5", "Пшено", 44),
                new Product("6", "Геркулес", 30),
                new Product("7", "Горох", 47),
                new Product("8", "Фасоль", 81),
                new Product("9", "Булгур", 90),
                new Product("10", "Спагетти", 99)
        );

        for (Product p : productsList) {
            page +="<h1>" + p.getTitle() + "</h1>" + System.lineSeparator();
            page +="<h3>Артикул: " + p.getId() + "</h3>" + System.lineSeparator();
            page +="<h3>Цена: " + p.getCost() + "</h3> <br/>" + System.lineSeparator();

        }

        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        resp.getWriter().print(page);
    }
}
