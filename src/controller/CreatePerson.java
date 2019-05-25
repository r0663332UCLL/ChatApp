package controller;

import domain.Gender;
import domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreatePerson extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String destination = "index.jsp";
        List<String> errors = new ArrayList<>();
        Person person = new Person();

        try {
            String firstName = request.getParameter("firstName");
            person.setFirstName(firstName);
        } catch (Exception e) {
            errors.add(e.getMessage());
        }

        try {
            String lastName = request.getParameter("lastName");
            person.setLastName(lastName);
        } catch (Exception e) {
            errors.add(e.getMessage());
        }

        try {
            String userId = request.getParameter("userId");
            person.setUserId(userId);
        } catch (Exception e) {
            errors.add(e.getMessage());
        }

        try {
            String gender = request.getParameter("gender");
            person.setGender(Gender.valueOf(gender));
        } catch (Exception e) {
            errors.add(e.getMessage());
        }

        try {
            int leeftijd = Integer.parseInt(request.getParameter("age"));
            person.setAge(leeftijd);
        } catch (Exception e) {
            errors.add(e.getMessage());
        }

        try {
            String password = request.getParameter("password");
            String passwordrepeat = request.getParameter("passwordrepeat");
            if (!password.equals(passwordrepeat)) {
                throw new IllegalArgumentException("Wachtwoorden zijn niet hetzelfde");
            } else {
            person.setHashedPassword(password);
            }
        } catch (Exception e) {
            errors.add(e.getMessage());
        }

        if (errors.isEmpty()) {
            try {
                getPersonService().addPerson(person);
            } catch (Exception e) {
                errors.add(e.getMessage());
                request.setAttribute("errors", errors);
            }
        } else {
            request.setAttribute("errors", errors);
            destination = "register.jsp";
        }

        return destination;
    }
}

