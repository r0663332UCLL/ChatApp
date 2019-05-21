package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Person;

public abstract class asyncHandler extends RequestHandler {
    @Override
    public abstract String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException;

    public String friendsToJson(List<Person> persons){
        String json = "[";
        int i = 0;
        for (Person person : persons){
            json += "{\"firstName\":\"" + person.getFirstName() + "\"," +
                    "\"lastName\":\"" + person.getLastName() + "\"," +
                    "\"status\":\"" + person.getStatus() + "\"," +
                    "\"userId\":\"" + person.getUserId() + "\"}";
            i++;
            if (persons.size() != i){
                json += ",";
            }
        }
        json += "]";
        return json;
    }

    public String conversationToJson(List list) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(list);
    }
}
