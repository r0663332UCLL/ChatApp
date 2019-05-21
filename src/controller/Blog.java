package controller;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint("/blog")
public class Blog {
    private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());

    @OnOpen
    public void OnOpen(Session session){
        sessions.add(session);
    }

    @OnClose
    public void OnClose(Session session){
        sessions.remove(session);
    }

    @OnMessage
    public void OnMessage(Session session, String message){
        sendToEveryone(message);
    }

    public void sendToEveryone(String comment){
        for(Session s : sessions){
            try {
                s.getBasicRemote().sendText(comment);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
