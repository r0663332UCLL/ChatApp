package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public abstract class asyncHandler extends RequestHandler {
    @Override
    public abstract String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
