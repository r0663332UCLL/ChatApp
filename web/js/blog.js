var webSocket
function openSocket() {
    webSocket = new WebSocket("ws://localhost:8080/ChatApp_Web_exploded/blog");

    webSocket.onmessage = function(event){
        writeResponse(event.data);
    };
}

function send(id){
    var newComment = {};
    newComment.id = id;
    newComment.comment = document.getElementById("comment" + id).value;
    newComment.naam = document.getElementById("naam" + id).value;
    newComment.rating = document.getElementById("rating" + id).value;
    webSocket.send(JSON.stringify(newComment));
}

function writeResponse(JSONtext) {
    var receivedComment = JSON.parse(JSONtext);
    var commentsUL = document.getElementById("topic" + receivedComment.id + "-comments");
    var commentLI = document.createElement('li');
    var commentTxt = document.createTextNode("--> " + receivedComment.naam + " with a rating of  " + receivedComment.rating + " responded : " + receivedComment.comment);
    commentLI.appendChild(commentTxt);
    commentsUL.appendChild(commentLI);
}
openSocket();