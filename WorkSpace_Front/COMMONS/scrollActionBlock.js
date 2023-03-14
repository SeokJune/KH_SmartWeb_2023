// 휠 스크롤 기능 제거
window.addEventListener("wheel", function (e) {
    e.preventDefault();
}, { passive: false });

var mHtml = $("html");
// 뷰포트에 표시되는 페이지 번호
var page = 1;
// 마지막 페이지의 번호
var lastPage = $(".section").length;
// 첫페이지 시작
mHtml.animate({ scrollTop: 0 }, 10);
$(window).on("wheel", function (e) {

    if (mHtml.is(":animated")) return;

    if (e.originalEvent.deltaY > 0) {
        if (page == lastPage) return;
        page++;
    } else if (e.originalEvent.deltaY < 0) {
        if (page == 1) return;
        page--;
    }
    
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
});