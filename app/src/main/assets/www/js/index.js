// Common functions
function id(element_id) {
    return document.getElementById(element_id);
}

function listener(element_id,action,callback) {
    if (id(element_id)) {
        id(element_id).addEventListener(action,callback);
    } else {
        console.log("Element does not exist in the HTML: " + element_id);
    }
}
function hide(element_id) {
    id(element_id).style.display = "none";
}
listener('success-dialog-ok','click',function(){
    hide('success-dialog');
});

listener('error-dialog-ok','click',function(){
    hide('error-dialog');
});
