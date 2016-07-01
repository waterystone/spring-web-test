function login_submit() {
    var srcUrl = location.search.toString();

    jQuery.post("http://localhost:8087/user/login",
        {
            account: jQuery("#account").val(),
            password: jQuery("#password").val()
        },
        function (data, status) {
            if (data.status != 200) {
                alert(data.msg);
                return;
            }

            if (srcUrl == '') {
                location.href = "/";
            } else {
                location.href = decodeURIComponent(srcUrl.substr(8));
                ;
            }
        });

}