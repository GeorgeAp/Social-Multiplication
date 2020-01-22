function updateMultiplication() {
    $.ajax({
        url: '/results',
        type: 'POST',
        data: JSON.stringify(data),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        async: false,
        success: function(result){
            if(result.correct) {
            $('.result-message').empty().append("The result is correct! Congratulations!");
            } else {
            $('.result-message').empty().append("Oops that's not correct! But keep trying!");
            }
        }
    });
}

$(document).ready(function() {

    updateMultiplication();

    $("#attempt-form").submit(function( event ) {

        // Don't submit the form normally
        event.preventDefault();

        // Get some values from elements on the page
        var a = $('.multiplication-a').text();
        var b = $('.multiplication-b').text();
        var $form = $( this ),
            attempt = $form.find( "input[name='result-attempt']" ).val(),
            userAlias = $form.find( "input[name='user-alias']" ).val();

        // Compose the data in the format that the API is expecting
        var data = { user: { alias: userAlias}, multiplication: {factorA: a, factorB: b}, resultAttempt: attempt};

        // Send the data using post
        $.ajax({
            url: '/results',
            type: 'POST',
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(result){
                if(result.correct) {
                    $('.result-message').empty().append("The result is correct! Congratulations!");
                } else {
                    $('.result-message').empty().append("Ooops that's not correct! But keep trying!");
                }
            }
        });

        updateMultiplication();
    });
});