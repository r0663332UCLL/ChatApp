package controller;

import domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUser extends asyncHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String status = request.getParameter("state");
        String userid = request.getParameter("userId");

        Person person = this.getPersonService().getPerson(userid);
        person.setStatus(status);

        return null;
    }
}
