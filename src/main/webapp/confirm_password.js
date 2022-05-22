const password = document.getElementById("password"),
    confirm_password = document.getElementById("confirm_password");

function validatePassword(){
    if(password.value !== confirm_password.value) {
        confirm_password.setCustomValidity("Passwords Don't Match, Please Try Again");
    } else {
        confirm_password.setCustomValidity('');
    }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;