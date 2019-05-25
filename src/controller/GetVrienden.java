package controller;

import domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetVrienden extends asyncHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Person user = (Person) request.getSession().getAttribute("user");
        if (user != null){
            response.setContentType("application/json");
            response.getWriter().write(usersToJson(user.getVrienden()));
        }
        return null;
    }
}
