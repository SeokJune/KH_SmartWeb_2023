var mHtml = $("html");

function movePage(page) {
    var posTop = (page - 1) * $(window).height();
    mHtml.animate({ scrollTop: posTop });

    if(page == 1) {
        document.getElementById("title").innerHTML = "<div>About Me</div>"
    } else if (page == 2) {
        document.getElementById("title").innerHTML = "<div>Career</div>"
    } else if (page == 3) {
        document.getElementById("title").innerHTML = "<div>Skills</div>"
    } else if (page == 4) {
        document.getElementById("title").innerHTML = "<div>Project01</div>"
    } else if (page == 5) {
        document.getElementById("title").innerHTML = "<div>Project02</div>"
    }
}