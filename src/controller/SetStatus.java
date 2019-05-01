package controller;

import domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetStatus extends asyncHandler{
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Person user = (Person) request.getSession().getAttribute("user");
        if (user != null){
            user.setStatus(request.getParameter("status"));
        }
        return null;
    }
}
