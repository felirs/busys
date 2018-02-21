$(function () {


    $('#w').window('open');
    var $btn_submit = $('a#login-btn-submit'),
        $btn_clear = $('a#login-btn-clear'),
        $form = $('#login-form');

    $btn_submit.on('click', function () {
        $.ajax({
            url: '/login',
            method: 'POST',
            data: $form.serialize(),
            success: function (result) {
                var resultObj = JSON.parse(result);
                if (resultObj.success) {
                    $.messager.show({
                        title:'提示',
                        msg: '登录成功!',
                        timeout: 2000,
                        style: {
                            align: 'center'
                        },
                        showType: 'fade'
                    });
                    window.location.href = "/index";
                } else {
                    $.messager.show({
                        title:'提示',
                        msg: '登录失败',
                        timeout: 2000,
                        style: {
                            align: 'center'
                        },
                        showType: 'fade'
                    });
                }
            },
            error: function () {
                $.messager.show({
                    title:'提示',
                    msg: '登录失败',
                    timeout: 2000,
                    style: 'text-align:center;',
                    showType: 'fade'
                });
            }
        });
    });

    $btn_clear.on('click', function () {
        $form[0].reset();
    })
});