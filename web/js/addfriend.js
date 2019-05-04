var addVriendRequest = new XMLHttpRequest();

var addvriendbutton = document.getElementById("addvriendbutton");
addvriendbutton.onclick = addVriend;

function addVriend() {
    var gezochtevriend = document.getElementById("vriendinput").value;

    if (gezochtevriend !== "") {
        var information = "vriend=" + encodeURIComponent(gezochtevriend);
        addVriendRequest.open("POST", "Controller?action=AddVriend", true);
        addVriendRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        addVriendRequest.send(information);
    }
}