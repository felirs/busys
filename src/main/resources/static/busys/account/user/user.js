$(function () {
    var $delBtn = $('a#btn-user-delete'),
        $createBtn = $('a#btn-user-add'),
        $editBtn = $('a#btn-user-edit'),
        $saveBtn = $('a#btn-user-save'),
        url = '';

    $createBtn.on('click', function () {
        $('#user-dialog').dialog('open').dialog('setTitle', '创建用户');
        $('#user-form').form('clear');
        url = '/user/add';
    });

    $editBtn.on('click', function () {
        var row = $('#user-grid').datagrid('getSelected'),
            $form = $('#user-form');
        if(row){
            $('#user-dialog').dialog('open').dialog('setTitle', '编辑用户');
            $form.form('clear');
            $form.form('load', row);
            url = '/user/update';
        }else{
            $.messager.show({
                title: '提示',
                msg: '请先选择一个用户'
            });
            return false;
        }
    });

    $saveBtn.on('click', function(){
        $('#fm').form('submit',{
            url: url,
            onSubmit: function(){
                return $(this).form('validate');
            },
            success: function(result){
                if (!!result){
                    $('#user-dialog').dialog('close');		// close the dialog
                    $('#user-grid').datagrid('reload');	// reload the user data
                } else {
                    $.messager.show({
                        title: '失败',
                        msg: '添加失败，请稍后再试！'
                    });
                }
            },

            error: function () {
                $.messager.show({
                    title: '失败',
                    msg: '系统错误'
                });
            }
        });
    });

    $delBtn.on('click', function () {
        var row = $('#user-grid').datagrid('getSelected');
        if (row) {
            $.messager.confirm('提示', '确定要删除选中的用户吗？', function (r) {
                if (r) {
                    $.ajax({
                        url: '/user/delete/' + row.id,
                        method: 'POST',
                        success: function (result) {
                            if (!!result) {
                                $('#user-grid').datagrid('reload');
                            } else {
                                $.messager.show({
                                    title: '失败',
                                    msg: '删除失败，请稍后再试！'
                                });
                            }
                        },

                        error: function () {
                            $.messager.show({
                                title: '失败',
                                msg: '系统错误'
                            });
                        }
                    });
                }
            });
        }
    });
});