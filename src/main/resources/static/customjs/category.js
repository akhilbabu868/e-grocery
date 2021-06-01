/**
 * 
 */
$(document).ready(function () {


/*    categoryDataTable = $("#categoryDataTable").dataTable();
    display();

    //FUNCTION FOR EDIT Datatable
    $("#categoryDataTable").on('click', '.edit', function (e) {
        
        e.preventDefault();
        $("body").scrollTop(0);
        nRow = $(this).parents('tr')[0];
        var id = $(this).attr('id');

        $.post("editCategoryMaster.do", {id: id}, function (data, status) {
            console.log("data" + data.category);
            console.log("ID" + data.id);
            console.log("status" + data.status);
            Id = data.id;
            name = data.category;
            Status = data.status;
            $("#categoryname").val(name);
            $('#HiddenID').val(Id);
            $('#statusHidden').val(Status);
           $('#stSave').val("Update");
        });
    });

*/


});

//save Category 

$('#savecategory').click(function() {

    alert("hiii");
      
	var Code = $('#categorycode').val();
	var Category = $('#category').val();
	var Description = $('#description').val();

	$.post("category/add",
		{
			categorycode:Code,
			category: Category,
			description:Description
		},
		function(data, status) {

			var Flag = data.flag;
			console.log("flag"+Flag);

		});

});



















