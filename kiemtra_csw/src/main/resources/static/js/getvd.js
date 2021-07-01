$.ajax({
    contentType: 'application/json',
    url: "http://localhost:8080/",
    type: 'GET',
    dataType: "json",
    success: function(data) {
        $('.id').append(data.id);
        $('.content').append(data.name);
    },
    error: function(xhr, status, error) {
        alert("Something went wrong");
    }});