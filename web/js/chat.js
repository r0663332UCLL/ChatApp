$(document).ready(function () {
    $("#toggle-vrienden").click(function () {
        $("#vrienden").slideToggle("slow");
    });

});

var currentlySelectedFriend

function showChat(id) {
    currentlySelectedFriend = id;
    var chatskeleton =
        "<h4>" + id + "</h4>" +
        "<ul id=\"berichten\">" +
        "</ul>" +
        "<p>" +
        "<input type=\"text\" id=\"bericht\">" +
        "<button id=\"sendbericht\" onclick=\"sendMessage('" + id + "')\">send</button>" +
        "</p>";
    $('#chatvenster').html(chatskeleton);
    setInterval(getChat,600);
}

function getChat() {
    $.ajax({
        type: "GET",
        url: "Controller?action=Chat&userId=" + currentlySelectedFriend,
        dataType: "json",
        success: function (result) {
            $('#berichten').empty();
            for (var i = 0; i < result.length; i++) {
                $('#berichten').append($('<li>' + result[i] + '</li>'));
            }

        }
    })
}

function sendMessage(id) {
    var bericht = $('#bericht').val();
    $('#bericht').val("");
    $.post("Controller", {action: "SendChat", message: bericht, userId: id})
}