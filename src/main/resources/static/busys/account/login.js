$(function(){
    var $btn_submit = $('a#login-btn-submit'),
        $btn_clear = $('a#login-btn-clear'),
        $form = $('#login-form');

    $btn_submit.on('click',function () {
        console.log($form.serialize());
        $.ajax({
            url:'/login',
            method:'POST',
            data:$form.serialize(),
            success:function (result) {
                var resultObj = JSON.parse(result);
                console.log(resultObj.success);
                if(resultObj.success){
                    window.location.href="/index";
                }else{
                    alert('登录失败');
                }
            },
            error:function(){
                alert('登录失败');
            }
        });
    });

    $btn_clear.on('click', function () {
        $form.clear();
    })
});