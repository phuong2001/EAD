$( document ).ready(function() {

    // GET REQUEST
    $("#getAllCustomerId").click(function(event){
        event.preventDefault();
        ajaxGet();
    });

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : window.location + "api/product",
            success: function(result){
                if(result.status == "Done"){
                    $('#getResultDiv ul').empty();
                    var custList = "";
                    $.each(result.data, function(i, product){
                        var customer = "Id = " + i + ", name = " + product.name + " , quantity = " + product.quality + ", price = " + product.price + "";
                        $('#getResultDiv .list-group').append(product)
                    });
                    console.log("Success: ", result);
                }else{
                    $("#getResultDiv").html("Error");
                    console.log("Fail: ", result);
                }
            },
            error : function(e) {
                $("#getResultDiv").html("Error");
                console.log("ERROR: ", e);
            }
        });
    }
})