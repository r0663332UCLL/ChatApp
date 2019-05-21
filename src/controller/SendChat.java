package controller;

import domain.Conversation;
import domain.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendChat extends asyncHandler {
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Person user = (Person) request.getSession().getAttribute("user");
        if (user != null) {
            String userID = request.getParameter("userId");
            Person person2 = getPersonService().getPerson(userID);
            Conversation found = null;
            if (user.getVrienden().contains(getPersonService().getPerson(userID))) {
                for (Conversation conversation : this.getPersonService().getConversations()) {
                    if ((conversation.person1.getUserId().equals(user.getUserId()) && conversation.person2.getUserId().equals(userID)) ||
                            (conversation.person2.getUserId().equals(user.getUserId()) && conversation.person1.getUserId().equals(userID))) {
                        found = conversation;
                        break;
                    }
                }
                if(found == null) {
                    found = new Conversation(user, getPersonService().getPerson(userID));
                    this.getPersonService().getConversations().add(found);
                }

                if (!request.getParameter("message").isEmpty()) {
                    found.messages.add(user.getUserId() + ": " +request.getParameter("message"));
                }
            }
        }
        return null;
    }
}