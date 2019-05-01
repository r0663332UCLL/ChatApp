window.onload = function(){
    getStatus();
};

var customStatusButton = document.getElementById('statusbutton');
customStatusButton.onclick = setStatus;

var getStatusRequest = new XMLHttpRequest();
var setStatusRequest = new XMLHttpRequest();

function setStatus(){
    var preferredStatus = document.getElementById("statusinput").value;

    if (preferredStatus !== "") {
        var information = "status=" + encodeURIComponent(preferredStatus);
        setStatusRequest.open("POST", "Controller?action=SetStatus", true);
        setStatusRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        setStatusRequest.send(information);
        document.getElementById("statusoutput").innerText = preferredStatus;
    }
}

function getStatus () {
    getStatusRequest.open("GET", "Controller?action=GetStatus", true);
    getStatusRequest.onreadystatechange = getData;
    getStatusRequest.send(null);
}

function getData() {
    if(getStatusRequest.status === 200){
        if(getStatusRequest.readyState === 4){
            document.getElementById("statusoutput").innerText = getStatusRequest.responseText;
        }
    }
}
