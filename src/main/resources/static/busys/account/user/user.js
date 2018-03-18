$(function () {
    var $delBtn = $('a#btn-user-delete');

    $delBtn.on('click', function(){
        var row = $('#user-grid').datagrid('getSelected');
        if(row){
            $.messager.confirm('提示','确定要删除选中的用户吗？',function(r){
                if (r){
                   $.ajax({
                       url: '/user/delete/'+row.id,
                       method: 'POST',
                       success:function(result){
                           if(!!result){
                               $('#user-grid').datagrid('reload');
                           }else{
                               $.messager.show({
                                   title: '失败',
                                   msg: '删除失败，请稍后再试！'
                               });
                           }
                       },
                       
                       error:function () {
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