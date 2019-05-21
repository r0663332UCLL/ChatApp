var vriendrequest = new XMLHttpRequest();

function getVrienden() {
    vriendrequest.open("GET", "Controller?action=GetVrienden", true);
    vriendrequest.onreadystatechange = getVriendData;
    vriendrequest.send();
}

function getVriendData() {
    if (vriendrequest.status === 200) {
        if (vriendrequest.readyState === 4) {
            var serverResponse = JSON.parse(vriendrequest.responseText);
            var vrienden = "";
            for (var i = 0; i < serverResponse.length; i++) {
                vrienden += "<li onclick=showChat(\'" + serverResponse[i].userId + "\')>" + serverResponse[i].firstName + " " + serverResponse[i].lastName + ": " + serverResponse[i].status + "</li>";
            }
            document.getElementById("vrienden").innerHTML = vrienden;
            setTimeout(getVrienden, 2000);
        }
    }
}