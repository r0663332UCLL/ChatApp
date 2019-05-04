package controller;

import domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddVriend extends asyncHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Person user = (Person) request.getSession().getAttribute("user");
        String gezochteVriend = request.getParameter("vriend");
        if (user != null){
            Person nieuweVriend = getPersonService().getPerson(request.getParameter("vriend"));
            user.addFriend(nieuweVriend);
        }
        return null;
    }
}
