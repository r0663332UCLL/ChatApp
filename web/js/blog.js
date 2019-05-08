function openSocket() {
    webSocket = new WebSocket("ws://localhost:8080/blog");
}

function send(id){
    var newComment = {};
    newComment.id = id;
    newComment.comment = document.getElementById("comment" + id);
    newComment.naam = document.getElementById("naam" + id);
    newComment.rating = document.getElementById("rating" + id);
    webSocket.send(JSON.stringify(newComment));
}
openSocket();