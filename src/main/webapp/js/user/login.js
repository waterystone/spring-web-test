function login_submit() {


    jQuery.post("/login/commit",
        {
            account: jQuery("#inputAccount").val(),
            password: jQuery("#inputPassword").val(),
            isRemember: jQuery("#inputRemember").prop("checked"),
        },
        function (data, status) {
            if (data.status != 200) {
                alert(data.msg);
                return;
            }

            var srcUrl = jQuery("#inputSrcUrl").val();
            if (srcUrl == null || srcUrl == '') {
                srcUrl = '/';
            }
            location.href = srcUrl;
        });

}