function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    comment2target(questionId, 1, content);
}

function comment2target(targetId, type, content) {
    if (!content) {
        alert("不能回复空内容~~~");
        return;
    }

    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: 'application/json',
        data: JSON.stringify({
            "parentId": targetId,
            "content": content,
            "type": type
        }),
        success: function (response) {
            if (response.code == 200) {
                window.location.reload();
            } else {
                if (response.code == 2003) {
                    var isAccepted = confirm(response.message);
                    if (isAccepted) {
                        $('#myModal').modal({});
                        // window.open("https://github.com/login/oauth/authorize?client_id=7f316909bf70d1eaa2b2&redirect_uri=" + document.location.origin + "/callback&scope=user&state=1");
                        // window.localStorage.setItem("closable", true);
                    }
                } else {
                    alert(response.message);
                }
            }
        },
        dataType: "json"
    });
}

function comment(e) {
    var commentId = e.getAttribute("data-id");
    var content = $("#input-" + commentId).val();
    comment2target(commentId, 2, content);
}

/**
 * 展开二级评论
 */
function collapseComments(e) {
    var id = e.getAttribute("data-id");
    var comments = $("#comment-" + id);

    // 获取一下二级评论的展开状态
    var collapse = e.getAttribute("data-collapse");
    if (collapse) {
        // 折叠二级评论
        comments.removeClass("in");
        e.removeAttribute("data-collapse");
        e.classList.remove("active");
    } else {
        //展开二级评论
        comments.addClass("in");
        // 标记二级评论展开状态
        e.setAttribute("data-collapse", "in");
        e.classList.add("active");
    }
}

function showSelectTag() {
    $("#select-tag").show();
}

function selectTag(e) {
    var value = e.getAttribute("data-tag");
    var previous = $("#tag").val();

    if (previous) {
        var index = 0;
        var appear = false; //记录value是否已经作为一个独立的标签出现过
        while (true) {
            index = previous.indexOf(value, index); //value字符串在previous中出现的位置
            if (index == -1) break;
            //判断previous中出现的value是否是另一个标签的一部分
            //即value的前一个和后一个字符都是逗号","或者没有字符时，才说明value是一个独立的标签
            if ((index == 0 || previous.charAt(index - 1) == ",")
                && (index + value.length == previous.length || previous.charAt(index + value.length) == ",")
            ) {
                appear = true;
                break;
            }
            index++; //用于搜索下一个出现位置
        }
        if (!appear) {
            //若value没有作为一个独立的标签出现过
            $("#tag").val(previous + ',' + value);
        }
    }
    else {
        $("#tag").val(value);
    }
}